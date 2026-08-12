# Workshop Spring Boot 4 + JPA

Projeto desenvolvido com **Java e Spring Boot** com o objetivo de praticar a construção de uma aplicação web utilizando **Spring Data JPA**, persistência de dados e criação de uma API REST.

O projeto faz parte dos estudos de desenvolvimento back-end utilizando o ecossistema Spring.

## 🚀 Tecnologias utilizadas

* **Java 25**
* **Spring Boot 4.1.0**
* **Spring Data JPA**
* **Spring Web MVC**
* **H2 Database**
* **PostgreSQL**
* **Maven**
* **Spring Boot DevTools**
* **JUnit / Spring Boot Test**

O projeto utiliza o Spring Data JPA para facilitar a implementação da camada de acesso aos dados e o mapeamento entre objetos Java e entidades do banco de dados.

## 📌 Objetivo do projeto

O objetivo principal deste projeto é colocar em prática conceitos importantes do desenvolvimento de aplicações back-end com Java e Spring Boot, incluindo:

* Criação de uma aplicação Spring Boot;
* Desenvolvimento de APIs REST;
* Utilização do Spring Data JPA;
* Mapeamento de entidades;
* Persistência de dados;
* Integração com banco de dados;
* Utilização de banco de dados H2 para desenvolvimento e testes;
* Configuração para utilização do PostgreSQL;
* Organização de um projeto utilizando o padrão do ecossistema Spring.

## 🏗️ Estrutura do projeto

A aplicação segue a estrutura padrão de um projeto Maven com Spring Boot:

```text
Workshop-springboot4-jpa/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── projetocurso/
│   │   │           └── website/
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       └── application-test.properties
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── projetocurso/
│                   └── website/
│
├── pom.xml
└── README.md
```

A estrutura de código está organizada dentro do pacote `com.projetocurso.website`, enquanto as configurações da aplicação ficam no diretório `src/main/resources`.

## 🗄️ Banco de dados

O projeto possui suporte a dois bancos de dados:

### H2

O **H2 Database** é utilizado como banco de dados em memória, sendo bastante útil durante o desenvolvimento e testes da aplicação.

### PostgreSQL

O projeto também possui o driver do **PostgreSQL**, permitindo que a aplicação seja configurada para utilizar um banco de dados PostgreSQL em um ambiente mais próximo de produção.

As dependências dos dois bancos estão configuradas no `pom.xml`.

## ⚙️ Pré-requisitos

Antes de executar o projeto, certifique-se de possuir instalado:

* [Java JDK 25](https://www.oracle.com/java/technologies/downloads/)
* [Maven](https://maven.apache.org/)
* [Git](https://git-scm.com/)

Caso utilize PostgreSQL, também será necessário ter uma instância do banco de dados configurada.

## 📥 Como clonar o projeto

Abra o terminal e execute:

```bash
git clone https://github.com/GuilhermeSilva-06/Workshop-springboot4-jpa.git
```

Entre no diretório:

```bash
cd Workshop-springboot4-jpa
```

## ▶️ Executando o projeto

Para compilar o projeto utilizando Maven:

```bash
mvn clean install
```

Depois, execute a aplicação com:

```bash
mvn spring-boot:run
```

Também é possível executar a classe principal da aplicação diretamente através da sua IDE.

## 🧪 Testes

Para executar os testes automatizados:

```bash
mvn test
```

Os testes ficam localizados em:

```text
src/test/java/
```

O projeto possui dependências específicas do Spring Boot para testes de JPA e Web MVC.

## 🔧 Configuração

As configurações da aplicação estão localizadas em:

```text
src/main/resources/application.properties
```

Existe também uma configuração específica para testes:

```text
src/main/resources/application-test.properties
```

Esses arquivos podem ser utilizados para configurar propriedades relacionadas ao banco de dados, ambiente de execução e demais configurações da aplicação.

## 📚 Conceitos praticados

Durante o desenvolvimento deste projeto são trabalhados conceitos fundamentais de desenvolvimento back-end:

* Java;
* Spring Boot;
* APIs REST;
* Spring Data JPA;
* JPA/Hibernate;
* Entidades;
* Repositories;
* Persistência de dados;
* Banco de dados relacional;
* H2;
* PostgreSQL;
* Maven;
* Testes automatizados;
* Arquitetura de aplicações web.

O Spring Data JPA fornece uma camada de abstração para trabalhar com repositórios JPA, reduzindo a quantidade de código necessário para operações de persistência e consultas.

## 💻 IDE recomendada

O projeto pode ser desenvolvido utilizando diferentes IDEs, como:

* IntelliJ IDEA
* Eclipse
* Spring Tools Suite
* Visual Studio Code

## 📌 Próximos passos

Algumas melhorias que podem ser implementadas futuramente:

* [ ] Implementar tratamento global de exceções;
* [ ] Adicionar validação dos dados recebidos pela API;
* [ ] Criar documentação com Swagger/OpenAPI;
* [ ] Adicionar mais testes automatizados;
* [ ] Implementar paginação;
* [ ] Implementar filtros e consultas personalizadas;
* [ ] Melhorar o tratamento de erros HTTP;
* [ ] Adicionar autenticação e autorização;
* [ ] Criar Dockerfile e Docker Compose;
* [ ] Configurar integração contínua (CI/CD).

## 👨‍💻 Autor

**Guilherme Silva**

GitHub:
https://github.com/GuilhermeSilva-06

## 📄 Licença

Este projeto foi desenvolvido para fins de **estudo e aprendizado** sobre desenvolvimento back-end com Java, Spring Boot e JPA.
