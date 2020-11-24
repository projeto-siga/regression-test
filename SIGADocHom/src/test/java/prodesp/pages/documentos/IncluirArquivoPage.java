package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class IncluirArquivoPage extends BasePage {
	
	public boolean labelAnexacacaoDeArquivoAuxiliar() throws InterruptedException {
		By byLabelAnexacaoDeArquivoAuxiliar = By.xpath("//div[@class=\"card-header\"]");
		return funcionalidades.elementoExiste(byLabelAnexacaoDeArquivoAuxiliar);
	}

	public void clicarBotaoSelecaoDeArquivo() throws InterruptedException {
		By byBotaoSelecaoDeArquivo = By.xpath("//*[@id=\"idSelecaoArquivo\"]");
		funcionalidades.clicarBotao(byBotaoSelecaoDeArquivo);
		}
	
	public void botaoOK() throws InterruptedException {
		By byBotaoOK = By.id("//input[@class=\"btn btn-primary\"]");
		funcionalidades.clicarBotao(byBotaoOK);
	}

	public void botaoVoltar() throws InterruptedException {
		By byBotaoVoltar = By.id("//input[@class=\"btn btn-cancel ml-2\"]");
		funcionalidades.clicarBotao(byBotaoVoltar);
	}
	
}
