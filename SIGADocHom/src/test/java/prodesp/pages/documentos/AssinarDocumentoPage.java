package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class AssinarDocumentoPage extends BasePage {

	public boolean labelConfirmeOsDadosDoDocumentoAbaixo() throws InterruptedException {
		By byLabelConfirmeOsDadosDoDocumentoAbaixo = By.xpath("//div[@class=\"card-header\"]");
		return funcionalidades.elementoExiste(byLabelConfirmeOsDadosDoDocumentoAbaixo);
	}

	public void clicarCheckboxAssinar( ) {
		By byCheckboxAssinarAbaixo = By.id("ad_password_0");
		funcionalidades.clicarCheck(byCheckboxAssinarAbaixo);
	}
	
	
	public void clicarBotaoAssinarAbaixo() throws InterruptedException {
		By byBotaoAssinarAbaixo = By.xpath("//*[@id=\"bot-assinar\"]");
		funcionalidades.clicarBotao(byBotaoAssinarAbaixo);
	}

	public void escreveCampoMatricula(String sCampoMatricula) throws InterruptedException {
		By byCampoMatricula = By.id("nomeUsuarioSubscritor");
		funcionalidades.escreverTexto(byCampoMatricula, sCampoMatricula);
	}

	public void escreveCampoSenha(String sCampoSenha) throws InterruptedException {
		By byCampoSenha = By.id("senhaUsuarioSubscritor");
		funcionalidades.escreverTexto(byCampoSenha, sCampoSenha);
	}
	
	public void clicarBotaoOK() throws InterruptedException {
		By byBotaoOK = By.xpath("//button[text()=\"OK\"]");
		funcionalidades.clicarBotao(byBotaoOK);
	}
	
	public void botaoVoltar() throws InterruptedException {
		By byBotaoVoltar = By.xpath("//input[@class=\"btn btn-secondary mr-2\"]");
		funcionalidades.clicarBotao(byBotaoVoltar);
	}

	public void checkboxComSenha() throws InterruptedException {
		By byCheckboxComSenha = By.id("ad_password_0");
		funcionalidades.clicarBotao(byCheckboxComSenha);
	}
	
	public void botaoOkDesejaContinuarArquivamento() {
		
		
	}

}
