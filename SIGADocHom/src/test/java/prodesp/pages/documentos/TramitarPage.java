package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class TramitarPage extends BasePage {

	public void selecionaComboDestinatario(String sDestinatario) {
		By byComboDestinatario = By.name("tipoResponsavel");
		funcionalidades.selecionarCombo(byComboDestinatario, sDestinatario);
	}

	public void escreveCampoSelSigla(String sSelSigla) throws InterruptedException {
		By byCampoSelSigla = By.id("formulario_responsavelSel_sigla");
		funcionalidades.escreverTexto(byCampoSelSigla, sSelSigla);
	}

	public void clicarResponsavelSelSpan() throws InterruptedException {
		By byResponsavel = By.id("responsavelSelSpan");
		funcionalidades.clicarBotao(byResponsavel);
	}

	public void escreverDataDevolucao(String sDataDevolucao) throws InterruptedException {
		By byCampoDataDevolucao = By.name("dtDevolucaoMovString");
		funcionalidades.escreverTexto(byCampoDataDevolucao, sDataDevolucao);

	}

	public void clicarBotaoOk() throws InterruptedException {
		By byBotaoOk = By.id("button_ok");
		funcionalidades.clicarBotao(byBotaoOk);
	}
}
