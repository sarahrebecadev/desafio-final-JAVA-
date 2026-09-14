# Desafio Final - Sistema de Pagamentos

Projeto desenvolvido em Java para o Desafio Final da Trilha Backend.

## Objetivo

Desenvolver um sistema de pagamentos bancário aplicando conceitos de Programação Orientada a Objetos.

## Formas de pagamento

O sistema possui três formas de pagamento:

- Pix
- Débito
- Crédito

## Conceitos de POO utilizados

- Classe abstrata
- Herança
- Encapsulamento
- Polimorfismo
- Métodos abstratos
- Sobrescrita de métodos

## Regras

O valor do pagamento deve ser maior que zero.

No pagamento via Débito, é verificado se existe saldo suficiente.

No pagamento via Crédito, é verificado se existe limite suficiente.

Pagamentos com valor zero ou negativo são recusados.

## Como executar

1. Abra o projeto em uma IDE Java.
2. Execute o arquivo `Main.java`.
3. Verifique o resultado no console.

## Resultado esperado

O programa deve exibir os pagamentos realizados, seus respectivos valores e status.

Também deve demonstrar a recusa de um pagamento com valor inválido.