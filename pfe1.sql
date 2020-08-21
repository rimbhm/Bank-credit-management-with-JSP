-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Sam 30 Avril 2016 à 13:12
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `pfe1`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num_client` int(11) NOT NULL,
  `cin` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `etat` varchar(50) NOT NULL,
  `date_naissance` varchar(200) NOT NULL,
  `email` varchar(50) NOT NULL,
  `adresse` varchar(50) NOT NULL,
  `nationalite` varchar(50) NOT NULL,
  `telephone` int(11) NOT NULL,
  `ncompte` int(11) NOT NULL,
  `type` varchar(20) NOT NULL,
  `login` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`id`, `num_client`, `cin`, `nom`, `prenom`, `etat`, `date_naissance`, `email`, `adresse`, `nationalite`, `telephone`, `ncompte`, `type`, `login`, `password`) VALUES
(1, 65225225, 123, 'mede', 'zzz', 'Monsieur', '02/02/1996', 'rim.bhm@gmail.com', 'ddd', '11', 1255, 65225225, 'type2', 'admin', 'admin'),
(2, 2966, 8885, 'mlmlm', 'xdsd', 'Monsieur', '02/02/1996', 'sssss@ggg', 'ddd', 'sdd', 85555, 885855, 'Client', 'ss', 'ss'),
(3, 123, 4555, 'ali', 'med', 'Monsieur', '02/02/1996', 'ghazifsmh@hotmail.fr', 'adreaa', 'rim', 1255, 65225225, 'type1', 'aa', 'aa'),
(9, 14547, 2145854, 'hjhj', 'ddd', 'Monsieur', '02/07/85', 'hhh@hhhh.com', 'jjj', 'ddd', 7458, 252852, 'lkjjj', 'zz', 'zz');

-- --------------------------------------------------------

--
-- Structure de la table `crédit`
--

CREATE TABLE IF NOT EXISTS `crédit` (
  `num_c` int(10) NOT NULL,
  `num_client` int(200) NOT NULL,
  `nature_c` varchar(20) NOT NULL,
  `nbr_echeances` int(10) NOT NULL,
  `TIA` float(100,1) NOT NULL,
  `montant_max` float NOT NULL,
  `montant_min` float NOT NULL,
  `situation` varchar(20) NOT NULL,
  `Etat` varchar(20) NOT NULL,
  `duree_max` varchar(50) NOT NULL,
  `duree_min` varchar(50) NOT NULL,
  PRIMARY KEY (`num_c`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `crédit`
--

INSERT INTO `crédit` (`num_c`, `num_client`, `nature_c`, `nbr_echeances`, `TIA`, `montant_max`, `montant_min`, `situation`, `Etat`, `duree_max`, `duree_min`) VALUES
(678990, 558555885, 'Mahly', 240, 8.3, 1425, 49000, 'en cours', 'accépté', '12', '3');

-- --------------------------------------------------------

--
-- Structure de la table `demande`
--

CREATE TABLE IF NOT EXISTS `demande` (
  `num` int(10) NOT NULL AUTO_INCREMENT,
  `client` varchar(50) NOT NULL,
  `situation` varchar(100) NOT NULL,
  `pers` int(11) NOT NULL,
  `logement` varchar(100) NOT NULL,
  `prof` varchar(50) NOT NULL,
  `statut` varchar(50) NOT NULL,
  `duree` varchar(50) NOT NULL,
  `salaire` double NOT NULL,
  `revenu` double NOT NULL,
  `loyer` double NOT NULL,
  `arm` double NOT NULL,
  `mloyer` double NOT NULL,
  `mcred` double NOT NULL,
  `enc_cred` double NOT NULL,
  `montant_cred` double NOT NULL,
  `duree_cred` double NOT NULL,
  `etat` varchar(100) NOT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `demande`
--

INSERT INTO `demande` (`num`, `client`, `situation`, `pers`, `logement`, `prof`, `statut`, `duree`, `salaire`, `revenu`, `loyer`, `arm`, `mloyer`, `mcred`, `enc_cred`, `montant_cred`, `duree_cred`, `etat`) VALUES
(1, 'aa', 'gg', 2, 'kk', 'jj', 'hh', '74', 78888, 88888, 88888, 7778, 88, 88, 888, 44, 44, 'en cours'),
(2, 'ss', 'sqds', 11, 'sss', 'ddd', 'sss', 's', 788, 888, 888, 888, 88, 885, 55, 885, 55, 'en cours');

-- --------------------------------------------------------

--
-- Structure de la table `notification`
--

CREATE TABLE IF NOT EXISTS `notification` (
  `id_not` int(10) NOT NULL AUTO_INCREMENT,
  `contenu` varchar(100) NOT NULL,
  `date_recu` date NOT NULL,
  PRIMARY KEY (`id_not`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `responsable`
--

CREATE TABLE IF NOT EXISTS `responsable` (
  `id_resp` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `telephone` int(11) NOT NULL,
  `lieu_travail` varchar(30) NOT NULL,
  `login` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id_resp`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `responsable`
--

INSERT INTO `responsable` (`id_resp`, `nom`, `prenom`, `Email`, `telephone`, `lieu_travail`, `login`, `password`) VALUES
(1, 'walid', 'ddddd', 'walid@gmail.com', 2016, 'Nabeul  ville', 'admin', 'admin'),
(2, 'mede', 'ee', 'rim.bhm', 1255, 'ff', 'xxx', 'xxx');

-- --------------------------------------------------------

--
-- Structure de la table `tableau_amortissement`
--

CREATE TABLE IF NOT EXISTS `tableau_amortissement` (
  `n_order` int(11) NOT NULL AUTO_INCREMENT,
  `date_echeance` date NOT NULL,
  `Mont_principal` float NOT NULL,
  `Mont_interet` float NOT NULL,
  `commission` text NOT NULL,
  `TVA` float NOT NULL,
  `total_echeance` int(11) NOT NULL,
  `capital_restant` float NOT NULL,
  PRIMARY KEY (`n_order`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
