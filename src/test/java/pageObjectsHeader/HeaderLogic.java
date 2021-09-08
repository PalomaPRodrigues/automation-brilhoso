package pageObjectsHeader;

import drive.DriverFactory;

public class HeaderLogic extends DriverFactory {
	
	private HeaderPage headerPage;

	public HeaderLogic() {
		headerPage = new HeaderPage();

	}
	
	public void clicarMinhaConta() {
	headerPage.getbtnMinhaConta().findElement(driver).click();
	
	}
	
	public void clicarMeusFavoritos() {
		headerPage.getbtnMeusFavoritos().findElement(driver).click();
	}
	
	public void clicarFecharPedido() {
		headerPage.getbtnFecharPedido().findElement(driver).click();
	}
	
	public void clicarEntrar() {
		headerPage.getbtnEntrar().findElement(driver).click();
	}
	
	public void clicarCadastre() {
		headerPage.getbtnCadastre().findElement(driver).click();
	}
	
	public void preencheCmpPesquisa(String campo) {
		headerPage.getcmpPesquisar().findElement(driver).sendKeys(campo);
	}
	
	public void clicarProcurar() {
		headerPage.getbtnProcurar().findElement(driver).click();
	}
	
	public void clicarCarrinho() {
		headerPage.getbtnCarrinho().findElement(driver).click();
	}
	
	public void clicarAcessorios() {
		headerPage.getbtnAcessorios().findElement(driver).click();
	}
	
	public void clicarBoinas() {
		headerPage.getbtnBoianas().findElement(driver).click();
	}


}
