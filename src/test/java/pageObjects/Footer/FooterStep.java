package pageObjects.Footer;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class FooterStep {
	
	private FooterLogic footerlogic;
	
	public FooterStep() {
		footerlogic = new FooterLogic();
	}
	

	@Quando("^clico em Cadastro$")
	public void clico_em_Cadastro() {
		footerlogic.clicarCadastro();

	}

	@Quando("^clico em Segurança$")
	public void clico_em_Segurança() {
		footerlogic.clicarSeguranca();
		
	}

	@Quando("^clico em Fale conosco$")
	public void clico_em_Fale_conosco() {
		footerlogic.clicarFaleConosco();
		
	}

	@Quando("^clico em Formas de Pagamento e Envio$")
	public void clico_em_Formas_de_Pagamento_e_Envio() {
		footerlogic.clicarFormasDepagamentosEnvio();

	}
	
	@Quando("^clico em Empresa$")
	public void clicoEmEmpresa(){
		footerlogic.clicarEmpresa();
	}

	@Quando("^clico em Condicoes e Normas$")
	public void clicoEmCondicoesENormas() {
		footerlogic.clicarCondicaoNormas();
	    
	}

	
	@Dado("^preencho campo email \"([^\"]*)\"$")
	public void preencho_campo_email(String email) {
		footerlogic.preencherEmail(email);

	}

	@Quando("^clico em Assinar$")
	public void clico_em_Assinar() {
		footerlogic.clicarAssinar();

	}
	
	@Quando("^clico em  Youtube$")
	public void clicoEmYoutube() {
		footerlogic.clicarYoutube();
	    
	}

	@Quando("^clico em Facebook$")
	public void clico_em_Facebook() {
		footerlogic.clicarFacebook();

	}

	@Quando("^clico em Ebit$")
	public void clico_em_Ebit() {
		footerlogic.clicarEbit();

	}

	@Quando("^clico em Positive SSL$")
	public void clico_em_Positive_SSL() {
		footerlogic.clicarPositiveSSL();

	}

}
