package prodesp.pages.config;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class EditarClassificacaoDocumentalPage extends BasePage {

	public void clicarBotaoAdicionarVia() throws InterruptedException {
		By byAdicionarVia = By.xpath("//button[@onclick=\"javascript:adicionarVia()\"]");
		funcionalidades.clicarBotao(byAdicionarVia);
	}

	public void selecionaComboDestino(String sDestino) {
		By byDestino = By.name("idDestino");
		funcionalidades.selecionarCombo(byDestino, sDestino);
	}

	public void selecionaComboArquivoCorrente(String sArquivoCorrente) {
		By byArquivoCorrente = By.name("idTemporalidadeArqCorr");
		funcionalidades.selecionarCombo(byArquivoCorrente, sArquivoCorrente);
	}

	public void selecionaComboArquivoIntermediario(String sArquivoIntermediario) {
		By byArquivoIntermediario = By.name("idTemporalidadeArqInterm");
		funcionalidades.selecionarCombo(byArquivoIntermediario, sArquivoIntermediario);

	}

	public void selecionaComboDestinacaoFinal(String sDestinacaoFinal) {
		By byDestinacaoFinal = By.name("idDestinacaoFinal");
		funcionalidades.selecionarCombo(byDestinacaoFinal, sDestinacaoFinal);
	}

	public void escreveCampoObservacao(String sObservacao) throws InterruptedException {
		By byCampoObservacao = By.name("obsVia");
		funcionalidades.escreverTexto(byCampoObservacao, sObservacao);
	}

	public void clicarBotaoGravarSegundo() throws InterruptedException {
		By byGravar = By.xpath("//button[@onclick=\"javascript:gravarExVia(0)\"]");
		funcionalidades.clicarBotao(byGravar);
	}

}
