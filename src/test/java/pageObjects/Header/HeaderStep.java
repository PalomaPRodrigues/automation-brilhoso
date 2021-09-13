package pageObjects.Header;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class HeaderStep {
	

	private HeaderLogic headerLogic;

	public HeaderStep() {
		headerLogic = new HeaderLogic();
	}
	
	@Quando("^clico Minha Conta sou redirecionado para página correta$")
	public void clicoMinhaContaSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarMinhaConta();
	}

	@Quando("^clico Meus Favoritos sou redirecionado para página correta$")
	public void clicoMeusFavoritosSouRedirecionadoParaPáginaCorreta() {
		headerLogic.clicarMeusFavoritos();
	    
	}

	@Quando("^clico Fechar Pedido sou redirecionado para página correta$")
	public void clicoFecharPedidoSouRedirecionadoParaPáginaCorreta() {
		headerLogic.clicarFecharPedido();
	    
	}

	@Quando("^clico entrar sou redirecionado para página correta$")
	public void clicoEntrarSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarEntrar();
	    
	}


	

	@Quando("^clico Cadastre-se sou redirecionado para página correta$")
	public void clicoCadastreSeSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarCadastre();
	   
	}
	
	@Dado("^preencho campo Procurar no site \"([^\"]*)\"$")
	public void preenchoCampoProcurarNoSite(String campo)  {
		headerLogic.preencheCmpPesquisa(campo);
	   
	}
	
	@Quando("^clico Procurar sou redirecionado para página correta$")
	public void clicoProcurarSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarProcurar();
	    
	}


	@Quando("^clico Carrinho sou redirecionado para página correta$")
	public void clicoCarrinhoSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarCarrinho();
	  
	}

	@Quando("^clico Acessórios  sou redirecionado para página correta$")
	public void clicoAcessóriosSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarAcessorios();
	
	}
	   

	@Quando("^clico Boinas e Suportes  sou redirecionado para página correta$")
	public void clicoBoinasESuportesSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarBoinas();
	    
	}
	
	@Quando("^clico Ceras, Selantes, Vitrificadores e Glazes sou redirecionado para página correta$")
	public void clicoCerasSelantesVitrificadoresEGlazesSouRedirecionadoParaPáginaCorreta() {
		headerLogic.clicarCeras();
	    
	}


	@Quando("^clico Descontaminação sou redirecionado para página correta$")
	public void clicoDescontaminaçãoSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarDescontaminação();
	  
    }
	
	@Quando("^clico Equipamentos e Ferramentas sou redirecionado para página correta$")
	public void clicoEquipamentosEFerramentasSouRedirecionadoParaPáginaCorreta() {
		headerLogic.clicarEquipamentos();
	    
	}

	@Quando("^clico Exterior sou redirecionado para página correta$")
	public void clicoExteriorSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarExterior();
	    
	}

	@Quando("^clico Interior sou redirecionado para página correta$")
	public void clicoInteriorSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarInterior();
	    
	}

	@Quando("^clico Kits sou redirecionado para página correta$")
	public void clicoKitsSouRedirecionadoParaPáginaCorreta() {
		headerLogic.clicarKits();
	    
	}

	@Quando("^clico Lavagem sou redirecionado para página correta$")
	public void clicoLavagemSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarLavagem();
	   
	}

	@Quando("^clico Lixamento sou redirecionado para página correta$")
	public void clicoLixamentoSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarLixamento();
	    
	}

	@Quando("^clico Panos / Flanelas sou redirecionado para página correta$")
	public void clicoPanosFlanelasSouRedirecionadoParaPáginaCorreta() {
		headerLogic.clicarPanos();
	   
	}

	@Quando("^clico Polidores, Massas e Lustradores sou redirecionado para página correta$")
	public void clicoPolidoresMassasELustradoresSouRedirecionadoParaPáginaCorreta() {
		headerLogic.clicarPolidores();
	    
	}

	@Quando("^clico Rodas, Pneus e Motor sou redirecionado para página correta$")
	public void clicoRodasPneusEMotorSouRedirecionadoParaPáginaCorreta() {
		headerLogic.clicarRodas();
	    
	}

	@Quando("^clico Cursos sou redirecionado para página correta$")
	public void clicoCursosSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarCursos();
	   
	}

	@Quando("^clico Marcas sou redirecionado para página correta$")
	public void clicoMarcasSouRedirecionadoParaPáginaCorreta()  {
		headerLogic.clicarMarcas();
	    
	}


}
