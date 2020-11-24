package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class NovoDocumentoPage extends BasePage {
	public boolean labelDocumentoNovo() throws InterruptedException {
		By labelDocumentoNovo = By.id("codigoDoc");
		return funcionalidades.elementoExiste(labelDocumentoNovo);
	}
	
	public void clicarBotaoSelecioneOModelo() throws InterruptedException {
		By byBotaoSelecioneOModelo = By.id("dropdownMenuButton");
		funcionalidades.clicarBotao(byBotaoSelecioneOModelo);		
	}
		
	public void selecionaPesquisarModelo(String sPesquisa) throws InterruptedException {
		By byTextoPesquisa = By.xpath("//input[@placeholder=\"Pesquisar modelo...\"]");
		funcionalidades.escreverTexto(byTextoPesquisa, sPesquisa);
	}
	
	public void selecionaListaModelo(String sModelo) throws InterruptedException {
		funcionalidades.clicarLink(sModelo);					
	}
	
	public void clicarDocumentoCapturado() throws InterruptedException {
		By byBotaoDocumentoCapturado = By.xpath("//a[text()=\"Documento Capturado\"]");
		funcionalidades.clicarBotao(byBotaoDocumentoCapturado);
	}

	public void campoResponsavelPelaAssinatura(String sResponsavelPelaAssinatura) throws InterruptedException {
		By byCampoResponsavelPelaAssinatura = By.id("formulario_exDocumentoDTO.subscritorSel_sigla");
		funcionalidades.escreverTexto(byCampoResponsavelPelaAssinatura, sResponsavelPelaAssinatura);
	}

	public void clicarLabelSubscritorSelecionado() throws InterruptedException {
		By byLabelSubscritorSelecionado = By.id("exDocumentoDTO.subscritorSelSpan");
		funcionalidades.clicarBotao(byLabelSubscritorSelecionado);
	}

	public void checkboxSubstituto() {
		By byCheckboxSubstituto = By.name("exDocumentoDTO.substituicao");
		funcionalidades.clicarCheck(byCheckboxSubstituto);
	}

	public void checkboxPersonalizar() {
		By byCheckboxPersonalizar = By.name("exDocumentoDTO.personalizacao");
		funcionalidades.clicarCheck(byCheckboxPersonalizar);

	}

	public void campoPersonalizarFuncao(String sFuncao) throws InterruptedException {
		By byCampoFuncao = By.id("personalizarFuncao");
		funcionalidades.escreverTexto(byCampoFuncao, sFuncao);
	}

	public void campoPersonalizarUnidade(String sUnidade) throws InterruptedException {
		By byCampoUnidade = By.id("personalizarUnidade");
		funcionalidades.escreverTexto(byCampoUnidade, sUnidade);
	}

	public void campoSubstitutoResponsavelAssinatura(String sSubstituto) throws InterruptedException {
		By byCampoSubstitutoResponsavel = By.id("formulario_exDocumentoDTO.titularSel_sigla");
		funcionalidades.escreverTexto(byCampoSubstitutoResponsavel, sSubstituto);
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
	
	public void campoInteressado(String sInteressado) throws InterruptedException {
		By byCampoInteressado = By.name("Interessado");
		funcionalidades.escreverTexto(byCampoInteressado, sInteressado);
	}

	public void campoAssunto(String sAssunto) throws InterruptedException {
		By byCampoAssunto = By.name("Assunto");
		funcionalidades.escreverTexto(byCampoAssunto, sAssunto);
	}

	public void campoReferencia(String sReferencia) throws InterruptedException {
		By byCampoReferencia = By.name("Referência");
		funcionalidades.escreverTexto(byCampoReferencia, sReferencia);
	}


	public void campoTextoDoMemorando(String sTextoDoMemorando) throws InterruptedException {
		By byTextoDoMemorando = By.className("cke_wysiwyg_frame");
		funcionalidades.escreverTextoEmIFrame(byTextoDoMemorando, sTextoDoMemorando);
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

	public void clicarBotaoIncluirArquivo() throws InterruptedException {
		By byBotaoIncluirArquivo = By.xpath("//a[@class=\"btn btn-sm btn-secondary\"]");
		funcionalidades.clicarBotao(byBotaoIncluirArquivo);
	}
	
	public void clicarBotaoCancelarArquivoIncluido() throws InterruptedException {
	By byBotaoCancelarArquivoIncluido = By.xpath("//a[text()=\"Cancelar\"]");
	funcionalidades.clicarBotao(byBotaoCancelarArquivoIncluido);
	}
	

}
