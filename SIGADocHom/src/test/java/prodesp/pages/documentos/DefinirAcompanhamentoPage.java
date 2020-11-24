package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class DefinirAcompanhamentoPage extends BasePage {
	public boolean labelAcompanhamentoDoDocumento() throws InterruptedException {
		By byLabelAcompanhamentoDoDocumento = By.xpath("//h5[text()=\"Acompanhamento do Documento\"]");
		return funcionalidades.elementoExiste(byLabelAcompanhamentoDoDocumento);
	}

	public void comboTipoResponsavel(String sTipoResponsavel) {
		By byComboTipoResponsavel = By.id("tipoResponsavel");
		funcionalidades.selecionarCombo(byComboTipoResponsavel, sTipoResponsavel);
	}

	public void campoResponsavel(String sDadosDeUsuario) throws InterruptedException {
		By byCampoResponsavel = By.id("formulario_responsavelSel_sigla");
		funcionalidades.escreverTexto(byCampoResponsavel, sDadosDeUsuario);
	}

	public boolean labelResponsavel() throws InterruptedException {
		By byLabelResponsavel = By.id("responsavelSelSpan");
		return funcionalidades.elementoExiste(byLabelResponsavel);

	}

	public void comboPerfil(String sPerfil) throws InterruptedException {
		By byComboPerfil = By.name("idPapel");
		funcionalidades.escreverTexto(byComboPerfil, sPerfil);
	}

	public void botaoOK() throws InterruptedException {
		By byBotaoOK = By.xpath("//input[@class=\"btn btn-primary\"]");
		funcionalidades.clicarBotao(byBotaoOK);
	}

	public void botaoVoltar() throws InterruptedException {
		By byBotaoVoltar = By.xpath("//input[@class=\"btn btn-cancel ml-2\"]");
		funcionalidades.clicarBotao(byBotaoVoltar);

	}

	public void clicarLabelNomeDoResponsavel() throws InterruptedException {
		By byLabelNomeDoResponsavel = By.id("responsavelSelSpan");
		funcionalidades.clicarBotao(byLabelNomeDoResponsavel);
	}

}
