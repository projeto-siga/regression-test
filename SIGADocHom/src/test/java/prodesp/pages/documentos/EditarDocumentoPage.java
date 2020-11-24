package prodesp.pages.documentos;

import org.openqa.selenium.By;

public class EditarDocumentoPage extends NovoDocumentoPage {

	public boolean labelDocumentoTmp() throws InterruptedException {
		By byLabelDocumentoTmp = By.id("codigoDoc");
		return funcionalidades.elementoExiste(byLabelDocumentoTmp);
	}

	public void comboSelecioneOModelo(String sSelecioneOModelo) {
		By bycomboSelecioneOModelo = By.id("dropdownMenuButton");
		funcionalidades.selecionarCombo(bycomboSelecioneOModelo, sSelecioneOModelo);
	}

	public void campoResponsavelPelaAssinatura(String sResponsavelPelaAssinatura) throws InterruptedException {
		By byCampoResponsavelPelaAssinatura = By.id("formulario_exDocumentoDTO.subscritorSel_sigla");
		funcionalidades.escreverTexto(byCampoResponsavelPelaAssinatura, sResponsavelPelaAssinatura);
	}

	public void checkboxSubstituto() {
		By byCheckboxSubstituto = By.name("//input[@name=\"exDocumentoDTO.substituicao\"]");
		funcionalidades.clicarCheck(byCheckboxSubstituto);
	}

	public void checkboxPersonalizar() {
		By byCheckboxPersonalizar = By.name("//input[@name=\"exDocumentoDTO.personalizacao\"]");
		funcionalidades.clicarCheck(byCheckboxPersonalizar);
	}

	public void comboMeusTextosPadrao(String sMeusTextosPadrao) {
		By byComboMeusTextosPadrao = By.id("\"preenchimento\"");
		funcionalidades.selecionarCombo(byComboMeusTextosPadrao, sMeusTextosPadrao);
	}

	public void botaoMeusTextosPadraoEdit() throws InterruptedException {
		By byBotaoMeusTextosPadraoEdit = By.xpath("//i[@class=\"far fa-edit\"]");
		funcionalidades.clicarBotao(byBotaoMeusTextosPadraoEdit);
	}

	public void botaoMeusTextosPadraoTrash() throws InterruptedException {
		By byBotaoMeusTextosPadraoTrash = By.xpath("//i[@class=\"far fa-trash-alt\"]");
		funcionalidades.clicarBotao(byBotaoMeusTextosPadraoTrash);
	}

	public void botaoMeusTextosPadraoPlus() throws InterruptedException {
		By byBotaoMeusTextosPadraoPlus = By.xpath("//i[@class=\"far fa-trash-plus\"]");
		funcionalidades.clicarBotao(byBotaoMeusTextosPadraoPlus);
	}

	public void campoReferencia(String sReferencia) throws InterruptedException {
		By byCampoReferencia = By.name("Referência");
		funcionalidades.escreverTexto(byCampoReferencia, sReferencia);
	}

	public void campoAssunto(String sAssunto) throws InterruptedException {
		By byCampoAssunto = By.name("Assunto");
		funcionalidades.escreverTexto(byCampoAssunto, sAssunto);
	}
	
	public void campoTextoDoMemorando(String sTextoDoMemorando) throws InterruptedException {
		By byTextoDoMemorando = By.xpath("//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]");
		funcionalidades.escreverTexto(byTextoDoMemorando, sTextoDoMemorando);
	}
	
	public void botaoOK() throws InterruptedException {
		By byBotaoOK = By.name("gravar");
		funcionalidades.clicarBotao(byBotaoOK);
	}
	
	public void botaoVisualizarDocumento() throws InterruptedException {
		By byBotaoVisualizarDocumento = By.name("ver_doc_pdf");
		funcionalidades.clicarBotao(byBotaoVisualizarDocumento);
	}
		
	public void botaoVoltar() throws InterruptedException {
		By byBotaoVoltar = By.name("voltar");
		funcionalidades.clicarBotao(byBotaoVoltar);
		
	}
	

}