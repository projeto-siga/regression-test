package prodesp.pages.config;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class NovoModeloPage extends BasePage {

	public void escreveCampoNome(String sNome) throws InterruptedException {
		By byNome = By.name("nome");
		funcionalidades.escreverTexto(byNome, sNome);
	}

	public void escreveCampoDescricao(String sDescricao) throws InterruptedException {
		By byDescricao = By.name("descricao");
		funcionalidades.escreverTexto(byDescricao, sDescricao);
	}

	public void escreveCampoClassificacao(String sClassificacao) throws InterruptedException {
		By byClassificacao = By.name("classificacaoSel.sigla");
		funcionalidades.escreverTexto(byClassificacao, sClassificacao);
	}

	public void escreveCampoClassificacaoCriacaoVias(String sClassificacaoCriacaoVias) throws InterruptedException {
		By byClassificacaoCriacaoVias = By.name("classificacaoCriacaoViasSel.sigla");
		funcionalidades.escreverTexto(byClassificacaoCriacaoVias, sClassificacaoCriacaoVias);
	}

	public void selecionaComboEspecie(String sEspecie) {
		By byEspecie = By.name("forma");
		funcionalidades.selecionarCombo(byEspecie, sEspecie);
	}

	public void selecionaComboNivelDeAcesso(String sNivelAcesso) {
		By byNivelDeAcesso = By.name("nivel");
		funcionalidades.selecionarCombo(byNivelDeAcesso, sNivelAcesso);
	}

	public void escreveCampoDiretorio(String sDiretorio) throws InterruptedException {
		By byDiretorio = By.name("diretorio");
		funcionalidades.escreverTexto(byDiretorio, sDiretorio);
	}

	public void selecionaComboModelo(String sModelo) {
		By byModelo = By.name("tipoModelo");
		funcionalidades.selecionarCombo(byModelo, sModelo);
	}

	public void clicarBotaoOK() throws InterruptedException {
		By byBotaoOK = By.xpath("//input[@value=\"Ok\"]");
		funcionalidades.clicarBotao(byBotaoOK);
	}

}
