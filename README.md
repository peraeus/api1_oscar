# 🏆 API Oscar

Uma API RESTful desenvolvida em Spring Boot para gerenciamento de premiações e categorias do Oscar. Este projeto foi desenvolvido como parte das atividades da FIAP.

## 🛠️ Tecnologias Utilizadas

*   **Java 17+**
*   **Spring Boot** (Web, Data JPA)
*   **MySQL** (Banco de Dados)
*   **Docker** (Infraestrutura)
*   **Lombok** (Produtividade)

---

## 🐳 Infraestrutura: Como subir o Banco de Dados

Para que a API funcione corretamente, é necessário ter um banco de dados MySQL rodando. Para facilitar os testes e a avaliação, utilizamos o **Docker**.

Siga os passos abaixo para subir o banco de dados do zero:

1. Certifique-se de que o [Docker Desktop](https://www.docker.com/products/docker-desktop/) está instalado e rodando na sua máquina.
2. Abra o seu terminal e execute o seguinte comando:

```bash
docker run -d \
  --name mysql-oscar \
  -e MYSQL_ROOT_PASSWORD=root \
  -e MYSQL_DATABASE=db_oscar \
  -p 3306:3306 \
  mysql:8.0