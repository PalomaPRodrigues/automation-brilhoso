package pageObjectsHeader;

import org.openqa.selenium.By;

public class HeaderPage {
	
	private By btnMinhaConta = By.xpath ("(//a[text() ='Minha Conta'])[2]");
	private By btnMeusFavoritos = By.xpath ("(//a[text() ='Meus Favoritos'])[2]");
	private By btnFecharPedido = By.xpath ("(//a[text() ='Fechar Pedido'])[2]");
	private By btnEntrar = By.xpath ("(//*[contains(text(),'Entrar')])[1]");
	private By cmpPesquisa = By.xpath("//*[@id='myInput']");
	private By btnProcurar = By.xpath("//*[text()='Procurar']");
	private By btnCarrinho = By.xpath ("//*[text() ='Carrinho:']");
	private By btnCadastre = By.xpath ("//a[text() ='Cadastre-se']");
	private By btnAcessorios = By.xpath ("//*[@id='pt_menu49']");
	private By btnBoinas = By.xpath ("//*[@id ='pt_menu51']");
	private By btnCeras = By.xpath ("//*[@id='pt_menu52']");
	private By btnDescontaminacao= By.xpath ("//*[@id='pt_menu53']");
	private By btnEquipamento = By.xpath ("//*[@id='pt_menu16']");
	private By btnExterior = By.xpath ("//*[@id='pt_menu54']");
	private By btnInterior = By.xpath ("//*[@id='pt_menu55']");
	private By btnKits = By.xpath ("//*[@id='pt_menu56']");
	private By btnLavagem = By.xpath ("//*[@id='pt_menu58']");
	private By btnLixamento = By.xpath ("//*[@id='pt_menu226']");
	private By btnPanos = By.xpath ("//*[@id='pt_menu61']");
	private By btnPolidores = By.xpath ("//*[@id='pt_menu62']");
	private By btnRodas = By.xpath ("//*[@id='pt_menu64']");
	private By btnCursos = By.xpath ("//*[@id='pt_menu137']");
	private By btnMarcas = By.xpath ("//*[@id='pt_menu92']");

	public By getbtnMinhaConta() {
		return btnMinhaConta;
	}
	
	public By getbtnMeusFavoritos() {
		return btnMeusFavoritos;
	}
	
	public By getbtnFecharPedido() {
		return btnFecharPedido;
	}
	

	public By getbtnEntrar() {
		return btnEntrar;
	}
	
	public By getbtnCadastre() {
		return btnCadastre;
	}
	
	public By getcmpPesquisar() {
		return cmpPesquisa;
	}
	
	public By getbtnProcurar() {
		return btnProcurar;
	}
	
	public By getbtnCarrinho() {
		return btnCarrinho;
	}
	
	public By getbtnAcessorios() {
		return btnAcessorios;
	}
	
	public By getbtnBoianas() {
		return btnBoinas;
	}
	
	public By getbtnCeras() {
		return btnCeras;
	}
	
	public By getbtnDescontaminacao() {
		return btnDescontaminacao;
	}
	
	public By getbtnEquipamento() {
		return btnEquipamento;
	}
	
	public By getbtnExterior() {
		return btnExterior;
	}
	
	public By getbtnInterior() {
		return btnInterior;
	}
	
	public By getbtnKits() {
		return btnKits;
	}
	
	public By getbtnLavagem() {
		return btnLavagem;
	}
	
	public By getbtnLixamento() {
		return btnLixamento;
	}
	
	public By getbtnPanos() {
		return btnPanos;
	}
	
	public By getbtnPolidores() {
		return btnPolidores;
	}
	
	public By getbtnRodas() {
		return btnRodas;
	}
	
	public By getbtnCursos() {
		return btnCursos;
	}
	
	public By getbtnMarcas() {
		return btnMarcas;
	}

}
