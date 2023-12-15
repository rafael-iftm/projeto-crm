-- Criar o banco de dados
CREATE DATABASE IF NOT EXISTS dbcontatos;
USE dbcontatos;

-- Tabela tb_contato
CREATE TABLE IF NOT EXISTS tb_contato (
    email VARCHAR(255) PRIMARY KEY,
    nome VARCHAR(255)
);

-- Inserir dados na tb_contato
INSERT INTO tb_contato (email, nome) VALUES 
    ('exemplo1@gmail.com', 'Exemplo Contato 1'),
    ('exemplo2@gmail.com', 'Exemplo Contato 2');

-- Tabela tb_login
CREATE TABLE IF NOT EXISTS tb_login (
    usuario VARCHAR(255) PRIMARY KEY,
    senha VARCHAR(255)
);

-- Inserir dados na tb_login
INSERT INTO tb_login (usuario, senha) VALUES 
    ('usuario1', 'senha1'),
    ('usuario2', 'senha2');

-- Tabela tb_pedido
CREATE TABLE IF NOT EXISTS tb_pedido (
    idPedido INT PRIMARY KEY AUTO_INCREMENT,
    valorPedido DOUBLE,
    dataPedido DATE,
    email_contato VARCHAR(255),
    idVendedor INT
);

-- Inserir dados na tb_pedido
INSERT INTO tb_pedido (valorPedido, dataPedido, email_contato, idVendedor) VALUES
    (500, '2023-12-13', 'exemplo1@gmail.com', 1);

-- Tabela tb_pagamentos
CREATE TABLE IF NOT EXISTS tb_pagamentos (
    idPagamento INT PRIMARY KEY AUTO_INCREMENT,
    formaPagamento VARCHAR(255),
    id_pedido INT
);

-- Inserir dados na tb_pagamentos
INSERT INTO tb_pagamentos (formaPagamento, id_pedido) VALUES
    ('PIX', 1),
    ('BOLETO', 1);

-- Tabela tb_vendedor
CREATE TABLE IF NOT EXISTS tb_vendedor (
    idVendedor INT PRIMARY KEY AUTO_INCREMENT,
    nomeVendedor VARCHAR(255)
);

-- Inserir dados na tb_vendedor
INSERT INTO tb_vendedor (nomeVendedor) VALUES
    ('Lucas'),
    ('João Victor'),
    ('Rafael');

-- Verificar o conteúdo da tabela tb_contato
SELECT * FROM tb_contato;

-- Excluir todos os registros da tabela tb_contato
DELETE FROM tb_contato;

-- Verificar o conteúdo da tabela tb_login
SELECT * FROM tb_login;

-- Excluir todos os registros da tabela tb_login
DELETE FROM tb_login;

-- Verificar o conteúdo da tabela tb_pedido
SELECT * FROM tb_pedido;

-- Excluir todos os registros da tabela tb_pedido
DELETE FROM tb_pedido;

-- Verificar o conteúdo da tabela tb_pagamentos
SELECT * FROM tb_pagamentos;

-- Verificar o conteúdo da tabela tb_vendedor
SELECT * FROM tb_vendedor;
