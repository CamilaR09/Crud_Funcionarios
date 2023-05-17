-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-05-2023 a las 21:50:02
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `funcionariosbd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carreras`
--

CREATE TABLE `carreras` (
  `id` int(11) NOT NULL,
  `nombre_carreras` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `carreras`
--

INSERT INTO `carreras` (`id`, `nombre_carreras`) VALUES
(1, 'Seleccionar'),
(2, 'Administración de Empresas'),
(3, 'Arquitectura'),
(4, 'Auxiliar Administrativo'),
(5, 'Auxiliar del Veterinario'),
(6, 'Auxiliar de Farmacia'),
(7, 'Auxiliar de Odontología'),
(8, 'Administración de Odontología'),
(9, 'Bacteriología'),
(10, 'Diseño Gráfico y Publicitario'),
(11, 'Derecho'),
(12, 'Enfermería'),
(13, 'Fotografía Artística y Digital'),
(14, 'Finanzas'),
(15, 'Gatronomía'),
(16, 'Ingeniería Electrónica'),
(17, 'Ingeniería de Sistemas'),
(18, 'Ingeniería Industrial'),
(19, 'Ingeniería Civil'),
(20, 'Licenciaturas en Educación'),
(21, 'Ingeniería de Petróleos y Minas'),
(22, 'Mecánica Dental'),
(23, 'Medicina'),
(24, 'Pedagogía'),
(25, 'Sistemas y Tecnología'),
(26, 'Seguridad Ocupacional'),
(27, 'Sicología'),
(28, 'Trabajo Social'),
(29, 'Ventas y Mercadeo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estados_civil`
--

CREATE TABLE `estados_civil` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estados_civil`
--

INSERT INTO `estados_civil` (`id`, `nombre`) VALUES
(1, 'Seleccionar'),
(2, 'Soltero(a)'),
(3, 'Casado(a)'),
(4, 'Unión libre'),
(5, 'Viudo/a'),
(6, 'Otro Estado Civil');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estados_formacion`
--

CREATE TABLE `estados_formacion` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estados_formacion`
--

INSERT INTO `estados_formacion` (`id`, `nombre`) VALUES
(1, 'Seleccionar'),
(2, 'en proceso'),
(3, 'Finalizado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `formaciones_academicas`
--

CREATE TABLE `formaciones_academicas` (
  `id` int(11) NOT NULL,
  `universidades_id` int(11) NOT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_final` date DEFAULT NULL,
  `niveles_educativos_id` int(11) NOT NULL,
  `estados_formacion_id` int(11) NOT NULL,
  `carreras_id` int(11) NOT NULL,
  `funcionarios_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `funcionarios`
--

CREATE TABLE `funcionarios` (
  `id` int(11) NOT NULL,
  `tipos_identificacion_id` int(11) NOT NULL,
  `numero_identificacion` varchar(45) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `apellidop` varchar(45) NOT NULL,
  `apellidoM` varchar(45) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  `estados_civil_id` int(11) NOT NULL,
  `fechade_creacion` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `funcionarios`
--

INSERT INTO `funcionarios` (`id`, `tipos_identificacion_id`, `numero_identificacion`, `nombres`, `apellidop`, `apellidoM`, `fecha_nacimiento`, `direccion`, `telefono`, `sexo`, `estados_civil_id`, `fechade_creacion`) VALUES
(1, 4, '1006952475', 'Camila', 'Rendon', 'Pino', '2000-06-19', 'Crr 36 # 50 6', '3118526987', 'Femenino', 2, '2023-05-17 14:28:59');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo_familiares`
--

CREATE TABLE `grupo_familiares` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `direccionF` varchar(45) DEFAULT NULL,
  `parentescos_id` int(11) NOT NULL,
  `funcionarios_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `niveles_educativos`
--

CREATE TABLE `niveles_educativos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `niveles_educativos`
--

INSERT INTO `niveles_educativos` (`id`, `nombre`) VALUES
(1, 'Seleccionar'),
(2, 'Nivel Técnico Profesional'),
(3, 'Nivel Tecnológico'),
(4, 'Nivel Profesional'),
(5, 'Especializaciones'),
(6, 'Maestrías'),
(7, 'Doctorados');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parentescos`
--

CREATE TABLE `parentescos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `parentescos`
--

INSERT INTO `parentescos` (`id`, `nombre`) VALUES
(1, 'Seleccionar'),
(2, 'Hija(o)'),
(3, 'Madre'),
(4, 'Padre'),
(5, 'Hermana(o)'),
(6, 'Sobrina(o)'),
(7, 'Abuela(o)'),
(8, 'Tía(o)'),
(9, 'Prima(o)'),
(10, 'Suegra(o)'),
(11, 'Cuñada(o)');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_identificacion`
--

CREATE TABLE `tipos_identificacion` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipos_identificacion`
--

INSERT INTO `tipos_identificacion` (`id`, `nombre`) VALUES
(1, 'Seleccionar'),
(2, 'Registro Civi'),
(3, 'Tarjeta de Identidad'),
(4, 'Cédula de Ciudadanía'),
(5, 'Pasaporte'),
(6, 'Cedula de Extranjeria'),
(7, 'Otro Tipo de Identificación');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `universidades`
--

CREATE TABLE `universidades` (
  `id` int(11) NOT NULL,
  `nombre_institución` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `universidades`
--

INSERT INTO `universidades` (`id`, `nombre_institución`) VALUES
(1, 'Seleccionar'),
(2, 'Institución Universitaria Digital de Antioqui'),
(3, 'Institución Universitaria ITM'),
(4, 'Universidad de Antioquia'),
(5, 'Universidad Autónoma Latinoamericana'),
(6, 'Universidad Cooperativa de Colombia'),
(7, 'Universidad CES'),
(8, 'Universidad Católica Luis Amigó'),
(9, 'Universidad EAFIT'),
(10, 'Universidad de Medellín'),
(11, 'Universidad Pontificia Bolivariana'),
(12, 'Tecnológico de Antioquia'),
(13, 'Politécnico Colombiano Jaime Isaza Cadavid');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carreras`
--
ALTER TABLE `carreras`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `estados_civil`
--
ALTER TABLE `estados_civil`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `estados_formacion`
--
ALTER TABLE `estados_formacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `formaciones_academicas`
--
ALTER TABLE `formaciones_academicas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `universidades_id` (`universidades_id`),
  ADD KEY `niveles_educativos_id` (`niveles_educativos_id`),
  ADD KEY `estados_formacion_id` (`estados_formacion_id`),
  ADD KEY `carreras_id` (`carreras_id`),
  ADD KEY `funcionarios_id` (`funcionarios_id`);

--
-- Indices de la tabla `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `tipos_identificacion_id` (`tipos_identificacion_id`),
  ADD KEY `estados_civil_id` (`estados_civil_id`);

--
-- Indices de la tabla `grupo_familiares`
--
ALTER TABLE `grupo_familiares`
  ADD PRIMARY KEY (`id`),
  ADD KEY `funcionarios_id` (`funcionarios_id`),
  ADD KEY `parentescos_id` (`parentescos_id`);

--
-- Indices de la tabla `niveles_educativos`
--
ALTER TABLE `niveles_educativos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `parentescos`
--
ALTER TABLE `parentescos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipos_identificacion`
--
ALTER TABLE `tipos_identificacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `universidades`
--
ALTER TABLE `universidades`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `carreras`
--
ALTER TABLE `carreras`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT de la tabla `estados_civil`
--
ALTER TABLE `estados_civil`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `estados_formacion`
--
ALTER TABLE `estados_formacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `formaciones_academicas`
--
ALTER TABLE `formaciones_academicas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `funcionarios`
--
ALTER TABLE `funcionarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `grupo_familiares`
--
ALTER TABLE `grupo_familiares`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `niveles_educativos`
--
ALTER TABLE `niveles_educativos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `parentescos`
--
ALTER TABLE `parentescos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `tipos_identificacion`
--
ALTER TABLE `tipos_identificacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `universidades`
--
ALTER TABLE `universidades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `formaciones_academicas`
--
ALTER TABLE `formaciones_academicas`
  ADD CONSTRAINT `formaciones_academicas_ibfk_1` FOREIGN KEY (`universidades_id`) REFERENCES `universidades` (`id`),
  ADD CONSTRAINT `formaciones_academicas_ibfk_2` FOREIGN KEY (`niveles_educativos_id`) REFERENCES `niveles_educativos` (`id`),
  ADD CONSTRAINT `formaciones_academicas_ibfk_3` FOREIGN KEY (`estados_formacion_id`) REFERENCES `estados_formacion` (`id`),
  ADD CONSTRAINT `formaciones_academicas_ibfk_4` FOREIGN KEY (`carreras_id`) REFERENCES `carreras` (`id`),
  ADD CONSTRAINT `formaciones_academicas_ibfk_5` FOREIGN KEY (`funcionarios_id`) REFERENCES `funcionarios` (`id`);

--
-- Filtros para la tabla `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD CONSTRAINT `funcionarios_ibfk_1` FOREIGN KEY (`tipos_identificacion_id`) REFERENCES `tipos_identificacion` (`id`),
  ADD CONSTRAINT `funcionarios_ibfk_2` FOREIGN KEY (`estados_civil_id`) REFERENCES `estados_civil` (`id`);

--
-- Filtros para la tabla `grupo_familiares`
--
ALTER TABLE `grupo_familiares`
  ADD CONSTRAINT `grupo_familiares_ibfk_1` FOREIGN KEY (`funcionarios_id`) REFERENCES `funcionarios` (`id`),
  ADD CONSTRAINT `grupo_familiares_ibfk_2` FOREIGN KEY (`parentescos_id`) REFERENCES `parentescos` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
