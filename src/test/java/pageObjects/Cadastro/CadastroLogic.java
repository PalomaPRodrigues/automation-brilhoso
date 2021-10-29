package pageObjects.Cadastro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import drive.DriverFactory;
import util.Generators;
import util.RandomUtils;

public class CadastroLogic extends DriverFactory {

	private CadastroPage cadastroPage;
	private RandomUtils random;

	public CadastroLogic() {
		cadastroPage = new CadastroPage();
		random = new RandomUtils();
	}

	public void selecionarCadastrar() {
		cadastroPage.getBtnCadastre().findElement(driver).click();
		tempoDeEspera(500);

	}

	public void preencherEmail() {
		String emailRandomico = "Teste" + random.generateRandomEmailAddress();
		cadastroPage.getCmpEmail().findElement(driver).sendKeys(emailRandomico);
		tempoDeEspera(500);
	}

	public void selecionarTipoCadastro(String tipoCadastro) {
		WebElement comboElement = driver.findElement(cadastroPage.getCboxTipocadastro());
		Select combo = new Select(comboElement);
		combo.selectByVisibleText(tipoCadastro);
		tempoDeEspera(500);

	}

	public void preencherCpf() {
		String cpfGenerator = Generators.CPF.get();
		cadastroPage.getCmpCpf().findElement(driver).sendKeys(cpfGenerator);
		tempoDeEspera(500);
//		cadastroPage.getCmpCpf().findElement(driver).sendKeys(cpf);
//		tempoDeEspera(500);

	}

	public void selecionarUf(String uf) {
		WebElement comboElement = driver.findElement(cadastroPage.getCboxUf());
		Select combo = new Select(comboElement);
		combo.selectByVisibleText(uf);
		tempoDeEspera(500);

	}

	public void preencherRg() {
		String rgGenerator = Generators.RG.get();
		cadastroPage.getCmpRg().findElement(driver).sendKeys(rgGenerator);
		tempoDeEspera(500);

	}

	public void preencherNome(String nome) {
		cadastroPage.getCmpNome().findElement(driver).sendKeys(nome);
		tempoDeEspera(500);

	}

	public void preencherSobrenome(String sobrenome) {
		cadastroPage.getCmpSobrenome().findElement(driver).sendKeys(sobrenome);
		tempoDeEspera(500);

	}

	public void preencherDataNascimento(String dataNascimento) {
		cadastroPage.getCmpDataNascimento().findElement(driver).sendKeys(dataNascimento);
		tempoDeEspera(500);

	}

	public void selecionarGenero(String genero) {
		WebElement comboElement = driver.findElement(cadastroPage.getCboxGenero());
		Select combo = new Select(comboElement);
		combo.selectByVisibleText(genero);
		tempoDeEspera(500);

	}

	public void ClicarReceberOfertas() {
		cadastroPage.getBtnReceberOfertas().findElement(driver).click();
		tempoDeEspera(600);

	}

	public void preencherSenha(String senha) {
		cadastroPage.getCmpSenha().findElement(driver).sendKeys(senha);
		tempoDeEspera(600);

	}

	public void preencherConfirmarSenha(String confirmarSenha) {
		cadastroPage.getCmpConfirmarSenha().findElement(driver).sendKeys(confirmarSenha);
		tempoDeEspera(500);

	}

	public void clicarEnviar() {
		cadastroPage.getBtnEnviar().findElement(driver).click();
		tempoDeEspera(600);
	}

}
