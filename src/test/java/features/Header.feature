#language: pt
#encoding: UTF-8
#Author: Paloma Pedro Rodrigues
#date:02/09/2021
#version: 2.0

Funcionalidade: redirecionamento dos links do header

   Como um usuario do site brilhoso
   Quero clicar nos links do header 
   Para seja redirecionado para página correta
   
Contexto:

	Dado que estou na pagina home do site

Esquema do Cenario: redirecionamento do link Minha Conta
  Quando clico Minha Conta sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal            |
  |Esqueceu Sua Senha? |
 
Esquema do Cenario: redirecionamento do link Meus Favoritos
  Quando clico Meus Favoritos sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal                       |
  |Cadastre-se ou Acesse sua Conta|
  
Esquema do Cenario: redirecionamento do link Fechar Pedido
  Quando clico Fechar Pedido sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal      |
  |Carrinho Vazio|  

Esquema do Cenario: redirecionamento do link entrar
  Quando clico entrar sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal                                                |
  |Se você já possui uma conta, informe os dados de acesso.|  
 
Esquema do Cenario: redirecionamento do link Cadastre-se
  Quando clico Cadastre-se sou redirecionado para página correta
  
  
  Exemplos:
  |msgFinal   |
  |Criar Conta|

Esquema do Cenario: redirecionamento do link procurar
  E preencho campo Procurar no site "<campo>"
  Quando clico Procurar sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |campo | msgFinal|
  |boinas|Início   |  
    
@ignore 
Esquema do Cenario: redirecionamento do link Carrinho
  Quando clico Carrinho sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal                   |
  |Nenhum produto no carrinho.|    
  
Esquema do Cenario: redirecionamento do link Acessórios 
  Quando clico Acessórios  sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Início  | 
  
Esquema do Cenario: redirecionamento do link Boinas e Suportes  
  Quando clico Boinas e Suportes  sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Início  |  
  
Esquema do Cenario: redirecionamento do link Ceras, Selantes, Vitrificadores e Glazes  
  Quando clico Ceras, Selantes, Vitrificadores e Glazes sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Início  |      
  
Esquema do Cenario: redirecionamento do link Descontaminação  
  Quando clico Descontaminação sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Início |         
  
Esquema do Cenario: redirecionamento do link Equipamentos e Ferramentas  
  Quando clico Equipamentos e Ferramentas sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Início  | 
  
Esquema do Cenario: redirecionamento do link Exterior  
  Quando clico Exterior sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Início  |     
  
Esquema do Cenario: redirecionamento do link Interior  
  Quando clico Interior sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Início  |
  
Esquema do Cenario: redirecionamento do link Kits  
  Quando clico Kits sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Início  |     
  
Esquema do Cenario: redirecionamento do link Lavagem   
  Quando clico Lavagem sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Início  |  
  
Esquema do Cenario: redirecionamento do link Lixamento   
  Quando clico Lixamento sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal |
  |Início   | 
  
Esquema do Cenario: redirecionamento do link Panos / Flanelas   
  Quando clico Panos / Flanelas sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal |
  |Início   |  
  
Esquema do Cenario: redirecionamento do link Polidores, Massas e Lustradores   
  Quando clico Polidores, Massas e Lustradores sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal |
  |Início   |
  
Esquema do Cenario: redirecionamento do link Rodas, Pneus e Motor   
  Quando clico Rodas, Pneus e Motor sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal |
  |Início   | 
  
Esquema do Cenario: redirecionamento do link Cursos   
  Quando clico Cursos sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal |
  |Início   |
  
Esquema do Cenario: redirecionamento do link Marcass   
  Quando clico Marcas sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal |
  |Início   |
                                                            