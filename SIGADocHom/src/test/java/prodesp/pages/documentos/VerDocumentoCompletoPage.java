package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class VerDocumentoCompletoPage extends BasePage {
	
	public boolean labelRelacaoDeDocumentosUnidade() throws InterruptedException {
		By byLabelRelacaoDeDocumentosUnidade = By.xpath("//div[@class=\"card-header\"]");
		return funcionalidades.elementoExiste(byLabelRelacaoDeDocumentosUnidade);
	}
	
	public void botaoHTML() throws InterruptedException {
		By byBotaoHTML = By.id("radioHTML");
		funcionalidades.clicarBotao(byBotaoHTML);
	}
	
	public void botaoPDF() throws InterruptedException {
		By byBotaoPDF = By.xpath("radioPDF");
		funcionalidades.clicarBotao(byBotaoPDF);
		
	}
	
	public void botaoTelaCheia() throws InterruptedException {
		By byBotaoTelaCheia = By.xpath("TelaCheia");
		funcionalidades.clicarBotao(byBotaoTelaCheia);
	}
	
	
	

}
