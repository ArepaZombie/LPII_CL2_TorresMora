-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 29-10-2023 a las 05:50:35
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdtorresmoracl2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_productocl2`
--

CREATE TABLE IF NOT EXISTS `tbl_productocl2` (
  `IDPRODUCTO` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRECL2` varchar(255) DEFAULT NULL,
  `PRECIOVENTACL2` double DEFAULT NULL,
  `PRECIOCOMPRACL2` double DEFAULT NULL,
  `ESTADOCL2` varchar(255) DEFAULT NULL,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`IDPRODUCTO`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `tbl_productocl2`
--

INSERT INTO `tbl_productocl2` (`IDPRODUCTO`, `NOMBRECL2`, `PRECIOVENTACL2`, `PRECIOCOMPRACL2`, `ESTADOCL2`, `DESCRIPCION`) VALUES
(1, 'Arepas', 15, 10, 'vigente', 'Pan de harian de maiz molido'),
(2, 'Arepas', 15, 10, 'vigente', 'Pan de harian de maiz molido'),
(3, 'Atun', 21, 12, 'vigente', 'Un pececito'),
(4, 'Espada', 1000, 10000, 'sin stock', 'Wtf una espada?');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_usuariocl2`
--

CREATE TABLE IF NOT EXISTS `tbl_usuariocl2` (
  `idusuariocl2` int(11) NOT NULL AUTO_INCREMENT,
  `usuariocl2` varchar(255) DEFAULT NULL,
  `passwordcl2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idusuariocl2`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `tbl_usuariocl2`
--

INSERT INTO `tbl_usuariocl2` (`idusuariocl2`, `usuariocl2`, `passwordcl2`) VALUES
(1, 'admin', '123');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
