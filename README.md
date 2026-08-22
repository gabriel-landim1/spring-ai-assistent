# 🤖 Spring AI Assistant

API REST desenvolvida com Spring Boot e Spring AI, com foco na integração com modelos de Inteligência Artificial para processamento de prompts e geração de respostas automatizadas.
O projeto utiliza Java, Spring Boot, Spring AI, validações com Bean Validation e Docker para conteinerização da aplicação.

## 🚀 Tecnologias

TecnologiaUtilização☕ Java 17Linguagem principal🌱 Spring BootDesenvolvimento da API REST🧠 Spring AIIntegração com modelos de Inteligência Artificial📦 MavenGerenciamento de dependências e build🐳 DockerConteinerização da aplicação

## 🔒 Funcionalidades

✅ Endpoint REST para envio de prompts via parâmetro na URL (`@RequestParam`)
✅ Validação de dados utilizando Bean Validation (`@NotBlank`, `@Validated`)
✅ Integração nativa com serviços de Inteligência Artificial via Spring AI
✅ Tratamento de requisições e respostas padronizadas
✅ Aplicação conteinerizada com Docker

## 📌 Principais Endpoints

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| POST | `/api/chat?prompt=...` | Envia um prompt/pergunta para a IA e retorna a resposta gerada |

## 🏗️ Estrutura do Projeto

O projeto utiliza uma arquitetura organizada em camadas, separando as responsabilidades da aplicação:
```
src
└── main
    └── java
        └── com
            └── lanidm
                └── spring_ai
                    ├── controller
                    ├── service
                    └── dto
```

## 🐳 Como Executar com Docker

Siga os passos abaixo para rodar o projeto de forma rápida utilizando um container Docker.

### 📌 Pré-requisitos

Você precisa ter instalado em sua máquina:
- **[Git](https://git-scm.com)**
- **[Docker](https://docker.com)**

---

### ➡️ 1. Clonar o repositório

Abra o terminal e baixe o projeto:
```bash
git clone https://github.com/gabriel-landim1/spring-ai-assistent.git
```

### ➡️ 2. Entrar na pasta

Acesse a pasta criada pelo Git:
```
cd spring-ai-assistent.git
```

### ➡️ 3. Construir a imagem

Gere a imagem Docker do projeto:
```
docker build -t spring-ai .
```

### ➡️ 4. Iniciar o container

Rode o projeto na sua máquina passando a sua **chave de API da IA** como variável de ambiente (`AI_API_KEY`):
```
docker run --rm -p 8080:8080 -e AI_API_KEY=sua_chave_real_aqui spring-ai
```

### ➡️ 5. Testar a Aplicação

Depois que o container inicializar com sucesso, você pode testar a API enviando uma requisição POST (por exemplo, via Postman, ou qualquer outra):
```
POST http://localhost:8080/api/chat?prompt=Qual a melhor forma de economizar dinheiro?
```

### 📖 Sobre

Este projeto foi desenvolvido como um estudo/portfólio para praticar o ecossistema Spring Boot integrado com Inteligência Artificial (Spring AI), aplicando boas práticas de validação de parâmetros, arquitetura limpa e conteinerização com Docker.
