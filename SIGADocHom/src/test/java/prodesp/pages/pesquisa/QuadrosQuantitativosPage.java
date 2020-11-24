package prodesp.pages.pesquisa;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class QuadrosQuantitativosPage extends BasePage {

	public boolean verificaLabelExpedientes() throws InterruptedException {
		By byVerificaLabelExpedientes = By.xpath("//div[@class=\"card-header\" and text()=\"Expedientes\"]");
		return funcionalidades.elementoExiste(byVerificaLabelExpedientes);
	}
	
	public void clicarBotaoPesquisaAvancada() throws InterruptedException {
		By byBotaoPesquisaAvancada = By.xpath("//a[@class=\"btn btn-primary float-right btn-sm ml-2\" and @title=\"Pesquisar expedientes e processos administrativos\"]");
		funcionalidades.clicarBotao(byBotaoPesquisaAvancada);
			}
	
	public void clicarBotaoCriarNovo() throws InterruptedException {
		By byBotaoCriarNovo = By.xpath("//a[@class=\"btn btn-primary float-right btn-sm ml-2\" and @title=\"Criar novo expediente ou processo administrativo\"]");
		funcionalidades.clicarBotao(byBotaoCriarNovo);
	}
}
