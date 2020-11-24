package prodesp.pages.config;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class ClassificacaoDocumentalPage extends BasePage {
	
	public void clicarBotaoNovaClassificacao() throws InterruptedException {
		By byBotaoNovaClassificacao = By.id("btNovaClassif");
		funcionalidades.clicarBotao(byBotaoNovaClassificacao);
	}

}
