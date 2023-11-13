CREATE TABLE IF NOT EXISTS `produto` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) NOT NULL,
  `preco` bigint NOT NULL,
  `quantidade_disponivel` int NOT NULL,
  `url_imagem` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
)