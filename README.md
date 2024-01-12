# User Registration

# Sobre o projeto
O sistema de registro de usuário é implementado como uma aplicação de microsserviços composta por dois serviços principais: User Microservice e Email Microservice.
O User Microservice é responsável pelo cadastro de usuários. Ele gerencia a lógica de criação de contas de usuário e produz uma mensagem indicando o sucesso do cadastro. Essa mensagem é enviada para um sistema de mensagens assíncronas.
Por outro lado, o Email Microservice é encarregado do envio de mensagens de confirmação de cadastro para os usuários. Ele consome as mensagens produzidas pelo User Microservice e envia e-mails de confirmação, garantindo que os usuários recebam a confirmação de registro em seus e-mails.
Dessa forma, a arquitetura de microsserviços permite a divisão clara de responsabilidades, melhorando a escalabilidade e a manutenção do sistema.

## Tecnologias utizadas
- Java -> Linguagem de programação, versão 17.
- Maven -> Gerenciador de depêndencias.
- Spring Boot -> Iniciar os dois microsserviços.
- Spring Web -> Para criar os endpoints dos serviços.
- Spring security -> Para lidar com autenticação, autorização dos usuários
- JWT ->  É um modo de geração de tokens onde um usuário faz login e recebe um token JWT, que é então enviado em cada requisição subsequente para autenticar o usuário.
- Spring Data JPA -> Para realizar todas as transações da base de dados.
- Spring Validation -> Para validar os dados na entrada das API's.
- Spring AMQP -> Facilita a comunicação assíncrona entre os microsserviços, trabalha com o protocolo AMQP (mensageria).
- Spring Mail -> Simplifica a integração de funcionalidades de e-mail em aplicativos Java baseados em Spring, foi construído sobre a API JavaMail.
- PostgreSQL -> Base de dados, cada microsserviços tem sua prória base de dados.
- Rabbit MQ -> É um sistema de mensagem que facilita a comunicação entre os serviços.
- Cloud AMQP -> Permite a implantação dos clusters feito pelo RabbitMQ sem se preocupar com a complexidade da configuração, escalabilidade e manutenção do servidor RabbitMQ.
- SMTP Gmail -> Serviço de e-mail do Google, utilizando o SMTP para enviar e-mails da conta do holder para outros destinatários.

# Como clonar o projeto
## Pré requisitos: 
- Java 17
- PgAdmin instalado na sua máquina
- Ter conta na CloudAMQP (plano free)
- Ter senha de APP Google, site com as informações para conseguir a senha (https://support.google.com/accounts/answer/185833)
```bash
  # clonar repositório
  git clone git@github.com:AndersonVianaDev/microservices-java.git

  # execute na sua IDE (preferência Intellij)
```

# Autor do projeto
Anderson Palmerim Viana
# Contato 
[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/anderson-palmerim-dev/)

