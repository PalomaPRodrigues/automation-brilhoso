package pageObjects.Footer;

import org.openqa.selenium.By;

public class FooterPage {

	private By btnCadastro = By.xpath("//a[text()='Cadastro']");
	private By btnSeguranca = By.xpath("//a[text()='Segurança']");
	private By btnFaleConosco = By.xpath("//a[text()='Fale conosco']");
	private By btnPagamentos = By.xpath("//a[text()='Formas de Pagamento e Envio']");
	private By btnEmpresa = By.xpath("//a[text()='Empresa']");
	private By btnCondicaoNormas = By.xpath("//a[text()='Condições e normas']");
	private By cmpEmail = By.xpath("//input[@id='newsletter']");
	private By btnAssinar = By.xpath("//span[text()='Assinar']");
	private By btnYoutube = By.xpath("//a[text()=' Veja mais em nosso canal']");
	private String btnfacebook = "//a[text()='Brilhoso']";
	private By validoFacebook = By.xpath("//i[@class='fb_logo img sp_ajfzHHnyL95 sx_648232']");
	private String btnEbit = "//img[@src='https://newimgebit-a.akamaihd.net/ebitBR/selo/img_42875.png']";
	private By validoEbit = By.xpath("//a[@class='nav-brand logo-ebit']");
	private By btnPositiveSSl = By.xpath("//img[@title='SSL Certificate']");

	public By getbtnCadastro() {
		return btnCadastro;
	}

	public By getbtnSeguranca() {
		return btnSeguranca;
	}

	public By getbtnFaleConosco() {
		return btnFaleConosco;
	}

	public By getbtnPagamentos() {
		return btnPagamentos;
	}

	public By getbtnEmpresa() {
		return btnEmpresa;
	}

	public By getbtnCondicaoNormas() {
		return btnCondicaoNormas;
	}

	public By getcmpEmail() {
		return cmpEmail;
	}

	public By getbtnAssinar() {
		return btnAssinar;
	}

	public By getbtnYoutube() {
		return btnYoutube;
	}

	public String getbtnFacebook() {
		return btnfacebook;
	}

	public By getvldFacebook() {
		return validoFacebook;
	}

	public String getbtnEbit() {
		return btnEbit;
	}

	public By getVldEbit() {
		return validoEbit;
	}

	public By getbtnPositiveSSql() {
		return btnPositiveSSl;
	}

}