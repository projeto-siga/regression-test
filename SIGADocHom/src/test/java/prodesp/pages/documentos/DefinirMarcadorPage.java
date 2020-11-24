package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class DefinirMarcadorPage extends BasePage {
	
	public void clicarMarcadorUrgente() throws InterruptedException {
		By byCheckboxUrgente = By.id("marcador-1000");
		funcionalidades.clicarCheck(byCheckboxUrgente);
	}
	
	public void clicarMarcadorIdoso() throws InterruptedException {
		By byCheckboxIdoso = By.id("marcador-1001");
		funcionalidades.clicarCheck(byCheckboxIdoso);
	}
	public void clicarMarcadorPrioritario() throws InterruptedException {
		By byCheckboxPrioritario = By.id("marcador-1003");
		funcionalidades.clicarCheck(byCheckboxPrioritario);
	}
	public void clicarMarcadorRestricaoDeAcesso() throws InterruptedException {
		By byCheckboxRestricaoDeAcesso = By.id("marcador-1004");
		funcionalidades.clicarCheck(byCheckboxRestricaoDeAcesso );
	}
	public void clicarMarcadorDocumentoAnalisado() throws InterruptedException {
		By byCheckboxMarcadorDocumentoAnalisado = By.id("marcador-1005");
		funcionalidades.clicarCheck(byCheckboxMarcadorDocumentoAnalisado);
	}
	
	public void clicarMarcadorDemandaJudicialPrioridadeBaixa() throws InterruptedException {
		By byCheckboxDemandaJudicialPrioridadeBaixa = By.id("marcador-1008");
		funcionalidades.clicarCheck(byCheckboxDemandaJudicialPrioridadeBaixa);
	}
	
	public void clicarMarcadorDemandaJudicialPrioridadeMedia() throws InterruptedException {
		By byCheckboxDemandaJudicialPrioridadeMedia = By.id("marcador-1009");
		funcionalidades.clicarCheck(byCheckboxDemandaJudicialPrioridadeMedia);
	}
	
	
	public void clicarMarcadorDemandaJudicialPrioridadeAlta() throws InterruptedException {
		By byCheckboxDemandaJudicialPrioridadeAlta = By.id("marcador-1010");
		funcionalidades.clicarCheck(byCheckboxDemandaJudicialPrioridadeAlta);
	}
	
	public void clicarMarcadorCovid19() throws InterruptedException {
		By byCheckboxCovid19 = By.id("marcador-1006");
		funcionalidades.clicarCheck(byCheckboxCovid19);
	}
	
	public void clicarMarcadorNotaDeEmpenho() throws InterruptedException {
		By byCheckboxNotaDeEmpenho = By.id("marcador-1007");
		funcionalidades.clicarCheck(byCheckboxNotaDeEmpenho);
	}
	
	public void clicarBotaoOK() throws InterruptedException {
		By byBotaoOK = By.xpath("//input[@type=\"submit\"]");
		funcionalidades.clicarBotao(byBotaoOK);
	}
	
	

}
