package prodesp.pages.acesso;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class SuaConexaoNaoEParticularPage extends BasePage {
		
	public void clicarBotaoAvancado() throws InterruptedException {
		By byBotaoAvancado= By.id("details-button");
		funcionalidades.clicarBotao(byBotaoAvancado);
	}
	
	public void clicarLinkIrParaLink() throws InterruptedException {
	By byLinkIrPara = By.id("proceed-link");
	funcionalidades.clicarBotao(byLinkIrPara);
	}
	

}
