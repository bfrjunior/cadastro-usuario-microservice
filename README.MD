# 👤 Cadastro de Usuários - Microsserviço
## 📄 Descrição
Este microsserviço gerencia o cadastro, atualização, busca e remoção de usuários na aplicação de Loja Virtual. Ele possibilita operações CRUD (Criar, Ler, Atualizar e Deletar) relacionadas às informações de usuários.

## 🔧 Funcionalidades
* 📥 Cadastrar Usuário: Permite criar novos cadastros de usuários.
* 🔄 Atualizar Usuário: Atualiza os dados de usuários existentes.
* 🔍 Buscar Usuário por E-mail: Busca informações de usuários com base no e-mail.
* ❌ Deletar Usuário: Remove um usuário da base de dados com base no e-mail.
## 🛠️ Estrutura de Código
Classe Principal: UsuarioService
Métodos:
* gravarUsuarios(UsuarioRequestDTO usuarioRequestDTO): Grava um novo usuário no banco de dados.
* atualizaCadastro(UsuarioRequestDTO usuarioRequestDTO): Atualiza as informações de um usuário existente.
* buscaDadosUsuario(String email): Busca um usuário pelo e-mail fornecido.
* deletaDadosUsuario(String email): Remove o usuário com o e-mail fornecido do banco de dados.
* buscaPorIniciais(String iniciais): Busca usuários cujos nomes ou e-mails começam com as iniciais fornecidas.
* fazUpdateDeEmail(String email, String documento): Atualiza o e-mail de um usuário com base no documento de identificação.

Classe Controladora: UsuarioController
Rotas:
* POST /user: Cadastra um novo usuário.
* GET /user: Busca um usuário pelo e-mail.
* DELETE /user: Deleta um usuário pelo e-mail.
## 📦 Dependências
Este microsserviço depende dos seguintes componentes:

1. UsuarioRepository 🧩: Repositório responsável pela comunicação com o banco de dados.
2. UsuarioConverter 🔄: Conversor para transformar DTOs em entidades e vice-versa.
3. UsuarioMapper 🔄: Mapper para conversão entre diferentes objetos relacionados ao usuário.
4. UsuarioUpdateMapper 🔄: Mapper utilizado para atualização parcial de informações de usuários.

## 📑 Swagger
Este serviço de cadastro de usuários é documentado e pode ser testado diretamente no navegador usando a interface Swagger. Acesse o Swagger UI pelo endereço:

Swagger UI - Cadastro de Usuários API

## 📜 Rotas Disponíveis
1 .Cadastrar Usuário

* Método: POST
* Rota: /user
* Descrição: Cria um novo usuário no sistema.
* Request Body:
```
{
  "nome": "João Silva",
  "email": "joao.silva@example.com",
  "documento": "123456789",
  "endereco": {
    "rua": "Rua das Flores",
    "bairro": "Centro",
    "numero": "100",
    "cep": "12345-678",
    "cidade": "Fortaleza",
    "complemento": "Apt 101"
  }
}
```
* Respostas:
   * 200 OK: Cadastro realizado com sucesso.
   * 500 Internal Server Error: Erro ao cadastrar o usuário.
2. Buscar Usuário por E-mail

* Método: GET
* Rota: /user?email=usuario@example.com
* Descrição: Busca um usuário pelo e-mail fornecido.
* Respostas:
   * 200 OK: Usuário encontrado.
   * 404 Not Found: Usuário não encontrado.
   * 500 Internal Server Error: Erro ao buscar os dados.
3. Deletar Usuário

* Método: DELETE
* Rota: /user?email=usuario@example.com
* Descrição: Deleta um usuário pelo e-mail fornecido.
* Respostas:
   * 200 OK: Usuário deletado com sucesso.
   * 404 Not Found: Usuário não encontrado.
   * 500 Internal Server Error: Erro ao deletar o usuário.
## 🔄 Fluxo de Processo

1. O cliente realiza uma requisição para cadastrar, buscar, atualizar ou deletar um usuário.
2. O serviço manipula as informações através dos mappers e converte os dados para o formato necessário.
3. O banco de dados é atualizado com base nas operações solicitadas.
## 🔄 Retornos
* ✅ Usuário cadastrado ou atualizado com sucesso.
* ❌ Usuário não encontrado ou falha na operação.