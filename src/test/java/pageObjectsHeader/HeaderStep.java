package pageObjectsHeader;

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
	  
	}

	@Quando("^clico Acessórios  sou redirecionado para página correta$")
	public void clicoAcessóriosSouRedirecionadoParaPáginaCorreta()  {
	
	}
	   

	@Quando("^clico Boinas e Suportes  sou redirecionado para página correta$")
	public void clicoBoinasESuportesSouRedirecionadoParaPáginaCorreta()  {
	    
	}

	@Quando("^clico Descontaminação sou redirecionado para página correta$")
	public void clicoDescontaminaçãoSouRedirecionadoParaPáginaCorreta()  {
	  
    }
	
	@Quando("^clico Equipamentos e Ferramentas sou redirecionado para página correta$")
	public void clicoEquipamentosEFerramentasSouRedirecionadoParaPáginaCorreta() {
	    
	}

	@Quando("^clico Exterior sou redirecionado para página correta$")
	public void clicoExteriorSouRedirecionadoParaPáginaCorreta()  {
	    
	}

	@Quando("^clico Interior sou redirecionado para página correta$")
	public void clicoInteriorSouRedirecionadoParaPáginaCorreta()  {
	    
	}

	@Quando("^clico Kits sou redirecionado para página correta$")
	public void clicoKitsSouRedirecionadoParaPáginaCorreta() {
	    
	}

	@Quando("^clico Lavagem sou redirecionado para página correta$")
	public void clicoLavagemSouRedirecionadoParaPáginaCorreta()  {
	   
	}

	@Quando("^clico Lixamento sou redirecionado para página correta$")
	public void clicoLixamentoSouRedirecionadoParaPáginaCorreta()  {
	    
	}

	@Quando("^clico Panos / Flanelas sou redirecionado para página correta$")
	public void clicoPanosFlanelasSouRedirecionadoParaPáginaCorreta() {
	   
	}

	@Quando("^clico Polidores, Massas e Lustradores sou redirecionado para página correta$")
	public void clicoPolidoresMassasELustradoresSouRedirecionadoParaPáginaCorreta() {
	    
	}

	@Quando("^clico Rodas, Pneus e Motor sou redirecionado para página correta$")
	public void clicoRodasPneusEMotorSouRedirecionadoParaPáginaCorreta() {
	    
	}

	@Quando("^clico Cursos sou redirecionado para página correta$")
	public void clicoCursosSouRedirecionadoParaPáginaCorreta()  {
	   
	}

	@Quando("^clico Marcas sou redirecionado para página correta$")
	public void clicoMarcasSouRedirecionadoParaPáginaCorreta()  {
	    
	}


}
