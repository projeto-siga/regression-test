package prodesp.pages.pesquisa;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class PesquisaAvancadaPage extends BasePage {

	public boolean verificaPesquisaAvancadaLabel() throws InterruptedException {
		By byLabelPesquisaAvancada = By.xpath("//h5[\"Pesquisar Documentos\"]");
		return funcionalidades.elementoExiste(byLabelPesquisaAvancada);
	}

	public void campoDescricao(String sDescricao) throws InterruptedException {
		By byCampoDescricao = By.name("descrDocumento");
		funcionalidades.escreverTexto(byCampoDescricao, sDescricao);
	}

	public void comboSituacao(String sSituacao) {
		By byComboSituacao = By.id("ultMovIdEstadoDoc");
		funcionalidades.selecionarCombo(byComboSituacao, sSituacao);
	}

	public void comboUsuarioUnidade(String sUsuarioUnidade) {
		By byComboUsuarioUnidade = By.id("ultMovTipoResp");
		funcionalidades.selecionarCombo(byComboUsuarioUnidade, sUsuarioUnidade);
	}

	public void campoUsuario(String sCampoUsuario) throws InterruptedException {
		By byCampoUsuario = By.id("formulario_ultMovRespSel_sigla");
		funcionalidades.escreverTexto(byCampoUsuario, sCampoUsuario);
	}

	public boolean labelUsuario() throws InterruptedException {
		By byLabelUsuario = By.id("ultMovRespSelSpan");
		return funcionalidades.elementoExiste(byLabelUsuario);
	}

	public void comboOrgao(String sOrgao) {
		By byComboOrgao = By.id("orgaoUsu");
		funcionalidades.selecionarCombo(byComboOrgao, sOrgao);
	}

	public void campoDataInicial(String sDataInicial) throws InterruptedException {
		By byCampoDataInicial = By.id("dtDocString");
		funcionalidades.escreverTexto(byCampoDataInicial, sDataInicial);
	}

	public void campoDataFinal(String sDataFinal) throws InterruptedException {
		By byCampoDataFinal = By.id("dtDocFinalString");
		funcionalidades.escreverTexto(byCampoDataFinal, sDataFinal);
	}

	public void comboAnoEmissaoString(String sAnoEmissaoString) {
		By byComboAnoEmissaoString = By.id("anoEmissaoString");
		funcionalidades.selecionarCombo(byComboAnoEmissaoString, sAnoEmissaoString);
	}

	public void campoNumeroExpediente(String sNumeroExpediente) throws InterruptedException {
		By byCampoNumeroExpediente = By.name("numExpediente");
		funcionalidades.escreverTexto(byCampoNumeroExpediente, sNumeroExpediente);
	}

	public void campoResponsavelPelaAssinatura(String sResponsavelPelaAssinatura) throws InterruptedException {
		By byCampoResponsavelPelaAssinatura = By.id("formulario_subscritorSel_sigla");
		funcionalidades.escreverTexto(byCampoResponsavelPelaAssinatura, sResponsavelPelaAssinatura);
	}

	public boolean labelSubscritorSelSpan() throws InterruptedException {
		By byLabelSubscritorSelSpan = By.id("subscritorSelSpan");
		return funcionalidades.elementoExiste(byLabelSubscritorSelSpan);
	}

	public void comboUsuarioCadastrante(String sUsuarioCadastrante) {
		By byComboUsuarioCadastrante = By.id("tipoCadastrante");
		funcionalidades.selecionarCombo(byComboUsuarioCadastrante, sUsuarioCadastrante);
	}

	public void campoFormularioCadastranteSelSigla(String sFormularioCadastranteSelSigla) throws InterruptedException {
		By byCampoFormularioCadastrante = By.id("formulario_cadastranteSel_sigla");
		funcionalidades.escreverTexto(byCampoFormularioCadastrante, sFormularioCadastranteSelSigla);
	}

	public boolean labelCadastranteSelSpan() throws InterruptedException {
		By byLabelCadastranteSelSpan = By.id("formulario_cadastranteSel_sigla");
		return funcionalidades.elementoExiste(byLabelCadastranteSelSpan);

	}

	public void comboTipoDestinatario(String STipoDestinatario) throws InterruptedException {
		By byComboTipoDestinatario = By.id("tipoDestinatario");
		funcionalidades.escreverTexto(byComboTipoDestinatario, STipoDestinatario);
	}

	public void comboFormularioLotacaoDestinatarioSelSigla(String SFormularioLotacaoDestinatario) {
		By byComboFormularioLotacaoDestinarioSelSigla = By.id("formulario_lotacaoDestinatarioSel_sigla");
		funcionalidades.selecionarCombo(byComboFormularioLotacaoDestinarioSelSigla, SFormularioLotacaoDestinatario);
	}

	public boolean labelLotacaoDestinatarioSelSpan() throws InterruptedException {
		By byLabelLotacaoDestinatarioSelSpan = By.id("lotacaoDestinatarioSelSpan");
		return funcionalidades.elementoExiste(byLabelLotacaoDestinatarioSelSpan);

	}

	public void campoClassificacaoDocumental(String sClassificacaoDocumental) throws InterruptedException {
		By byCampoClassificacaoDocumental = By.id("formulario_classificacaoSel_sigla");
		funcionalidades.escreverTexto(byCampoClassificacaoDocumental, sClassificacaoDocumental);

	}

	public boolean labelClassificacaoSelSpan() throws InterruptedException {
		By byLabelClassificacaoSelSpan = By.id("classificacaoSelSpan");
		return funcionalidades.elementoExiste(byLabelClassificacaoSelSpan);
	}

	public void comboOrdenacaoDoResultado(String sOrdenacaoDoResultado) {
		By byComboOrdenacaoDoResultado = By.id("ordem");
		funcionalidades.selecionarCombo(byComboOrdenacaoDoResultado, sOrdenacaoDoResultado);
	}

	public void comboVisualizacaoDoResultado(String sVisualizacaoDoResultado) {
		By byComboVisualizacaoDoResultado = By.id("visualizacao");
		funcionalidades.selecionarCombo(byComboVisualizacaoDoResultado, sVisualizacaoDoResultado);

	}

	public void clicarBotaoBuscar() throws InterruptedException {
		By byBotaoBuscar = By.id("btnBuscar");
		
		funcionalidades.clicarBotao(byBotaoBuscar);
	}

	public void clicarBotaoVoltar() throws InterruptedException {
		By byBotaoVoltar = By.xpath("//input[@value=\"Voltar\"]");
		funcionalidades.clicarBotao(byBotaoVoltar);
	}
	
	public boolean verificarTextoNaTabela(String nomeColuna, String valorProcurado) {
		By byTabela = By.xpath("//table[1]");		
	    int idColuna = obterIdColunaPesquisaAvancada(nomeColuna);
		return funcionalidades.obterValorIdColunaTabela(byTabela, idColuna, valorProcurado);
	}
	
	//será necessário identificar o grupo dos campos Unidade/Usuário/Data como Assinatura ou Situação Atual
	
	public int obterIdColunaPesquisaAvancada(String sNomeColuna) {
		int valor = 0;
		switch (sNomeColuna) {
		case "Número":
			valor = 1;
			break;
		case "Unidade":
			valor = 2;
			break;				
		case "Usuário":
			valor = 3;
			break;
		case "Data":
			valor = 4;
			break;
		/* case "Unidade":
			valor = 5;
			break;				
		case "Usuário":
			valor = 6;
			break;
		case "Data":
			valor = 7; 
			break; */
		case "Situação":
			valor = 8;
			break;				
		case "Documento":
			valor = 9;
			break;
		case "Descrição":
			valor = 10;
			break;	
		default:
			break;
		}		
		return valor;		
	}

}
