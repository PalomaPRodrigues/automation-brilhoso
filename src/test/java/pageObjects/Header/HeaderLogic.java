package pageObjects.Header;

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

	public void clicarCeras() {
		headerPage.getbtnCeras().findElement(driver).click();
	}

	public void clicarDescontaminação() {
		headerPage.getbtnDescontaminacao().findElement(driver).click();
	}

	public void clicarEquipamentos() {
		headerPage.getbtnEquipamento().findElement(driver).click();
	}

	public void clicarExterior() {
		headerPage.getbtnExterior().findElement(driver).click();
	}

	public void clicarInterior() {
		headerPage.getbtnInterior().findElement(driver).click();
	}

	public void clicarKits() {
		headerPage.getbtnKits().findElement(driver).click();
	}

	public void clicarLavagem() {
		headerPage.getbtnLavagem().findElement(driver).click();
	}

	public void clicarLixamento() {
		headerPage.getbtnLixamento().findElement(driver).click();
	}

	public void clicarPanos() {
		headerPage.getbtnPanos().findElement(driver).click();
	}

	public void clicarPolidores() {
		headerPage.getbtnPolidores().findElement(driver).click();
	}

	public void clicarRodas() {
		headerPage.getbtnRodas().findElement(driver).click();
	}

	public void clicarCursos() {
		headerPage.getbtnCursos().findElement(driver).click();
	}

	public void clicarMarcas() {
		headerPage.getbtnMarcas().findElement(driver).click();
	}

}
