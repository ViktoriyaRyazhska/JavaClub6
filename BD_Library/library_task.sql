drop database if exists `library_task`;
CREATE SCHEMA IF NOT EXISTS `library_task` DEFAULT CHARACTER SET utf8 ;
USE `library_task` ;

-- -----------------------------------------------------
-- Table `library_task`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_task`.`user` (
  `id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT ,
  `name` VARCHAR(45) NULL,
  `surname` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `date_registr` DATETIME NULL,
  `birthday` DATE NULL,
  `role` VARCHAR(45) NULL)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `library_task`.`book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_task`.`book` (
  `id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `title` VARCHAR(45) NULL,
  `m_autor` VARCHAR(45) NULL,
  `co_autor` VARCHAR(45) NULL,
  `genre` VARCHAR(45) NULL,
  `copies` INT NULL)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `library_task`.`request`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_task`.`request` (
  `id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `first_day` DATETIME NULL,
  `last_day` DATETIME NULL,
  `date_return` DATETIME NULL,
  `user_id` INT NOT NULL,
  `book_id` INT NOT NULL,
  INDEX `fk_request_user1_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_request_book1_idx` (`book_id` ASC) VISIBLE,
  CONSTRAINT `fk_request_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `library_task`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_request_book1`
    FOREIGN KEY (`book_id`)
    REFERENCES `library_task`.`book` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `library_task`.`notification`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_task`.`notification` (
  `messages_text` LONGTEXT NULL,
  `date_send` DATETIME NULL,
  `id_user_send` INT NOT NULL,
  `id_user_received` INT NOT NULL,
  PRIMARY KEY (`id_user_send`, `id_user_received`),
  INDEX `fk_notification_user_idx` (`id_user_send` ASC) VISIBLE,
  INDEX `fk_notification_user1_idx` (`id_user_received` ASC) VISIBLE,
  CONSTRAINT `fk_notification_user`
    FOREIGN KEY (`id_user_send`)
    REFERENCES `library_task`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_notification_user1`
    FOREIGN KEY (`id_user_received`)
    REFERENCES `library_task`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Random data for testing
-- -----------------------------------------------------
INSERT INTO user (name, surname, email, password, date_registr, birthday, role) VALUES 
('Name1', 'Surname1', 'email_1@email.com','12345678','2022-02-16 00:00:00', '2000-10-10','ROLE_ADMIN'), 
('Name2', 'Surname2', 'email_2@email.com','12345687','2017-12-10 00:00:00', '2001-01-01','ROLE_USER'),
('Name3', 'Surname3', 'email_3@email.com','21345687','2018-08-09 00:00:00', '1999-04-02','ROLE_USER'),
('Name4', 'Surname4', 'email_4@email.com','12435687','2021-04-04 00:00:00', '1999-11-11','ROLE_USER'),
('Name5', 'Surname5', 'email_5@email.com','12354687','2021-06-03 00:00:00', '2001-08-09','ROLE_USER'),
('Name6', 'Surname6', 'email_6@email.com','12346587','2022-11-10 00:00:00', '2001-03-31','ROLE_USER');

INSERT INTO book (title, m_autor, co_autor, genre, copies) VALUES 
('Title1', 'Autor1', 'Co_autor1','genre1',5), 
('Title2', 'Autor2', 'Co_autor2','genre1',1),
('Title3', 'Autor1', 'Co_autor1','genre2',8),
('Title4', 'Autor3', 'Co_autor3','genre2',100),
('Title5', 'Autor3', 'Co_autor3','genre3',345),
('Title6', 'Autor2', 'Co_autor1','genre1',0);

INSERT INTO request (first_day, last_day, date_return, user_id, book_id) VALUES 
('2022-01-01 00:00:00', DATE_ADD(NOW(), INTERVAL 14 DAY), '0000-00-00 00:00:00', 1, 5),
('2022-03-03 00:00:00', DATE_ADD(NOW(), INTERVAL 14 DAY), '2022-03-14 00:00:00', 1, 4),
('2022-08-09 00:00:00', DATE_ADD(NOW(), INTERVAL 14 DAY), '2022-08-29 00:00:00', 1, 1),
('2022-11-11 00:00:00', DATE_ADD(NOW(), INTERVAL 14 DAY), '2022-11-20 00:00:00', 2, 5),
('2022-12-31 00:00:00', DATE_ADD(NOW(), INTERVAL 14 DAY), '0000-00-00 00:00:00', 3, 5);
-- -----------------------------------------------------
-- Random data for testing
-- -----------------------------------------------------




-- -----------------------------------------------------
-- Get information about all books
-- -----------------------------------------------------
select * from book;


-- -----------------------------------------------------
-- Check if needed book is available
-- -----------------------------------------------------
select title, copies from book
where copies > 0;

-- -------------- or

select title, copies from book
where title='Title6' and copies > 0 ;



-- -----------------------------------------------------
-- Get the most popular and the most unpopular books in selected period
-- -----------------------------------------------------

SELECT
	b.title  as Popular,
    COUNT(b.title) AS CountRequest
FROM  request r
JOIN  book b on r.book_id = b.id
WHERE  r.first_day between '2022-01-01 00:00:00' and '2023-01-01 00:00:00' 
GROUP BY b.title
ORDER BY Popular DESC
LIMIT    1;

SELECT
	b.title  as Unpopular,
    COUNT(b.title) AS CountRequest
FROM  request r
JOIN  book b on r.book_id = b.id
WHERE  r.first_day between '2022-01-01 00:00:00' and '2023-01-01 00:00:00' 
GROUP BY b.title
ORDER BY Unpopular ASC
LIMIT    1;



-- -----------------------------------------------------
-- Update book’ information
-- -----------------------------------------------------
update book set title='TitleUpdate', m_autor='Autor3', co_autor='Co_autor3', genre='genre6', copies = 9  where id in (3);




-- -----------------------------------------------------
-- Delete One copy/Book with all copies
-- -----------------------------------------------------
update book set  copies = 7  where id in (3);
DELETE FROM book WHERE id in (4);
select * from book;



-- -----------------------------------------------------
-- Get statistics by Reader (books which this user has read, is reading, how long he is our client)
-- -----------------------------------------------------
SELECT
    u.name,
    u.surname,
    PERIOD_DIFF(date_format(now(),'%Y%m'), date_format(date_registr,'%Y%m'))  as Month,
    count(r.id) as AllRequest,
    count(r.id) - (SELECT count(r.id)
     FROM request r
     join user u on r.user_id = u.id
     WHERE r.date_return = '0000-00-00 00:00:00' and u.name = 'Name1') as AlreadyRead,
	count(r.id) - (SELECT count(r.id)
     FROM request r
     join user u on r.user_id = u.id
     WHERE r.date_return != '0000-00-00 00:00:00' and u.name = 'Name1' ) as isReading
FROM  request r
join user u on r.user_id = u.id
join book b on r.book_id = b.id
where u.name = 'Name1';

SELECT
    u.name,
    u.surname,
    b.title as isReading
FROM  request r
join user u on r.user_id = u.id
join book b on r.book_id = b.id
where u.name = 'Name1' and r.date_return = '0000-00-00 00:00:00';

SELECT
    u.name,
    u.surname,
    b.title as AlreadyRead
FROM  request r
join user u on r.user_id = u.id
join book b on r.book_id = b.id
where u.name = 'Name1' and r.date_return != '0000-00-00 00:00:00';


-- -----------------------------------------------------
-- How many books were giving in selected period?
-- -----------------------------------------------------
SELECT
   count(b.id)  as Giving
FROM  request r
join book b on r.book_id = b.id
where r.first_day between '2022-01-01 00:00:00' and now();


select * from user;
select * from request;