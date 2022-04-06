CREATE SCHEMA IF NOT EXISTS `library_task` DEFAULT CHARACTER SET utf8 ;
USE `library_task` ;

-- -----------------------------------------------------
-- Table `library_task`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_task`.`user` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `surname` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `date_registr` DATETIME NULL,
  `birthday` DATE NULL,
  `role` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `library_task`.`book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_task`.`book` (
  `id` INT NOT NULL,
  `title` VARCHAR(45) NULL,
  `m_autor` VARCHAR(45) NULL,
  `co_autor` VARCHAR(45) NULL,
  `genre` VARCHAR(45) NULL,
  `copies` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `library_task`.`request`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_task`.`request` (
  `id` INT NOT NULL,
  `first_day` DATETIME NULL,
  `last_day` DATETIME NULL,
  `date_return` DATETIME NULL,
  `user_id` INT NOT NULL,
  `book_id` INT NOT NULL,
  PRIMARY KEY (`id`),
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

select * from user;
select * from book;
select * from request;