
CREATE DATABASE IF NOT EXISTS FuncionariosBD;

USE FuncionariosBD;

/*Creacion de Tablas*/
--------------------------------------------------------------------------------
/*Table tipos_identificacion*/
CREATE TABLE tipos_identificacion(
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
--------------------------------------------------------------------------------
/*Table estados_civil*/
CREATE TABLE estados_civil(
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
--------------------------------------------------------------------------------
/* Table funcionarios*/
CREATE TABLE funcionarios(
  id INT NOT NULL AUTO_INCREMENT,
tipos_identificacion_id INT NOT NULL,
  numero_identificacion VARCHAR(45) NOT NULL,
  nombres VARCHAR(45) NOT NULL,
  apellidop VARCHAR(45) NOT NULL,
  apellidoM VARCHAR(45) NOT NULL,
  fecha_nacimiento DATE NOT NULL,
  direccion VARCHAR(45) NOT NULL,
  telefono VARCHAR(45) NOT NULL,
  sexo VARCHAR(45) NOT NULL,
estados_civil_id INT NOT NULL,
  fechade_creacion DATETIME DEFAULT NOW(),
  PRIMARY KEY (`id`),
  FOREIGN KEY (tipos_identificacion_id) REFERENCES tipos_identificacion(id),
  FOREIGN KEY (estados_civil_id) REFERENCES estados_civil(id));
--------------------------------------------------------------------------------
/*Table universidades*/
CREATE TABLE universidades(
  id INT NOT NULL AUTO_INCREMENT,
  nombre_institución VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
--------------------------------------------------------------------------------
/*Table estados_formacion*/
CREATE TABLE estados_formacion(
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
--------------------------------------------------------------------------------
/*Table niveles_educativos*/
CREATE TABLE niveles_educativos(
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
--------------------------------------------------------------------------------
/*Table carreras*/
CREATE TABLE carreras (
  id INT NOT NULL AUTO_INCREMENT,
  nombre_carreras VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
--------------------------------------------------------------------------------
/*Table formaciones_academicas*/
CREATE TABLE formaciones_academicas(
  id INT NOT NULL AUTO_INCREMENT,
  universidades_id INT NOT NULL,
  fecha_inicio DATE NULL,
  fecha_final DATE NULL,
  niveles_educativos_id INT NOT NULL,
  estados_formacion_id INT NOT NULL,
  carreras_id INT NOT NULL,
  funcionarios_id INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (universidades_id)REFERENCES universidades(id),
  FOREIGN KEY (niveles_educativos_id)REFERENCES niveles_educativos (id),
  FOREIGN KEY (estados_formacion_id)REFERENCES estados_formacion (id),
  FOREIGN KEY (carreras_id)REFERENCES carreras(id),
  FOREIGN KEY (funcionarios_id)REFERENCES funcionarios (id));
--------------------------------------------------------------------------------
/*Table parentescos*/
CREATE TABLE parentescos(
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
--------------------------------------------------------------------------------
/*Table grupo_familiares*/
CREATE TABLE grupo_familiares (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NULL,
  apellido VARCHAR(45) NULL,
  direccionF VARCHAR(45) NULL,
  parentescos_id INT NOT NULL,
  funcionarios_id INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (funcionarios_id)REFERENCES funcionarios (id),
  FOREIGN KEY (parentescos_id)REFERENCES parentescos(id));
--------------------------------------------------------------------------------

