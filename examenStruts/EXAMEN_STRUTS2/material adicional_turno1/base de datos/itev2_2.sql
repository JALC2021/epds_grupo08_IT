-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `itev2_2`
--
CREATE DATABASE IF NOT EXISTS `itev2_2` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `itev2_2`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservaanimales`
--

DROP TABLE IF EXISTS `reservaanimales`;
CREATE TABLE `reservaanimales` (
  `id` int(10) UNSIGNED NOT NULL,
  `identificador` varchar(8) NOT NULL,
  `tipo_animal` varchar(30) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `pais` varchar(30) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `precio` int(8) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reservaanimales`
--

INSERT INTO `reservaanimales` (`id`, `identificador`, `tipo_animal`, `pais`, `precio`, `email`) VALUES
(1, 'ARDG1234', 'lobo', 'rusia', 100000, 'rusia@putin.ru'),
(2, 'ERTY8795', 'tigre', 'tailandia', 200000, 'tailandia@reserve.ta'),
(3, 'OPER5632', 'jirafa', 'kenia', 300000, 'kenia@reserve.kn'),
(4, 'AWER4587', 'elefante', 'zimbabue', 489500, 'zimbabue@reserve.zm'),
(5, 'LLKK5545', 'lobo', 'Francia', 1000000, 'france@reserve.fr');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoanimal`
--

DROP TABLE IF EXISTS `tipoanimal`;
CREATE TABLE `tipoanimal` (
  `id` int(10) UNSIGNED NOT NULL,
  `animal` varchar(30) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipoanimal`
--

INSERT INTO `tipoanimal` (`id`, `animal`) VALUES
(1, 'lobo'),
(2, 'tigre'),
(3, 'jirafa'),
(4, 'elefante');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `reservaanimales`
--
ALTER TABLE `reservaanimales`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipoanimal`
--
ALTER TABLE `tipoanimal`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `reservaanimales`
--
ALTER TABLE `reservaanimales`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `tipoanimal`
--
ALTER TABLE `tipoanimal`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Restricciones para tablas volcadas
--

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
