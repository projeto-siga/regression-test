package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class JuntarDocumentoPage extends BasePage {

	public void clicarComboDocumento(String sTipoDocumento) {
		By byComboDocumento = By.id("idDocumentoEscolha");
		funcionalidades.selecionarCombo(byComboDocumento, sTipoDocumento);
	}

	public void escreveCampoDocumento(String sNomeDocumento) throws InterruptedException {
		By byCampoDocumento = By.id("formulario_documentoRefSel_sigla");
		funcionalidades.escreverTexto(byCampoDocumento, sNomeDocumento);
	}
	
	public void clicarCampoDocumento() throws InterruptedException {
		By byCampoDocumento = By.id("formulario_documentoRefSel_sigla");
		funcionalidades.clicarBotao(byCampoDocumento);
	}

	public void clicarDocumentoRefSelSpan() throws InterruptedException {
		By byDocumentoRefSelSpan = By.id("documentoRefSelSpan");
		funcionalidades.clicarBotao(byDocumentoRefSelSpan);
	}
	
	public void clicarBotaoOk( ) throws InterruptedException {
		By byBotaoOk = By.xpath("//button[text()=\"Ok\"]");
		funcionalidades.clicarBotao(byBotaoOk);
	}

}
