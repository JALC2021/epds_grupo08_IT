--
-- Base de datos: `almacen`
--
CREATE DATABASE IF NOT EXISTS `almacen` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `almacen`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `id` int(11) NOT NULL,
  `autor` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `titulo` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `precio` float NOT NULL,
  `isbn` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`id`, `autor`, `titulo`, `precio`, `isbn`) VALUES
(1, 'Arturo Pérez Reverte', 'El Capitán Alatriste', 10, 101),
(2, 'Neil Gaiman', 'Humos y Espejos', 12, 102),
(3, 'Lewis Carrol', 'Alicia en el País de las Maravillas', 15, 103),
(4, 'Philip K. Dick', 'Cuentos Completos I', 14.5, 104),
(5, 'H. P. Lovecraft', 'La Llamada de Cthulhu', 11, 105),
(6, 'Arturo Pérez Reverte', 'La Piel del Tambor', 18, 106),
(7, 'Eduardo Punset', 'El Viaje a la Felicidad', 13.5, 107),
(8, 'Juan Pérez Mercader', '¿Qué Sabemos del Universo?', 11.5, 108);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`id`);
