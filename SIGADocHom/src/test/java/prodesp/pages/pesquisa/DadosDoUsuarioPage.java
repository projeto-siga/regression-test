package prodesp.pages.pesquisa;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class DadosDoUsuarioPage extends BasePage {

	public void acionarBotaoPesquisa() throws InterruptedException {
		By byBotaoPesquisa = By.xpath("//button[@type=\"submit\"]");
		funcionalidades.clicarBotao(byBotaoPesquisa);
	}


}
