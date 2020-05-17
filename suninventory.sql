-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 29-Maio-2018 às 17:25
-- Versão do servidor: 5.6.13
-- versão do PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `suninventory`
--
CREATE DATABASE IF NOT EXISTS `suninventory` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `suninventory`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `categorias`
--

CREATE TABLE IF NOT EXISTS `categorias` (
  `cod_categoria` varchar(50) NOT NULL DEFAULT '',
  `descricao` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`cod_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `categorias`
--

INSERT INTO `categorias` (`cod_categoria`, `descricao`) VALUES
('1', 'Maculino'),
('2', 'Feminino'),
('3', 'carro');

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `cpf_cnpj` varchar(40) NOT NULL DEFAULT '',
  `nome` varchar(60) DEFAULT NULL,
  `sobrenome` varchar(45) DEFAULT NULL,
  `cep` varchar(30) DEFAULT NULL,
  `endereco` varchar(45) DEFAULT NULL,
  `numero` varchar(10) DEFAULT NULL,
  `bairro` varchar(25) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `tipo_telefone` varchar(12) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `UF` varchar(10) DEFAULT NULL,
  `cadastramento` date DEFAULT NULL,
  `tipo_pessoa` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cpf_cnpj`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`cpf_cnpj`, `nome`, `sobrenome`, `cep`, `endereco`, `numero`, `bairro`, `cidade`, `tipo_telefone`, `telefone`, `UF`, `cadastramento`, `tipo_pessoa`) VALUES
('122244448787', 'Jack ', 'febronio', '74631846', 'piratas do caribe', '666', 'calabouço', 'Brasilia', 'Celular', '9914447', 'DF', NULL, NULL),
('4564688979', 'Henrique', 'Dias', '15454', 'Av Senador Vergueiro', '14', 'zzzzxc', 'Piratininga', 'Residencial', '44644444', 'AM', NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedores`
--

CREATE TABLE IF NOT EXISTS `fornecedores` (
  `cnpj` varchar(60) NOT NULL DEFAULT '',
  `nome` varchar(60) DEFAULT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `cep` varchar(60) DEFAULT NULL,
  `endereco` varchar(70) DEFAULT NULL,
  `numero` varchar(85) DEFAULT NULL,
  `bairro` varchar(80) DEFAULT NULL,
  `estado` varchar(80) DEFAULT NULL,
  `cidade` varchar(80) DEFAULT NULL,
  `pais` varchar(70) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cnpj`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `fornecedores`
--

INSERT INTO `fornecedores` (`cnpj`, `nome`, `telefone`, `email`, `cep`, `endereco`, `numero`, `bairro`, `estado`, `cidade`, `pais`, `complemento`) VALUES
('123', 'Henrique', '456', 'asdf', '69696969', 'asdf', '123', 'João sem braço', 'AC', 'Diabo', 'Angola', 'Jessinula');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE IF NOT EXISTS `produtos` (
  `cod_produto` varchar(80) NOT NULL DEFAULT '',
  `nome` varchar(60) DEFAULT NULL,
  `cod_categoria` varchar(50) DEFAULT NULL,
  `cnpj` varchar(60) DEFAULT NULL,
  `estilo` varchar(40) DEFAULT NULL,
  `marca` varchar(40) DEFAULT NULL,
  `estoque_atual` varchar(60) DEFAULT NULL,
  `estoque_minimo` varchar(30) DEFAULT NULL,
  `data_fabricacao` varchar(50) DEFAULT NULL,
  `imagem` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cod_produto`),
  KEY `cod_categoria` (`cod_categoria`),
  KEY `cnpj` (`cnpj`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `cod_usuario` varchar(25) NOT NULL DEFAULT '',
  `nome` varchar(80) DEFAULT NULL,
  `sobrenome` varchar(80) DEFAULT NULL,
  `login` varchar(20) DEFAULT NULL,
  `email` varchar(80) DEFAULT NULL,
  `senha` varchar(30) DEFAULT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`cod_usuario`, `nome`, `sobrenome`, `login`, `email`, `senha`, `telefone`) VALUES
('1', 'Sun', 'Inventory', 'sun', '---------------------------', 'glass', '---------------');

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `produtos`
--
ALTER TABLE `produtos`
  ADD CONSTRAINT `produtos_ibfk_1` FOREIGN KEY (`cod_categoria`) REFERENCES `categorias` (`cod_categoria`),
  ADD CONSTRAINT `produtos_ibfk_2` FOREIGN KEY (`cnpj`) REFERENCES `fornecedores` (`cnpj`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
