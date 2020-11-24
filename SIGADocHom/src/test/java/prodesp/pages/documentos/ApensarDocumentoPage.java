package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class ApensarDocumentoPage extends BasePage {
	
	public void escreveNomeDocumento(String sDocumento) throws InterruptedException {
		By byCampoNomeDocumento = By.name("documentoRefSel.sigla");
		funcionalidades.escreverTexto(byCampoNomeDocumento, sDocumento);
	}
	
	public void clicarDocumentoSelecionado() throws InterruptedException {
		By byDocumentoSelecionado = By.id("documentoRefSelSpan");
		funcionalidades.clicarBotao(byDocumentoSelecionado);
	}
	
	public void clicarBotaoOK() throws InterruptedException {
		By byBotaoOK = By.id("btnSubmit");
		funcionalidades.clicarBotao(byBotaoOK);
	}

}
