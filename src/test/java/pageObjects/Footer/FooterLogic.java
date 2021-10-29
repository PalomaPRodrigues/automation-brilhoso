package pageObjects.Footer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.pt.Entao;
import drive.DriverFactory;

public class FooterLogic extends DriverFactory {

	private FooterPage footerpage;

	public FooterLogic() {
		footerpage = new FooterPage();
	}

	public void clicarCadastro() {
		footerpage.getbtnCadastro().findElement(driver).click();
		tempoDeEspera(500);
	}

	public void clicarSeguranca() {
		footerpage.getbtnSeguranca().findElement(driver).click();
		tempoDeEspera(500);
	}

	public void clicarFaleConosco() {
		footerpage.getbtnFaleConosco().findElement(driver).click();
		tempoDeEspera(500);
	}

	public void clicarFormasDepagamentosEnvio() {
		footerpage.getbtnPagamentos().findElement(driver).click();
		tempoDeEspera(500);
	}

	public void clicarEmpresa() {
		footerpage.getbtnEmpresa().findElement(driver).click();
		tempoDeEspera(500);
	}

	public void clicarCondicaoNormas() {
		footerpage.getbtnCondicaoNormas().findElement(driver).click();
		tempoDeEspera(500);
	}

	public void preencherEmail(String email) {
		footerpage.getcmpEmail().findElement(driver).sendKeys(email);
		tempoDeEspera(500);
	}

	public void clicarAssinar() {
		footerpage.getbtnAssinar().findElement(driver).click();
		tempoDeEspera(500);
	}

	public void clicarYoutube() {
		footerpage.getbtnYoutube().findElement(driver).click();
		tempoDeEspera(500);
	}

	public void clicarFacebook() {
		driver.switchTo().frame(0);
		tempoDeEspera(5000);
		WebElement searchBtn = driver.findElement(By.xpath(footerpage.getbtnFacebook()));
		Actions actions = new Actions(driver);
		actions.click(searchBtn).build().perform();
		
	}

	@SuppressWarnings("unlikely-arg-type")
	@Entao("^valido o redirecionamento da página do Facebook com sucesso$")
	public void validoRedirecionadomentoComSucesso() {
		driver.findElement(By.xpath(footerpage.getbtnFacebook())).equals(footerpage.getvldFacebook());
		tempoDeEspera(5000);
	}

	public void clicarEbit() {
		WebElement searchBtn = driver.findElement(By.xpath(footerpage.getbtnEbit()));
		Actions actions = new Actions(driver);
		actions.click(searchBtn).build().perform();
		tempoDeEspera(1000);
	}

	@SuppressWarnings("unlikely-arg-type")
	@Entao("^valido o redirecionamento da página Ebit com sucesso$")
	public void validoORedirecionamentoDaPáginaEbitComSucesso() {
		driver.findElement(By.xpath(footerpage.getbtnEbit())).equals(footerpage.getVldEbit());
		tempoDeEspera(1000);
	}

	public void clicarPositiveSSL() {
		footerpage.getbtnPositiveSSql().findElement(driver).click();
		tempoDeEspera(600);
	}

}
