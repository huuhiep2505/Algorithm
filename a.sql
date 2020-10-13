-- MySQL Script generated by MySQL Workbench
-- Wed Oct 14 03:35:31 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema algorithmdemo
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema algorithmdemo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `algorithmdemo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `algorithmdemo` ;

-- -----------------------------------------------------
-- Table `algorithmdemo`.`constrainst`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `algorithmdemo`.`constrainst` (
  `name` VARCHAR(50) NOT NULL,
  `ishard` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`name`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `algorithmdemo`.`schedule`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `algorithmdemo`.`schedule` (
  `username` VARCHAR(50) NOT NULL,
  `start` TIME NULL DEFAULT NULL,
  `end` TIME NULL DEFAULT NULL,
  `dayofweek` INT NULL DEFAULT NULL,
  `id` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 23
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `algorithmdemo`.`workingplan`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `algorithmdemo`.`workingplan` (
  `username` VARCHAR(50) NOT NULL,
  `monday` TINYINT NULL DEFAULT NULL,
  `tuesday` TINYINT NULL DEFAULT NULL,
  `wednesday` TINYINT NULL DEFAULT NULL,
  `thursday` TINYINT NULL DEFAULT NULL,
  `friday` TINYINT NULL DEFAULT NULL,
  `saturday` TINYINT NULL DEFAULT NULL,
  `sunday` TINYINT NULL DEFAULT NULL,
  `language` VARCHAR(45) NULL DEFAULT NULL,
  `numDay` INT NULL DEFAULT NULL,
  `numWeek` INT NULL DEFAULT NULL,
  PRIMARY KEY (`username`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci
COMMENT = '		';


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;