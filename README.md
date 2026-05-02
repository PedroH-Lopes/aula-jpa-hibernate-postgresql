<h1 align="center" style="font-weight: bold;">Tutorial JPA/Hibernate usando PostgreSQL  💻</h1>

<p align="center">
 <a href="#tech">Tecnologias</a> •
 <a href="#started">Execução</a> •
</p>

<p align="center">
    <b>Versão alterada do tutorial: https://www.youtube.com/watch?v=CAP1IPgeJkw&pp=0gcJCd4KAYcqIYzv/b>
</p>

<h2 id="features">🚀 Funcionalidades</h2>

Um sistema que cria três cadastros de pessoas em um banco de dados Postgres utilizando, JPA(Java Persistence API) com o framework Hibernate.

<h2 id="technologies">💻 Tecnologias</h2>

<!-- ALTERAR -->
- Java 17
- PostgreSQL
- JPA/Hibernate Framework.

<h2 id="structure">🏗️ Estrutura do Projeto</h2>

```bash
src/main/java/com/pedrohlopes/src/
├── aplicacao/         # Commandos Hibernate e Execução.
├── dominio/           # Classe Pessoa
```


<h2 id="started">🚀 Execução</h2>

<h3>Clonando</h3>

<!-- ALTERAR -->
```bash
git clone https://github.com/PedroH-Lopes/aula-jpa-hibernate-postgresql.git
```

<h3>Alterando persistence.xml</h3>

Modifique as linhas SEU_ em persistence.xml para nome do seu banco de dados, nome de usuário para acesso ao banco e senha de acesso ao banco.

```bash
<property name="jakarta.persistence.jdbc.url"
            value="jdbc:postgresql://localhost:5432/SEU_bancoDeDados"/>

...

<property name="jakarta.persistence.jdbc.user"
            value="SEU_usuario"/>

<property name="jakarta.persistence.jdbc.password"
            value="SEU_password"/>
```

<h3>Iniciando</h3>

Como iniciar seu projeto<!-- ALTERAR -->

<!-- ALTERAR -->
```bash
cd jpa-hibernate-postgresql
./mvnw exec:java
```
