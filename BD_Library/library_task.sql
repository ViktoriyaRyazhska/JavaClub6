drop database if exists `library_task`;
CREATE SCHEMA IF NOT EXISTS `library_task` DEFAULT CHARACTER SET utf8 ;
USE `library_task` ;

-- -----------------------------------------------------
-- Table `library_task`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_task`.`role` (
  `id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `role` VARCHAR(45) NULL)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `library_task`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_task`.`user` (
  `id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `surname` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  `date_registr` DATETIME NULL DEFAULT NULL,
  `birthday` DATE NULL DEFAULT NULL,
  `role` INT NOT NULL,
  INDEX `fk_user_role1_idx` (`role` ASC) VISIBLE,
  CONSTRAINT `fk_user_role1`
    FOREIGN KEY (`role`)
    REFERENCES `library_task`.`role` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `library_task`.`book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_task`.`book` (
  `id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `title` VARCHAR(45) NULL DEFAULT NULL,
  `genre` VARCHAR(45) NULL DEFAULT NULL,
  `copies` INT NULL DEFAULT NULL)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `library_task`.`author`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_task`.`author` (
  `id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `surname` VARCHAR(45) NULL)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `library_task`.`book_authors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_task`.`book_authors` (
  `is_main` boolean NULL,
  `book_id` INT NOT NULL,
  `author_id` INT NOT NULL,
  PRIMARY KEY (`book_id`, `author_id`),
  INDEX `fk_book_authors_book1_idx` (`book_id` ASC) VISIBLE,
  INDEX `fk_book_authors_author1_idx` (`author_id` ASC) VISIBLE,
  CONSTRAINT `fk_book_authors_book1`
    FOREIGN KEY (`book_id`)
    REFERENCES `library_task`.`book` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_book_authors_author1`
    FOREIGN KEY (`author_id`)
    REFERENCES `library_task`.`author` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `library_task`.`request`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_task`.`request` (
  `id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `first_day` DATETIME NULL DEFAULT NULL,
  `last_day` DATETIME NULL DEFAULT NULL,
  `date_return` DATETIME NULL DEFAULT NULL,
  `user_id` INT NOT NULL,
  `book_id` INT NOT NULL,
  INDEX `fk_request_user1_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_request_book1_idx` (`book_id` ASC) VISIBLE,
  CONSTRAINT `fk_request_book1`
    FOREIGN KEY (`book_id`)
    REFERENCES `library_task`.`book` (`id`),
  CONSTRAINT `fk_request_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `library_task`.`user` (`id`))
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
-- Get information about all books
-- -----------------------------------------------------
SELECT b.*,
CONCAT(a.name, ' ', a.surname) as Author,
CONCAT(a.name, ' ', a.surname) as CoAuthor  -- не знаю як повернути CoAuthor
      FROM author a 
      join book_authors ba on ba.author_id = a.id
      join book b on ba.book_id = b.id
     WHERE ba.is_main is true;
  
  
    SELECT b.*,
    CONCAT(a.name, ' ', a.surname) as CoAuthor
      FROM author a 
      join book_authors ba on ba.author_id = a.id
      join book b on ba.book_id = b.id
     WHERE ba.is_main is not true 
     order by b.id;

     

-- -----------------------------------------------------
-- Check if needed book is available
-- -----------------------------------------------------
select title, copies,
  case when copies = 0 
    then 'unavailable'
    else 'available'
  end Availability
from book 
where title='Title4';


-- -----------------------------------------------------
-- Find books by author (main author, co-author)            TODO
-- -----------------------------------------------------
SET @m_autor = 'author1';
Select * From book where m_autor like CONCAT('%', @m_autor, '%');

SET @m_co_autor = 'Co_author1';
Select * From book where co_autor like CONCAT('%', @m_co_autor, '%');


-- -----------------------------------------------------
-- Find book by title          TODO
-- -----------------------------------------------------


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
-- Return book         TODO
-- -----------------------------------------------------


-- -----------------------------------------------------
-- Get his/her statistics (how many and how long books were been read, reading now)
-- -----------------------------------------------------
Select tbl.name, 
		Sum(counter) as books, 
        sum(days_read) as days_read,
        sum(days_reading) as days_reading
From        
(Select 1 as counter, CONCAT(u.name, ' ', u.surname) as name, 
DATEDIFF(r.date_return, r.first_day) as days_read, 
DATEDIFF((IF( r.date_return IS NULL,now(),null)), r.first_day) as days_reading,
r.date_return
 From user as u left outer join 
request as r on u.id = r.user_id) as tbl group by tbl.name, tbl.date_return;


-- -----------------------------------------------------
-- Register book with copies        TODO
-- -----------------------------------------------------


-- -----------------------------------------------------
-- Update book’ information
-- -----------------------------------------------------
UPDATE book , book_authors
SET book.title='TitleUpdate',  book.genre='genre6', book.copies = 9, 
book_authors.author_id = (CASE book_authors.is_main WHEN true THEN 3
													WHEN false THEN 4  END)
WHERE book.id = book_authors.book_id AND book.id in (3);


-- -----------------------------------------------------
-- Delete One copy/Book with all copies             TODO
-- -----------------------------------------------------
update book set  copies = 7  where id in (3);
DELETE FROM book WHERE id in (2);
select * from book;

-- -----------------------------------------------------
-- Give book to Reader
-- -----------------------------------------------------
SET @id = 4;
SET @book_id = 1;
SET @first_day = '01.02.2022';
SET @last_day = '01.09.2022';
SET @user_id = 1;

INSERT INTO  request (id, first_day, last_day, user_id, book_id) 
select request_id, first_day, last_day, user_id, tbl2.book_id
from ( 
		select 
		@id as request_id,
        @first_day as first_day, 
        @last_day as last_day,
        @user_id as user_id,
        copies - Sum(not_returned) as copies, book_id
		from(
			Select  1 as not_returned, book_id 
			from request as r 
			where r.book_id = @book_id 
			and r.date_return is null
		) as tbl right outer join book as b on b.id = tbl.book_id where b.id = @book_id 
		group by book_id
	) as tbl2 where copies > 0 ;



-- -----------------------------------------------------
-- Set title of book and display count of this Book’ copies 
-- with information about them (available/unavailable in Library)     TODO
-- -----------------------------------------------------


-- -----------------------------------------------------
-- Get statistics by Reader (books which this user has read, is reading, 
-- how long he is our client)
-- -----------------------------------------------------
SET @AlreadyRead = (SELECT count(r.id)
     FROM request r
     join user u on r.user_id = u.id
     WHERE r.date_return is  not null and u.name = 'Name4' );  

SET @isReading = (SELECT count(r.id)
     FROM request r
     join user u on r.user_id = u.id
     WHERE r.date_return is null and u.name = 'Name4');
     
     
SELECT CONCAT(u.name, '  ', u.surname) as User,
    PERIOD_DIFF(date_format(now(),'%Y%m'), date_format(date_registr,'%Y%m'))  as Month,
    count(r.id) as AllRequest,
    count(r.id) - @isReading as AlreadyRead,
	count(r.id) - @AlreadyRead as isReading
FROM  request r
join user u on r.user_id = u.id
join book b on r.book_id = b.id
where u.name = 'Name4';


SELECT CONCAT(u.name, '  ', u.surname) as User,
    b.title as isReading
FROM  request r
join user u on r.user_id = u.id
join book b on r.book_id = b.id
where u.name = 'Name4' and r.date_return is null;

SELECT CONCAT(u.name, '  ', u.surname) as User,
    b.title as AlreadyRead
FROM  request r
join user u on r.user_id = u.id
join book b on r.book_id = b.id
where u.name = 'Name4' and r.date_return is not null;



-- -----------------------------------------------------
-- Get statistics by Book (general, by copies, average time of reading)   TODO
-- -----------------------------------------------------


-- ----------------------------------------------------------------------------------------
-- Get statistics by Readers (average age, time of working with Library,
-- average number of requests to Library in selected period)
-- ----------------------------------------------------------------------------------------
Select
avg(YEAR(now()) - YEAR(u.birthday)
    - (DATE_FORMAT(now(), '%m%d') < DATE_FORMAT(u.birthday, '%m%d'))) as avg_age
From user as u;
     
Select
id,
CONCAT(u.name, ' ', u.surname) as name, 
  YEAR(now()) - YEAR(u.date_registr) 
	- (DATE_FORMAT(now(), '%m%d') < DATE_FORMAT(u.date_registr, '%m%d')) as  timework
From user as u;
		
        
SET @user_id = 1;
SET @dDateFrom = '01.01.2022';
SET @dDateTo = '01.09.2023';

select avg(requests) as avg_requests_count,
dDateFrom, dDateTo
From (
	Select sum(counter) as requests,
	dDateFrom, dDateTo, user_id
	from (
		select
		1 as counter, 
		@dDateFrom as dDateFrom,
		@dDateTo as dDateTo,
		user_id
		from request
		where first_day >= @dDateFrom and (last_day <= @dDateTo  or (date_return <= @dDateTo or date_return = null))
	  ) as tbl 
) as tbl2;


-- -----------------------------------------------------
-- Get list of users who has not returned book in time 
-- with detailed information about them                       TODO
-- -----------------------------------------------------


-- -----------------------------------------------------
-- How many books were giving in selected period?
-- -----------------------------------------------------
SELECT
   count(b.id)  as Giving
FROM  request r
join book b on r.book_id = b.id
where r.first_day between '2022-01-01 00:00:00' and now();




-- ////////////////////////////////////////////////////////////////////////////
select * from author;
select * from book_authors;
select * from book;
select * from user;
select * from request;

