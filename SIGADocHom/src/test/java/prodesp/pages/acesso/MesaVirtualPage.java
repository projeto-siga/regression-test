package prodesp.pages.acesso;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class MesaVirtualPage extends BasePage {

	public boolean verificaExistenciaMesaVirtual() throws InterruptedException {
		By byMesaVirtual = By.xpath("//h2[text()=\" Mesa Virtual\"]");
		return funcionalidades.elementoExiste(byMesaVirtual);
	}
	
	public void clicarLogoSemPapel() throws InterruptedException {
		By byClicarLogoSemPapel = By.xpath("//img[@src=\"/siga/imagens/logo-sem-papel-cor.png\"]");
    	funcionalidades.clicarBotao(byClicarLogoSemPapel);			
	}
	
	public void clicarMenu() throws InterruptedException {
		By byClicarMenu = By.xpath("//a[@class=\"navbar-brand dropdown-toggle\"]");
		funcionalidades.clicarBotao(byClicarMenu);
	}
	
	public void clicarQuadrosQuantitativos() throws InterruptedException {
		By byClicarQuadrosQuantitativos = By.xpath("//a[@class=\"dropdown-item\" and @href=\"/siga/app/principal?redirecionar=false\"]");
		funcionalidades.clicarBotao(byClicarQuadrosQuantitativos);
	}
	
	public void clicarFerramentas() throws InterruptedException {
		By byClicarFerramentas = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"); //"//a[text()=\"Ferramentas\"]");
		funcionalidades.clicarBotao(byClicarFerramentas);
		
	}
	
	public void clicarFerramentasClassificacaoDocumental() throws InterruptedException {
		By byClicarFerramentasClassificacaoDocumental = By.xpath("//a[@class=\"dropdown-item\" and @href=\"/sigaex/app/expediente/classificacao/listar\"]");
		funcionalidades.clicarBotao(byClicarFerramentasClassificacaoDocumental);
	}
	
	public void escreveCampoBuscaRapida(String sCampoBuscaRapida) throws InterruptedException {
		By byEscreveCampoBuscaRapida = By.id("formulario_buscar_genericoSel_sigla");
		funcionalidades.escreverTexto(byEscreveCampoBuscaRapida, sCampoBuscaRapida);
	}
	
	public void clicarBotaoBuscaRapida() throws InterruptedException {
		By byClicarBotaoBuscaRapida = By.xpath("//button[@class=\"btn btn-primary ml-2 my-2 my-sm-0\"]");
		funcionalidades.clicarBotao(byClicarBotaoBuscaRapida);
	}
	
	public void clicarLinkSair() throws InterruptedException {
		By byBtSair = By.xpath("//i[@class=\"fas fa-sign-out-alt\"]");
		funcionalidades.clicarBotao(byBtSair);
	}

	public void clicarBotaoCriarNovo() throws InterruptedException {
		By byBtCriarNovo = By.xpath("//a[@class=\"btn btn-success form-control\"]");
		funcionalidades.clicarBotao(byBtCriarNovo);
	}
	
	public void clicarBotaoPesquisaAvancada() throws InterruptedException {
		By byBtPesquisaAvancada = By.xpath("//a[@class=\"btn btn-primary form-control\"]");
		funcionalidades.clicarBotao(byBtPesquisaAvancada);
	}
	
	public void escreverCampoFiltrar(String sFiltro) throws InterruptedException {
		By byCampoFiltrar = By.xpath("//input[@placeholder=\"Filtrar\"]");
		funcionalidades.escreverTexto(byCampoFiltrar, sFiltro);
	}
	
	public void clicarBotaoDocumentos() throws InterruptedException {
	By byBotaoDocumentos = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a");
	funcionalidades.clicarBotao(byBotaoDocumentos);
	}
	
	public void clicarBotaoAssinarEmLote() throws InterruptedException {
		By byBotaoAssinarEmLote = By.xpath("//a[@href=\"/sigaex/app/expediente/mov/assinar_lote\"]");
		funcionalidades.clicarBotao(byBotaoAssinarEmLote);
	}
}
