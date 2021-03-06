-- MySQL Script generated by MySQL Workbench
-- Mon Oct 30 18:47:34 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Empresa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Empresa` (
  `id` VARCHAR(20) NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Localizacion` VARCHAR(45) NOT NULL,
  `Correo` VARCHAR(45) NOT NULL,
  `Telefono` VARCHAR(45) NOT NULL,
  `Descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Caracteristicas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Caracteristicas` (
  `id` VARCHAR(20) NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Nivel` VARCHAR(45) NOT NULL,
  `Lenguaje1` VARCHAR(45) NOT NULL,
  `lenguaje2` VARCHAR(45) NOT NULL,
  `Lenguaje3` VARCHAR(45) NOT NULL,
  `Tecnologia1` VARCHAR(45) NOT NULL,
  `Tecnologia2` VARCHAR(45) NOT NULL,
  `Tecnologia3` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Oferente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Oferente` (
  `id` VARCHAR(20) NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Nacionalidad` VARCHAR(45) NOT NULL,
  `Telefono` VARCHAR(45) NOT NULL,
  `Direccion` VARCHAR(45) NOT NULL,
  `Correo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Puesto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Puesto` (
  `id` VARCHAR(20) NOT NULL,
  `NombrePuesto` VARCHAR(45) NOT NULL,
  `Salario` VARCHAR(45) NOT NULL,
  `Tipo` VARCHAR(45) NOT NULL,
  `Empresa_id` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Puesto_Empresa1`
    FOREIGN KEY (`Empresa_id`)
    REFERENCES `mydb`.`Empresa` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Puesto_Empresa1_idx` ON `mydb`.`Puesto` (`Empresa_id` ASC);


-- -----------------------------------------------------
-- Table `mydb`.`Empresa_has_Caracteristicas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Empresa_has_Caracteristicas` (
  `Caracteristicas_id` VARCHAR(20) NOT NULL,
  `nivel` VARCHAR(45) NOT NULL,
  `Puesto_id` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`Caracteristicas_id`),
  CONSTRAINT `fk_Empresa_has_Caracteristicas_Caracteristicas1`
    FOREIGN KEY (`Caracteristicas_id`)
    REFERENCES `mydb`.`Caracteristicas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Empresa_has_Caracteristicas_Puesto1`
    FOREIGN KEY (`Puesto_id`)
    REFERENCES `mydb`.`Puesto` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Empresa_has_Caracteristicas_Caracteristicas1_idx` ON `mydb`.`Empresa_has_Caracteristicas` (`Caracteristicas_id` ASC);

CREATE INDEX `fk_Empresa_has_Caracteristicas_Puesto1_idx` ON `mydb`.`Empresa_has_Caracteristicas` (`Puesto_id` ASC);


-- -----------------------------------------------------
-- Table `mydb`.`Caracteristicas_has_Oferente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Caracteristicas_has_Oferente` (
  `Caracteristicas_id` VARCHAR(20) NOT NULL,
  `Oferente_id` NVARCHAR(20) NOT NULL,
  `nivel` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Caracteristicas_id`),
  CONSTRAINT `fk_Caracteristicas_has_Oferente_Caracteristicas1`
    FOREIGN KEY (`Caracteristicas_id`)
    REFERENCES `mydb`.`Caracteristicas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Caracteristicas_has_Oferente_Oferente1`
    FOREIGN KEY (`Oferente_id`)
    REFERENCES `mydb`.`Oferente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Caracteristicas_has_Oferente_Oferente1_idx` ON `mydb`.`Caracteristicas_has_Oferente` (`Oferente_id` ASC);

CREATE INDEX `fk_Caracteristicas_has_Oferente_Caracteristicas1_idx` ON `mydb`.`Caracteristicas_has_Oferente` (`Caracteristicas_id` ASC);


-- -----------------------------------------------------
-- Table `mydb`.`Admin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Admin` (
  `id` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `mydb`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `id` VARCHAR(20) NOT NULL,
  `Clave` VARCHAR(20) NOT NULL,
  `tipo` INT(11) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;
alter table `Oferente`
  add constraint foreign key (`id`) references  `Usuario` (`id`);
  alter table `Empresa`
  add constraint foreign key (`id`) references  `Usuario` (`id`);
  alter table `Admin`
  add constraint foreign key (`id`) references  `Usuario` (`id`);

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
Describe Oferente;

DELIMITER //

CREATE PROCEDURE insertOferente(
IN  `_id` VARCHAR(20),
  `_Nombre` VARCHAR(45),
  `_Apellido` VARCHAR(45),
  `_Nacionalidad` VARCHAR(45),
  `_Telefono` VARCHAR(45),
  `_Direccion` VARCHAR(45),
  `_Correo` VARCHAR(45)
  
) BEGIN

END
//DELIMITER ;
insert into Usuario (id,clave,tipo) values ('001','00ADDAD1', 1);
insert into Usuario (id,clave,tipo) values ('002','00ADFDAFFDA2', 1);
insert into Usuario (id,clave,tipo) values ('003','00ADFADFF3', 2);
insert into Usuario (id,clave,tipo) values ('1','00AFDDADFAFAF3', 2);


insert into Empresa (id,Nombre,Localizacion,Correo,Telefono,Descripcion) values ('1',"Amazon", "Calle Blancos", "Amazon@jobs.com","5555555","Servicios Web");
insert into Empresa (id,Nombre,Localizacion,Correo,Telefono,Descripcion) values ('003',"Intel", "Heredia", "intel@jobs.com","5555555","Soporte Tecnico");
insert into Empresa (id,Nombre,Localizacion,Correo,Telefono,Descripcion) values ('001',"NetCom", "Heredia", "NetCom@jobs.com","5555555","Diseñador");

insert into Puesto (id,NombrePuesto,Salario,Tipo,Empresa_id) values ('1',"Programador", "100000", "Publico","1");
insert into Puesto (id,NombrePuesto,Salario,Tipo,Empresa_id) values ('2',"Diseñador", "70000", "Publico","1");
insert into Puesto (id,NombrePuesto,Salario,Tipo,Empresa_id) values ('3',"Soportista", "3000", "Publico","001");

















