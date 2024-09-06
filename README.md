# Sistema de Gerenciamento Bancário

Este projeto é uma simulação de um sistema bancário simples, desenvolvido em Java, que permite gerenciar clientes, contas correntes e contas poupança. Ele contém funcionalidades para criar clientes, verificar se eles são maiores de idade antes de permitir que abram uma conta, além de possibilitar operações bancárias como depósito, transferência e exibição de extratos.

## Funcionalidades

### 1. **Gerenciamento de Clientes**

- Cadastro de clientes com nome, sobrenome e data de nascimento.
- Verificação automática se o cliente é maior de idade (18 anos ou mais).

### 2. **Contas Bancárias**

- Suporte para dois tipos de contas: Conta Corrente e Conta Poupança.
- Cada conta possui agência e número gerados automaticamente.
- Operações básicas: depósito, saque, transferência entre contas.
- Geração de extratos para as contas, com exibição de saldo e informações do titular.

### 3. **Exceções Tratadas**

- Tratamento de exceções para entrada de dados incorretos, como formatos de data inválidos.

## Tecnologias Utilizadas

- **Java 8**: Linguagem de programação utilizada.
- **Paradigma Orientado a Objetos (POO)**: O projeto aplica conceitos de encapsulamento, herança, polimorfismo e abstração.
- **Java Time API**: Utilizada para trabalhar com datas (classe `LocalDate`).

## Como Executar o Projeto

### Pré-requisitos

- É necessário ter o [JDK 8 ou superior](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
- Um editor de código ou IDE como [Eclipse](https://www.eclipse.org/downloads/) ou [IntelliJ IDEA](https://www.jetbrains.com/idea/).

### Passos para execução

1. Clone este repositório:

    ```bash
    git clone <https://github.com/seu-usuario/sistema-gerenciamento-bancario.git>
    
    ```

2. Compile e execute o projeto:
    - No terminal:

        ```bash
        javac Main.java
        java Main
        
        ```


### Uso do Sistema

- Ao executar o programa, o sistema solicitará o nome, sobrenome e a data de nascimento do cliente.
- O sistema verificará se o cliente é maior de idade para abrir uma conta.
- Após isso, o cliente terá uma conta corrente e uma conta poupança criadas.
- Operações de depósito e transferência serão realizadas entre as contas.
- No final, o sistema imprimirá o extrato de ambas as contas.

## Estrutura do Código

O código é organizado em diferentes classes para manter uma separação clara de responsabilidades:

1. **Cliente**: Armazena as informações pessoais do cliente e faz a verificação de maioridade.
2. **Conta**: Classe base para contas bancárias, implementa as operações comuns como depósito, saque e transferência.
3. **ContaCorrente** e **ContaPoupanca**: Subclasses de `Conta` que representam tipos específicos de conta.
4. **GerenciadorCliente**: Responsável por gerenciar a abertura de contas e exibir informações dos clientes.
5. **Banco**: Armazena todas as contas criadas.
6. **IConta**: Interface que define as operações básicas para uma conta.

## Melhorias Futuras

- Implementar uma interface gráfica (GUI) para tornar o sistema mais amigável.
- Adicionar suporte a diferentes tipos de transações e taxas bancárias.
- Persistência dos dados em um banco de dados.

## Contribuição

Sinta-se à vontade para fazer um fork deste repositório e enviar pull requests com melhorias ou correções. Toda contribuição é bem-vinda!
