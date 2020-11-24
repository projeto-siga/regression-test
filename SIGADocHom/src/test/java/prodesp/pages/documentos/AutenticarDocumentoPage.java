package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class AutenticarDocumentoPage extends BasePage {
	

	public void clicarBotaoAutenticar() throws InterruptedException {
		By byBotaoAutenticar = By.id("bot-autenticar");
		funcionalidades.clicarBotao(byBotaoAutenticar);
	}

	
	public void clicarOKAutenticacao () throws InterruptedException {
	By byBotaoOK = By.id("//button[text()=\"OK\"]");
	funcionalidades.clicarBotao(byBotaoOK);
		
	}

	
}
