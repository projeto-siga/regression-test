package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class RedefinirAcessoPage extends BasePage {
	
		public void selecionaDefinicaoDeAcesso (String sDefinicaoDeAcesso){
		By byComboDefinicaoDeAcesso = By.name("nivelAcesso");
		funcionalidades.selecionarCombo(byComboDefinicaoDeAcesso, sDefinicaoDeAcesso);
		}
	
	public void clicarBotaoOK() throws InterruptedException {
		By byBotaoOK = By.xpath("//input[@type=\"submit\"]");
		funcionalidades.clicarBotao(byBotaoOK);
	}

}
