package prodesp.pages.config;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class NovaClassificacaoDocumentalPage extends BasePage {
	
	public void escreveCampoCodificacao(String sCodificacao) throws InterruptedException {
		By byCodificacao = By.id("codificacao");
		funcionalidades.escreverTextoComMascara(byCodificacao, sCodificacao);}
	
	public void escreveCampoDescricao(String sDescricao) throws InterruptedException {
	By byDescricao = By.id("descrClassificacao");
	funcionalidades.escreverTexto(byDescricao, sDescricao);	
	}
	
	
	public void clicarBotaoGravarPrimeiro() throws InterruptedException {
		By byGravar = By.xpath("//button[@onclick=\"javascript:gravarClassificacao()\"]");
		funcionalidades.clicarBotao(byGravar);
	}
	
	

}
