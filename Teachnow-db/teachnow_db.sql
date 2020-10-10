-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-08-2020 a las 23:01:49
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `teachnow_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acercademi`
--

CREATE TABLE `acercademi` (
  `id` int(11) NOT NULL,
  `area` varchar(255) DEFAULT NULL,
  `quiensoy` varchar(500) DEFAULT NULL,
  `idperfil` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `acercademi`
--

INSERT INTO `acercademi` (`id`, `area`, `quiensoy`, `idperfil`) VALUES
(1, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(2, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(3, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(4, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(5, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(6, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(7, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(8, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(9, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(10, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(11, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(12, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(13, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(14, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(15, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(16, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(17, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(18, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(19, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(20, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(21, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(22, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(23, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(24, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(25, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 13),
(26, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(27, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(28, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(29, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(30, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(31, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(32, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(33, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(34, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(35, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(36, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(37, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(38, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(39, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(40, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(41, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(42, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(43, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(44, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(45, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(46, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(47, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(48, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(49, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(50, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(51, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(52, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(53, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(54, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(55, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(56, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(57, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(58, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(59, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(60, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(61, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(62, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(63, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(64, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(65, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(66, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(67, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(68, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(69, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(70, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(71, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(72, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(73, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(74, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(75, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(76, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(77, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(78, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(79, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(80, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(81, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(82, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(83, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(84, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(85, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(86, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(87, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(88, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(89, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(90, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(91, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(92, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(93, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(94, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(95, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(96, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(97, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(98, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(99, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(100, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(101, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(102, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(103, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(104, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(105, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(106, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(107, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(108, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(109, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(110, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(111, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(112, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(113, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(114, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(115, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(116, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(117, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(118, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(119, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(120, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(121, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(122, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(123, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(124, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(125, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(126, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(127, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(128, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(129, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(130, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(131, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(132, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(133, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(134, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(135, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(136, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(137, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(138, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(139, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(140, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(141, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(142, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(143, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(144, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(145, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(146, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(147, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(148, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(149, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(150, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(151, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(152, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(153, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(154, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(155, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1);
INSERT INTO `acercademi` (`id`, `area`, `quiensoy`, `idperfil`) VALUES
(156, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(157, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(158, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(159, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(160, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(161, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(162, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(163, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(164, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(165, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(166, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(167, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(168, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(169, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(170, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(171, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(172, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(173, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(174, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(175, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(176, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(177, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(178, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(179, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1),
(180, 'Técnico laboral en gestión de negocios.', 'Técnico laboral en gestión de negocios. Persona activa dinámica, responsable y con facilidad para las relaciones personales.Puedo desarrollar cualquier labor o función asignada con la mayor eficacia del caso. Me desenvuelvo bien tanto en equipos como individualmente.', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoriatecno`
--

CREATE TABLE `categoriatecno` (
  `id` int(11) NOT NULL,
  `categoria` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleo`
--

CREATE TABLE `empleo` (
  `id` int(11) NOT NULL,
  `cargo` varchar(255) DEFAULT NULL,
  `empresa` varchar(255) DEFAULT NULL,
  `fechafin` date DEFAULT NULL,
  `fechainicio` date DEFAULT NULL,
  `responsabilidad` varchar(255) DEFAULT NULL,
  `idperfil` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleo`
--

INSERT INTO `empleo` (`id`, `cargo`, `empresa`, `fechafin`, `fechainicio`, `responsabilidad`, `idperfil`) VALUES
(1, 'Arquitecto de sistemas', 'Google', '2002-01-11', '2012-01-12', 'Servidor de interfaz con los usuarios y patrocinadores, así como cualquier otro que está involucrado en determinar sus necesidades', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudio`
--

CREATE TABLE `estudio` (
  `id` int(11) NOT NULL,
  `carrera` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `fechagraduacion` date DEFAULT NULL,
  `fechainicio` date DEFAULT NULL,
  `instituto` varchar(255) DEFAULT NULL,
  `nivelestudio` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `idperfil` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estudio`
--

INSERT INTO `estudio` (`id`, `carrera`, `estado`, `fechagraduacion`, `fechainicio`, `instituto`, `nivelestudio`, `titulo`, `idperfil`) VALUES
(89, 'Tecnico Informatico', 'Cursando', '2002-11-11', '2002-11-11', 'Escuela Da Vinci', 'Terciario', 'Analista de Sistemas', 1),
(90, 'Tecnico Informatico', 'Cursando', '2002-11-11', '2002-11-11', 'Escuela Da Vinci', 'Terciario', 'Analista de Sistemas', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habilidades`
--

CREATE TABLE `habilidades` (
  `id` int(11) NOT NULL,
  `conocimientos` varchar(500) DEFAULT NULL,
  `idperfil` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `habilidades`
--

INSERT INTO `habilidades` (`id`, `conocimientos`, `idperfil`) VALUES
(1, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(2, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(3, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(4, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(5, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(6, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(7, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(8, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(9, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(10, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(11, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(12, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(13, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(14, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(15, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(16, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(17, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(18, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(19, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(20, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(21, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(22, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(23, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(24, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(25, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(26, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(27, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(28, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(29, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(30, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(31, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(32, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(33, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(34, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(35, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(36, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(37, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(38, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(39, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(40, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(41, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(42, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(43, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(44, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(45, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(46, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(47, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(48, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(49, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(50, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(51, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(52, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(53, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(54, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(55, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(56, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(57, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(58, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(59, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(60, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(61, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(62, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(63, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(64, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(65, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(66, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(67, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(68, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(69, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(70, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(71, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(72, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(73, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(74, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(75, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(76, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(77, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(78, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(79, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(80, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(81, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(82, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(83, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(84, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(85, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(86, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(87, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(88, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(89, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(90, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(91, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(92, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(93, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(94, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(95, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(96, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(97, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(98, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(99, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(100, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(101, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(102, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(103, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(104, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(105, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(106, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(107, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(108, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(109, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(110, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(111, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(112, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(113, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(114, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(115, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(116, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(117, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(118, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(119, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(120, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(121, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(122, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(123, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(124, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(125, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(126, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(127, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(128, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(129, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(130, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(131, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(132, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(133, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(134, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(135, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(136, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(137, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(138, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(139, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(140, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(141, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(142, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(143, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(144, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(145, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(146, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(147, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(148, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(149, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(150, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(151, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(152, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(153, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(154, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(155, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(156, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(157, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(158, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(159, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(160, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(161, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(162, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(163, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(164, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(165, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(166, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(167, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(168, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(169, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(170, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(171, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(172, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(173, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(174, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(175, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(176, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(177, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(178, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(179, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(180, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1),
(181, 'capacidad de tomar decisiones, trabajar en equipo,Persistencia y constancia para obtener los resultados deseados.', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `idioma`
--

CREATE TABLE `idioma` (
  `id` int(11) NOT NULL,
  `idioma` varchar(255) DEFAULT NULL,
  `nivel` varchar(255) DEFAULT NULL,
  `idperfil` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `idioma`
--

INSERT INTO `idioma` (`id`, `idioma`, `nivel`, `idperfil`) VALUES
(1, 'Ingles', 'Avanzado', 1),
(2, 'Portugues', 'Avanzado', 1),
(3, 'Chino Mandarin', 'Avanzado', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `idioma_filtro`
--

CREATE TABLE `idioma_filtro` (
  `id` int(11) NOT NULL,
  `codigo` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `idioma_filtro`
--

INSERT INTO `idioma_filtro` (`id`, `codigo`, `descripcion`) VALUES
(1, 'IT', 'Italiano'),
(2, 'ES', 'Español'),
(3, 'IN', 'Italiano'),
(4, 'EN', 'Inglés'),
(5, 'RU', 'Ruso'),
(6, 'PT', 'Portugués'),
(7, 'JA', 'Japonés'),
(8, 'FR', 'Francés'),
(9, 'CA', 'Catalán'),
(10, 'ZH', 'Chino'),
(11, 'DA', 'Alemán');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nacionalidad`
--

CREATE TABLE `nacionalidad` (
  `id` int(11) NOT NULL,
  `codigo` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `nacionalidad`
--

INSERT INTO `nacionalidad` (`id`, `codigo`, `nombre`) VALUES
(1, 'ABW', 'Aruba'),
(2, 'AFG', 'Afghanistan'),
(3, 'AGO', 'Angola'),
(4, 'AIA', 'Anguilla'),
(5, 'ALB', 'Albania'),
(6, 'AND', 'Andorra'),
(7, 'ANT', 'Netherlands Antilles'),
(8, 'ARE', 'United Arab Emirates'),
(9, 'ARG', 'Argentina'),
(10, 'ARM', 'Armenia'),
(11, 'ASM', 'American Samoa'),
(12, 'ATA', 'Antarctica'),
(13, 'ATF', 'French Southern territories'),
(14, 'ATG', 'Antigua and Barbuda'),
(15, 'AUS', 'Australia'),
(16, 'AUT', 'Austria'),
(17, 'AZE', 'Azerbaijan'),
(18, 'BDI', 'Burundi'),
(19, 'BEL', 'Belgium'),
(20, 'BEN', 'Benin'),
(21, 'BFA', 'Burkina Faso'),
(22, 'BGD', 'Bangladesh'),
(23, 'BGR', 'Bulgaria'),
(24, 'BHR', 'Bahrain'),
(25, 'BHS', 'Bahamas'),
(26, 'BIH', 'Bosnia and Herzegovina'),
(27, 'BLR', 'Belarus'),
(28, 'BLZ', 'Belize'),
(29, 'BMU', 'Bermuda'),
(30, 'BOL', 'Bolivia'),
(31, 'BRA', 'Brazil'),
(32, 'BRB', 'Barbados'),
(33, 'BRN', 'Brunei'),
(34, 'BTN', 'Bhutan'),
(35, 'BVT', 'Bouvet Island'),
(36, 'BWA', 'Botswana'),
(37, 'CAF', 'Central African Republic'),
(38, 'CAN', 'Canada'),
(39, 'CCK', 'Cocos (Keeling) Islands'),
(40, 'CHE', 'Switzerland'),
(41, 'CHL', 'Chile'),
(42, 'CHN', 'China'),
(43, 'CIV', 'Côte d’Ivoire'),
(44, 'CMR', 'Cameroon'),
(45, 'COG', 'Congo'),
(46, 'COL', 'Colombia'),
(47, 'COM', 'Comoros'),
(48, 'CPV', 'Cabo Verde'),
(49, 'CRI', 'Costa Rica'),
(50, 'CUB', 'Cuba'),
(51, 'CXR', 'Christmas Island'),
(52, 'CYM', 'Islas Caimán'),
(53, 'CYP', 'Cyprus'),
(54, 'CZE', 'República Checa'),
(55, 'DEU', 'Alemania'),
(56, 'DNK', 'Dinamarca'),
(57, 'DOM', 'República de Dominica'),
(58, 'DZA', 'Algeria'),
(59, 'ECU', 'Ecuador'),
(60, 'EGY', 'Egipto'),
(61, 'ESP', 'España'),
(62, 'FIN', 'Finlandia'),
(63, 'FRA', 'Francia'),
(64, 'GBR', 'Reino Unido'),
(65, 'GEO', 'Georgia'),
(66, 'GRC', 'Grecia'),
(67, 'GTM', 'Guatemala'),
(68, 'GUY', 'Guyana'),
(69, 'HND', 'Honduras'),
(70, 'HRV', 'Croacia'),
(71, 'HTI', 'Haiti'),
(72, 'HUN', 'Hungria'),
(73, 'IDN', 'Indonesia'),
(74, 'IND', 'India'),
(75, 'IRL', 'Irlanda'),
(76, 'IRN', 'Iran'),
(77, 'IRQ', 'Iraq'),
(78, 'ISR', 'Israel'),
(79, 'ITA', 'Italia'),
(80, 'JAM', 'Jamaica'),
(81, 'JPN', 'Japón'),
(82, 'MEX', 'México'),
(83, 'MLT', 'Malta'),
(84, 'MYS', 'Malaysia'),
(85, 'NGA', 'Nigeria'),
(86, 'NIC', 'Nicaragua'),
(87, 'NLD', 'Holanda'),
(88, 'PAN', 'Panamá'),
(89, 'PER', 'Perú'),
(90, 'PRI', 'Puerto Rico'),
(91, 'PRT', 'Portugal'),
(92, 'PRY', 'Paraguay'),
(93, 'PSE', 'Palestina'),
(94, 'RUS', 'Rusia'),
(95, 'SLV', 'El Salvador'),
(96, 'TTO', 'Trinidad y Tobago'),
(97, 'URY', 'Uruguay'),
(98, 'USA', 'Estados Unidos'),
(99, 'VEN', 'Venezuela');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfil`
--

CREATE TABLE `perfil` (
  `id` int(11) NOT NULL,
  `idpersona` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `perfil`
--

INSERT INTO `perfil` (`id`, `idpersona`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `permiso`
--

CREATE TABLE `permiso` (
  `id` int(11) NOT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `privilegios` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `permiso`
--

INSERT INTO `permiso` (`id`, `enabled`, `password`, `privilegios`, `username`) VALUES
(1, b'1', '$2a$10$XptfskLsT1l/bRTLRiiCgejHqOpgXFreUnNUa35gJdCr2v2QbVFzu', 'institucion', 'quirogajulio27@gmail.com'),
(2, b'1', '$2a$10$XptfskLsT1l/bRTLRiiCgejHqOpgXFreUnNUa35gJdCr2v2QbVFzu', 'user', 'julio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id` int(11) NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `cp` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `dirskype` varchar(255) DEFAULT NULL,
  `discapacidad` varchar(255) DEFAULT NULL,
  `documento` int(11) NOT NULL,
  `estadocivil` varchar(255) DEFAULT NULL,
  `fechanacimiento` date DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  `licconducir` varchar(255) DEFAULT NULL,
  `nacionalidad` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `telefono` int(11) NOT NULL,
  `tipodocumento` varchar(255) DEFAULT NULL,
  `tipotelefono` varchar(255) DEFAULT NULL,
  `vehiculo` varchar(255) DEFAULT NULL,
  `idpermiso` int(11) DEFAULT NULL,
  `cuitintitucion` varchar(255) DEFAULT NULL,
  `razonsocial` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `cuitinstitucion` varchar(255) DEFAULT NULL,
  `institucion` varchar(255) DEFAULT NULL,
  `idnivel` int(11) DEFAULT NULL,
  `idsalario` int(11) DEFAULT NULL,
  `idtipodepuesto` int(11) DEFAULT NULL,
  `idzona` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `apellido`, `ciudad`, `cp`, `direccion`, `dirskype`, `discapacidad`, `documento`, `estadocivil`, `fechanacimiento`, `genero`, `licconducir`, `nacionalidad`, `nombre`, `pais`, `region`, `telefono`, `tipodocumento`, `tipotelefono`, `vehiculo`, `idpermiso`, `cuitintitucion`, `razonsocial`, `tipo`, `cuitinstitucion`, `institucion`, `idnivel`, `idsalario`, `idtipodepuesto`, `idzona`) VALUES
(1, 'Santana', 'Gran Canarias', '', 'Tucuman 3172', 'pmsantana@skype.com', NULL, 0, NULL, '1985-01-04', NULL, '', 'España', 'Patricia', 'España', 'Gran Canarias', 1132156468, NULL, NULL, NULL, 1, NULL, 'pmsantana@hlinkedin.com', NULL, NULL, NULL, 1, 1, 1, 1),
(2, 'Santana', 'Buenos Aires', NULL, NULL, NULL, NULL, 0, NULL, '2000-09-15', 'M', NULL, 'Argentino', 'Patricia', NULL, 'CABA', 1126583216, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 2, 2, 2, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provincia`
--

CREATE TABLE `provincia` (
  `id` int(11) NOT NULL,
  `codigo` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subcategoriatecno`
--

CREATE TABLE `subcategoriatecno` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `idcategoriatecno` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnologia`
--

CREATE TABLE `tecnologia` (
  `id` int(11) NOT NULL,
  `nivel` int(11) NOT NULL,
  `tecnologia` varchar(255) DEFAULT NULL,
  `idperfil` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tecnologia`
--

INSERT INTO `tecnologia` (`id`, `nivel`, `tecnologia`, `idperfil`) VALUES
(635, 10, 'html, css, javasceipt, php,MySQL, Derby, Oracle, MS SQL Server, PostgreSQL', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `acercademi`
--
ALTER TABLE `acercademi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2gxrsbko6lmlgrle8f72eir3c` (`idperfil`);

--
-- Indices de la tabla `categoriatecno`
--
ALTER TABLE `categoriatecno`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `empleo`
--
ALTER TABLE `empleo`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKiehbnw5qv6n1vjuyq8wtlqbp0` (`idperfil`);

--
-- Indices de la tabla `estudio`
--
ALTER TABLE `estudio`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKhefxldkgkwo7bc5ynehhf969w` (`idperfil`);

--
-- Indices de la tabla `habilidades`
--
ALTER TABLE `habilidades`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK38j0agsp66uy39brhe77lv0o0` (`idperfil`);

--
-- Indices de la tabla `idioma`
--
ALTER TABLE `idioma`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKew0ft8g0l4wbf7dr6wdfd7y23` (`idperfil`);

--
-- Indices de la tabla `idioma_filtro`
--
ALTER TABLE `idioma_filtro`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `nacionalidad`
--
ALTER TABLE `nacionalidad`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `perfil`
--
ALTER TABLE `perfil`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKpeoyg85ehmin5kunj8n5ivsg5` (`idpersona`);

--
-- Indices de la tabla `permiso`
--
ALTER TABLE `permiso`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKgckmkxp5ecsexerkoo6kquq0c` (`idnivel`),
  ADD KEY `FKbag0d2wijgladv8fg1tqbbngf` (`idpermiso`),
  ADD KEY `FKew01u3usawr09dx33h4kvc691` (`idsalario`),
  ADD KEY `FK75milcdx5812q5rpwqcfktg5h` (`idtipodepuesto`),
  ADD KEY `FKj5yr3qbrc56p99tp9xt562fsm` (`idzona`);

--
-- Indices de la tabla `provincia`
--
ALTER TABLE `provincia`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `subcategoriatecno`
--
ALTER TABLE `subcategoriatecno`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKge228dsb2f947r33ofjtw3mjc` (`idcategoriatecno`);

--
-- Indices de la tabla `tecnologia`
--
ALTER TABLE `tecnologia`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK7wb6xvandj16yc374gjuqwars` (`idperfil`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `acercademi`
--
ALTER TABLE `acercademi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=181;

--
-- AUTO_INCREMENT de la tabla `categoriatecno`
--
ALTER TABLE `categoriatecno`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `empleo`
--
ALTER TABLE `empleo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=182;

--
-- AUTO_INCREMENT de la tabla `estudio`
--
ALTER TABLE `estudio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=182;

--
-- AUTO_INCREMENT de la tabla `habilidades`
--
ALTER TABLE `habilidades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=182;

--
-- AUTO_INCREMENT de la tabla `idioma`
--
ALTER TABLE `idioma`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=542;

--
-- AUTO_INCREMENT de la tabla `idioma_filtro`
--
ALTER TABLE `idioma_filtro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `nacionalidad`
--
ALTER TABLE `nacionalidad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=100;

--
-- AUTO_INCREMENT de la tabla `perfil`
--
ALTER TABLE `perfil`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `permiso`
--
ALTER TABLE `permiso`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `provincia`
--
ALTER TABLE `provincia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `subcategoriatecno`
--
ALTER TABLE `subcategoriatecno`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tecnologia`
--
ALTER TABLE `tecnologia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=827;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
