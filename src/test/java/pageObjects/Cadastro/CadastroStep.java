package pageObjects.Cadastro;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class CadastroStep {

	private CadastroLogic cadastroLogic;

	public CadastroStep() {
		cadastroLogic = new CadastroLogic();

	}

	@Dado("^seleciono cadastre se$")
	public void selecionoCadastreSe() {
		cadastroLogic.selecionarCadastrar();

	}

	@Dado("^preencho e-mail$")
	public void preenchoEMail() {
		cadastroLogic.preencherEmail();

	}

	@Dado("^seleciono tipo de cadastro \"([^\"]*)\"$")
	public void selecionoTipoDeCadastro(String tipoCadastro) {
		cadastroLogic.selecionarTipoCadastro(tipoCadastro);

	}

	@Dado("^preencho cpf$")
	public void preenchoCpf() {
		cadastroLogic.preencherCpf();;
	}

	@Dado("^seleciono Uf \"([^\"]*)\"$")
	public void selecionoEstadoDoRg(String uf) {
		cadastroLogic.selecionarUf(uf);

	}

	@Dado("^preencho rg$")
	public void preenchoRg() {
		cadastroLogic.preencherRg();

	}

	@Dado("^preencho nome \"([^\"]*)\"$")
	public void preenchoNome(String nome) {
		cadastroLogic.preencherNome(nome);

	}

	@Dado("^preencho sobrenome \"([^\"]*)\"$")
	public void preenchoSobrenome(String sobrenome) {
		cadastroLogic.preencherSobrenome(sobrenome);

	}

	@Dado("^preencho data de nascimento \"([^\"]*)\"$")
	public void preenchoDataDeNascimento(String dataNascimento) {
		cadastroLogic.preencherDataNascimento(dataNascimento);

	}

	@Dado("^seleciono genero \"([^\"]*)\"$")
	public void selecionoGenero(String genero) {
		cadastroLogic.selecionarGenero(genero);

	}

	@Dado("^clico em receber ofertas$")
	public void clicoEmReceberOfertas() {
		cadastroLogic.ClicarReceberOfertas();

	}

	@Dado("^preencho senha \"([^\"]*)\"$")
	public void preenchoSenha(String senha) {
		cadastroLogic.preencherSenha(senha);
		;

	}

	@Dado("^preencho confirmar senha \"([^\"]*)\"$")
	public void preenchoConfirmarSenha(String confirmarSenha) {
		cadastroLogic.preencherConfirmarSenha(confirmarSenha);

	}

	@Quando("^clico enviar$")
	public void clicoEnviar() {
		cadastroLogic.clicarEnviar();

	}

}