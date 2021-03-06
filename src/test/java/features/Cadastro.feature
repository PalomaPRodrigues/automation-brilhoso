#language: pt
#encoding: UTF-8
#Author: Paloma Pedro Rodrigues
#date:02/09/2021
#version: 2.0

Funcionalidade: Cadastro com sucesso
  Como um usuario do site Brilhoso
  Quero me cadastrar
  Para realizar compras

Esquema do Cenario: Cadastro com sucesso
  Dado que estou na pagina home do site
  E seleciono cadastre se
  E preencho e-mail 
  E seleciono tipo de cadastro "<tipoCadastro>"
  E preencho cpf 
  E seleciono Uf "<uf>"
  E preencho rg
  E preencho nome "<nome>"
  E preencho sobrenome "<sobrenome>"
  E preencho data de nascimento "<dataNascimento>"
  E seleciono genero "<genero>"
  E clico em receber ofertas
  E preencho senha "<senha>"
  E preencho confirmar senha "<confirmarSenha>"
  Quando clico enviar
  Entao valido mensagem final com sucesso "<msgFinal>"

  Exemplos:
  |tipoCadastro  |uf |nome  |sobrenome|dataNascimento|genero  |senha  |confirmarSenha|msgFinal                                                                   |
  |Pessoa física |SP |Teste |Testes   |22/07/1994    |Feminino|pwd1223|pwd1223       |Obrigado por se registrar na Brilhoso - Produtos para Estética Automotiva. |