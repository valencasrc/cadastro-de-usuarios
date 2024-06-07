# Projeto de Cadastro de Usuários

## Descrição

Este projeto é uma aplicação simples para cadastro de usuários. Ele utiliza JDBC para se conectar a um banco de dados MySQL e realizar operações de inserção de dados. A aplicação foi desenvolvida em Java e está organizada em pacotes para uma melhor modularização do código.

## Estrutura do Projeto

- `App.java`: Classe principal que executa a aplicação.
- `DAO/UsuarioDAO.java`: Classe responsável pela interação com o banco de dados.
- `entity/Usuario.java`: Classe que representa a entidade usuário.
- `conexao/Conexao.java`: Classe responsável por gerenciar a conexão com o banco de dados.

## Ferramentas Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver a aplicação.
- **JDBC**: API utilizada para conectar e executar operações no banco de dados.
- **MySQL**: Sistema de gerenciamento de banco de dados relacional utilizado para armazenar os dados dos usuários.

## Configuração do Ambiente

### Banco de Dados

1. Certifique-se de ter o MySQL instalado e em execução.
2. Crie um banco de dados chamado `exemplobd`.
3. Crie a tabela `USUARIO` com a seguinte estrutura:

```sql
CREATE TABLE USUARIO (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    login VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL
);

Execução
Ao executar a classe App.java, três objetos do tipo Usuario são criados e um deles é cadastrado no banco de dados através da classe UsuarioDAO.

Problemas Conhecidos
Apenas um usuário é cadastrado no banco de dados. Para cadastrar os outros usuários, adicione chamadas adicionais ao método cadastrarUsuario na classe App.
