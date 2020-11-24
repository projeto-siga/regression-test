package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class ReclassificarDocumentoPage extends BasePage {
	
	
	public void escreveCampoNovaClassificacao(String sNovaClassificacao) throws InterruptedException {
		By byCampoNovaClassificacao = By.id("formulario_classificacaoSel_sigla");
		funcionalidades.escreverTexto(byCampoNovaClassificacao, sNovaClassificacao);
	}
	
	public void clicarCampoSelSpan() throws InterruptedException {
		By byCampoSelSpan = By.id("classificacaoSelSpan");
		funcionalidades.clicarBotao(byCampoSelSpan);
	}
	
	
	public void escreveCampoMotivo(String sMotivo) throws InterruptedException {
		By byCampoMotivo = By.name("descrMov");
		funcionalidades.escreverTexto(byCampoMotivo, sMotivo);
	}
	
	public void clicarBotaoOK() throws InterruptedException {
		By byBotaoOK = By.xpath("//button[@type=\"submit\"]");
		funcionalidades.clicarBotao(byBotaoOK);
	}

}
