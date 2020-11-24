package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class CienciaDocumentoPage extends BasePage {
	
	public void escreveCampoMotivo(String sMotivo) throws InterruptedException {
		By byCampoMotivo = By.name("descrMov");
		funcionalidades.escreverTexto(byCampoMotivo, sMotivo);
	}
	
	public void clicarBotaoOK() throws InterruptedException {
		By byBotaoOK = By.id("btnSubmit");
		funcionalidades.clicarBotao(byBotaoOK);
	}

}
