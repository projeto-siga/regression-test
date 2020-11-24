package prodesp.pages.acesso;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class TrocaSenhaPage extends BasePage {

	public boolean verificaLabelTrocaSenha() throws InterruptedException {
		By byLabelTrocaSenha = By.xpath("//h5[text()=\"Trocar senha\"]");
		return funcionalidades.elementoExiste(byLabelTrocaSenha);
	}

	public void campoUsuario(String sUsuario) throws InterruptedException {
		By byCampoUsuario = By.xpath("//input[@name=\"usuario.nomeUsuario\"]");
		funcionalidades.escreverTexto(byCampoUsuario, sUsuario);
	}

	public void campoSenhaAtual(String sSenhaAtual) throws InterruptedException {
		By bySenhaAtual = By.xpath("//input[@name=\"usuario.senhaAtual\"]");
		funcionalidades.escreverTexto(bySenhaAtual, sSenhaAtual);
	}

	public void campoNovaSenha(String sNovaSenha) throws InterruptedException {
		By byNovaSenha = By.xpath("//input[@name=\"usuario.senhaNova\"]");
		funcionalidades.escreverTexto(byNovaSenha, sNovaSenha);
	}

	public void campoRepeticaoDaNovaSenha(String sRepeticaoDaNovaSenha) throws InterruptedException {
		By byRepeticaoDaNovaSenha = By.xpath("//input[@name=\"usuario.senhaConfirma\"]");
		funcionalidades.escreverTexto(byRepeticaoDaNovaSenha, sRepeticaoDaNovaSenha);
	}
	
	public boolean labelForcaDaNovaSenha() throws InterruptedException {
		By byForcaDaNovaSenha = By.xpath("//label[text()=\"Força da nova senha\"]");
		return funcionalidades.elementoExiste(byForcaDaNovaSenha);
	}
	
	public void labelDescricaoForcaSenha() throws InterruptedException {
		By byDescricaoForcaSenha = By.xpath("//*[@id=\"passwordDescription\"]");
		funcionalidades.obterGetText(byDescricaoForcaSenha);
	}
	
	public void botaoOK() throws InterruptedException {
		By byBotaoOK = By.xpath("//button[@class=\"btn btn-primary\" and @type=\"submit\"]");
		funcionalidades.clicarBotao(byBotaoOK);
	}
}
