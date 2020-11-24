package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class AnotarDocumentoPage extends BasePage {
	
	public void escreveCampoNota(String sMotivo) throws InterruptedException {
		By byCampoMotivo = By.name("descrMov");
		funcionalidades.escreverTexto(byCampoMotivo, sMotivo);
	}
	
	public void clicarBotaoOK() throws InterruptedException {
		By byBotaoOK = By.xpath("//input[@type=\"submit\"]");
		funcionalidades.clicarBotao(byBotaoOK);
	}

}
