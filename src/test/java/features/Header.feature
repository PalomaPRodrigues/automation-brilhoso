#language: pt
#encoding: UTF-8
#Author: Paloma Pedro Rodrigues
#date:02/09/2021
#version: 2.0

Funcionalidade: redirecionamento dos links do header

   Como um usuario do site brilhoso
   Quero que ao clicar no link do header 
   Para seja redirecionada para página correta
   
Contexto:

	Dado que estou na pagina home do site
	
Esquema do Cenario: redirecionamento do links Minha Conta
  Quando clico Minha Conta sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal            |
  |Esqueceu Sua Senha? |
   
Esquema do Cenario: redirecionamento do links Meus Favoritos
  Quando clico Meus Favoritos sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal                       |
  |Cadastre-se ou Acesse sua Conta|
  
Esquema do Cenario: redirecionamento do links Fechar Pedido
  Quando clico Fechar Pedido sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal      |
  |Carrinho Vazio|  
  
Esquema do Cenario: redirecionamento do links entrar
  Quando clico entrar sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal                                                |
  |Se você já possui uma conta, informe os dados de acesso.|  
  
Esquema do Cenario: redirecionamento do links Cadastre-se
  Quando clico Cadastre-se sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal   |
  |Criar Conta|
  
  Esquema do Cenario: redirecionamento do link procurar
  E preencho campo Procurar no site "<campo>"
  Quando clico Procurar sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |campo | msgFinal                                                           |
  |boinas|Boina de Espuma Branca Agressiva para Corte 3,4" (85mm) - Menzerna  |    
  
Esquema do Cenario: redirecionamento do links Carrinho
  Quando clico Carrinho sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal                   |
  |Nenhum produto no carrinho.|    
  
Esquema do Cenario: redirecionamento do links Acessórios 
  Quando clico Acessórios  sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal  |
  |Acessórios| 
  
Esquema do Cenario: redirecionamento do links Boinas e Suportes  
  Quando clico Boinas e Suportes  sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal         |
  |Boinas e Suportes|  
  
Esquema do Cenario: redirecionamento do links Ceras, Selantes, Vitrificadores e Glazes  
  Quando clico Boinas e Suportes  sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal                                |
  |Ceras, Selantes, Vitrificadores e Glazes|      
  
Esquema do Cenario: redirecionamento do links Descontaminação  
  Quando clico Descontaminação sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal       |
  |Descontaminação|         
  
Esquema do Cenario: redirecionamento do links Equipamentos e Ferramentas  
  Quando clico Equipamentos e Ferramentas sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal                  |
  |Equipamentos e Ferramentas| 
  
Esquema do Cenario: redirecionamento do links Exterior  
  Quando clico Exterior sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Exterior|     
  
Esquema do Cenario: redirecionamento do links Interior  
  Quando clico Interior sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Interior|
  
Esquema do Cenario: redirecionamento do links Kits  
  Quando clico Kits sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Kits    |     
  
Esquema do Cenario: redirecionamento do links Lavagem   
  Quando clico Lavagem sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal|
  |Lavagem |  
  
Esquema do Cenario: redirecionamento do links Lixamento   
  Quando clico Lixamento sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal |
  |Lixamento| 
  
Esquema do Cenario: redirecionamento do links Panos / Flanelas   
  Quando clico Panos / Flanelas sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal        |
  |Panos / Flanelas|  
  
Esquema do Cenario: redirecionamento do links Polidores, Massas e Lustradores   
  Quando clico Polidores, Massas e Lustradores sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal                       |
  |Polidores, Massas e Lustradores|  
  
Esquema do Cenario: redirecionamento do links Rodas, Pneus e Motor   
  Quando clico Rodas, Pneus e Motor sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal            |
  |Rodas, Pneus E Motor| 
  
Esquema do Cenario: redirecionamento do links Cursos   
  Quando clico Cursos sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal |
  |Cursos   |    
  
Esquema do Cenario: redirecionamento do links Marcass   
  Quando clico Marcas sou redirecionado para página correta
  Entao valido mensagem final com sucesso "<msgFinal>"
  
  Exemplos:
  |msgFinal |
  |Marcas   |                                                              