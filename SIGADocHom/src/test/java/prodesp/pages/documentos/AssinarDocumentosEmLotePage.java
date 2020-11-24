package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class AssinarDocumentosEmLotePage extends BasePage {
	
	public void checkboxAssinaTodos () {
		By byAssinaTodos = By.xpath("//input[@name=\"checkall\"]");
		funcionalidades.clicarCheck(byAssinaTodos);
	}

	public void clicarBotaoAssinarSenha () throws InterruptedException {
		By byBotaoAssinar = By.id("bot-assinar-senha");
		funcionalidades.clicarBotao(byBotaoAssinar);
	}

	public void escreveCampoMatricula(String sCampoMatricula) throws InterruptedException {
		By byCampoMatricula = By.id("nomeUsuarioSubscritor");
		funcionalidades.escreverTexto(byCampoMatricula, sCampoMatricula);
	}

	public void escreveCampoSenha(String sCampoSenha) throws InterruptedException {
		By byCampoSenha = By.id("senhaUsuarioSubscritor");
		funcionalidades.escreverTexto(byCampoSenha, sCampoSenha);
	}
	
	public void botaoAssinarLote() throws InterruptedException {
		By byBotaoAssinarLote = By.xpath("//span[text()=\"Assinar\"]");
		funcionalidades.clicarBotao(byBotaoAssinarLote);
		}
}
