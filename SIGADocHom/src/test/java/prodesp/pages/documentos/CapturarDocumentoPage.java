package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class CapturarDocumentoPage extends BasePage {

	public void clicarBotaoSelecioneArquivo() throws InterruptedException {
		By byBotaoSelecioneArquivo = By.id("arquivo");
		funcionalidades.clicarBotao(byBotaoSelecioneArquivo);
	}

	public void escreverCaminhoArquivo(String sCaminhoArquivo) throws InterruptedException {
		By byEscreverCaminhoArquivo = By.id("arquivo");
		funcionalidades.escreverTexto(byEscreverCaminhoArquivo, sCaminhoArquivo);
	}
	
	public void escreverCampoAssunto(String sAssunto) throws InterruptedException {
		By byCampoAssunto = By.name("Assunto");
		funcionalidades.escreverTexto(byCampoAssunto, sAssunto);
	}
	
	public void escreverCampoDescricao(String sDescricao) throws InterruptedException {
		By byCampoDescricao = By.name("outros");
		funcionalidades.escreverTexto(byCampoDescricao, sDescricao);
	}
	
	public void clicarBotaoOK( ) throws InterruptedException {
		By byBotaoOK = By.name("especie");
		funcionalidades.clicarBotao(byBotaoOK);
	}
	
	public void selecionaComboModelo(String sModelo) throws InterruptedException {
		By byComboModelo = By.name("especie");
		funcionalidades.selecionarCombo(byComboModelo, sModelo);
	}
	
	
	

}
