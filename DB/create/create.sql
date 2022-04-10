CREATE SCHEMA IF NOT EXISTS `ubd01_javaclub6` DEFAULT CHARACTER SET utf8 ;
USE `ubd01_javaclub6` ;

CREATE TABLE IF NOT EXISTS `ubd01_javaclub6`.`book` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(255) NOT NULL,
  `deploy_date` DATE NOT NULL,
  `copy_number` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `ubd01_javaclub6`.`user_role` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `ubd01_javaclub6`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `surname` VARCHAR(255) NOT NULL,
  `registration_date` DATE NOT NULL,
  `birth_date` DATE NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `password` CHAR(60) NOT NULL,
  `fk_role` INT NOT NULL,
  PRIMARY KEY (`id`, `fk_role`),
  UNIQUE INDEX `id_user_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_User_User_Role1_idx` (`fk_role` ASC) VISIBLE,
  CONSTRAINT `fk_User_User_Role1`
    FOREIGN KEY (`fk_role`)
    REFERENCES `ubd01_javaclub6`.`user_role` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



CREATE TABLE IF NOT EXISTS `ubd01_javaclub6`.`request_status` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;



CREATE TABLE IF NOT EXISTS `ubd01_javaclub6`.`user_book` (
  `fk_user` INT NOT NULL,
  `fk_book` INT NOT NULL,
  `fk_status` INT NOT NULL,
  `return_date` DATE NULL,
  `rent_date` DATE NOT NULL,
  `should_return_date` DATE NOT NULL,
  PRIMARY KEY (`fk_user`, `fk_book`, `fk_status`),
  INDEX `fk_User_has_Book_Book1_idx` (`fk_book` ASC) VISIBLE,
  INDEX `fk_User_has_Book_User_idx` (`fk_user` ASC) VISIBLE,
  INDEX `fk_User_Book_Request_Status1_idx` (`fk_status` ASC) VISIBLE,
  CONSTRAINT `fk_User_has_Book_User`
    FOREIGN KEY (`fk_user`)
    REFERENCES `ubd01_javaclub6`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_User_has_Book_Book1`
    FOREIGN KEY (`fk_book`)
    REFERENCES `ubd01_javaclub6`.`book` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_User_Book_Request_Status1`
    FOREIGN KEY (`fk_status`)
    REFERENCES `ubd01_javaclub6`.`request_status` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `ubd01_javaclub6`.`author` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `surname` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;



CREATE TABLE IF NOT EXISTS `ubd01_javaclub6`.`author_book` (
  `fk_author` INT NOT NULL,
  `fk_book` INT NOT NULL,
  `status` BIT NOT NULL,
  PRIMARY KEY (`fk_author`, `fk_book`),
  INDEX `fk_Author_has_Book_Book1_idx` (`fk_book` ASC) VISIBLE,
  INDEX `fk_Author_has_Book_Author1_idx` (`fk_author` ASC) VISIBLE,
  CONSTRAINT `fk_Author_has_Book_Author1`
    FOREIGN KEY (`fk_author`)
    REFERENCES `ubd01_javaclub6`.`author` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Author_has_Book_Book1`
    FOREIGN KEY (`fk_book`)
    REFERENCES `ubd01_javaclub6`.`book` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;