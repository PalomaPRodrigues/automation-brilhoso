#language: pt
#encoding: UTF-8
#Author: Paloma Pedro Rodrigues
#date:10/09/2021
#version: 2.0

Funcionalidade: redirecionamento dos links do footer
   Como um usuario do site brilhoso
   Quero clicar nos links do footer 
   Para seja redirecionado para página correta
   
Contexto:
Dado que estou na pagina home do site
	
Esquema do Cenario: redirecionamento do link Cadastro
	Quando clico em Cadastro
	Entao valido mensagem final com sucesso "<msgFinal>"
	
	Exemplos:
  |msgFinal                       |
  |Cadastre-se ou Acesse sua Conta|
  
Esquema do Cenario: redirecionamento do link Segurança
	Quando clico em Segurança
	Entao valido mensagem final com sucesso "<msgFinal>"
	
	Exemplos:
  |msgFinal|
  |Início  |  
  
Esquema do Cenario: redirecionamento do link Fale Conosco
	Quando clico em Fale conosco
	Entao valido mensagem final com sucesso "<msgFinal>"
	
	Exemplos:
  |msgFinal              |
  |Informações de Contato|   
  
Esquema do Cenario: redirecionamento do link Empresa
	Quando clico em Empresa
	Entao valido mensagem final com sucesso "<msgFinal>"
	
	Exemplos:
  |msgFinal                         |
  |Brilhoso - Loja Ribeirão Preto/SP|   
 
Esquema do Cenario: redirecionamento do link Condicoes e Normas
	Quando clico em Condicoes e Normas
	Entao valido mensagem final com sucesso "<msgFinal>"
	
	Exemplos:
  |msgFinal                                         |
  |Endereço incorreto, não localizado ou inexistente|   
    

Esquema do Cenario: redirecionamento do link Formas de Pagamento e Envio
	Quando clico em Formas de Pagamento e Envio
	Entao valido mensagem final com sucesso "<msgFinal>"
	
	Exemplos:
  |msgFinal |
  |Embalagem|
 
  
Esquema do Cenario: redirecionamento do link Assine Nossa Newsletter
	E preencho campo email "<email>"
	Quando clico em Assinar
	Entao valido mensagem final com sucesso "<msgFinal>"
	
	Exemplos:
  |email                 |msgFinal                               |
  |teste.testes@gmail.com|Obrigado por assinar nossa newsletter. | 
  
Esquema do Cenario: redirecionamento do link Youtube
	Quando clico em  Youtube
	Entao valido mensagem final com sucesso "<msgFinal>"
	
	Exemplos:
  |msgFinal   |
  |BrilhosoTV |  
 
 Cenario: redirecionamento do link Facebook
	Quando clico em Facebook
  Entao valido o redirecionamento da página do Facebook com sucesso 

 
Cenario: redirecionamento do link Ebit
	Quando clico em Ebit
	Entao valido o redirecionamento da página Ebit com sucesso
	  
Esquema do Cenario: redirecionamento do link Positive SSL
	Quando clico em Positive SSL
	Entao valido mensagem final com sucesso "<msgFinal>"
	
	Exemplos:
  |msgFinal |
  |Home     |               
  
      	 
   
