package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.actions.documentos.PopupConfirmacaoActions;
import prodesp.utils.Propriedades;

public class FuncoesDocumentoPage extends NovoDocumentoPage {

	public void clicarBotaoAnotar() throws InterruptedException {
		By byBotaoAnotar = By.id("anotar");
		funcionalidades.clicarBotao(byBotaoAnotar);	
	}

	public void clicarBotaoAssinar() throws InterruptedException {
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		By byBotaoAssinar = By.id("assinar");
		funcionalidades.clicarBotao(byBotaoAssinar);

	}

	public void clicarBotaoEditar() throws InterruptedException {
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		By byBotaoEditar = By.id("editar");
		funcionalidades.clicarBotao(byBotaoEditar);
	}

	public void clicarBotaoExcluir() throws InterruptedException {
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		By byBotaoExcluir = By.id("excluir");
		funcionalidades.clicarBotao(byBotaoExcluir);
	}

	public void clicarBotaoFinalizar() throws InterruptedException {
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		By byBotaoFinalizar = By.id("finalizar");
		funcionalidades.clicarBotao(byBotaoFinalizar);

	}

	public void clicarBotaoIncluirCossignatario() throws InterruptedException {
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		By byBotaoCosignatario = By.id("incluir-cossignatario");
		funcionalidades.clicarBotao(byBotaoCosignatario);
	}

	public void clicarBotaoExcluirCossignatario() throws InterruptedException {
		By byBotaoExcluirCossignatario = By.xpath("//a[@class=\"btn btn-sm btn-light mb-2\"]");
		funcionalidades.clicarBotao(byBotaoExcluirCossignatario);

	}

	public void clicarBotaoAutenticar() throws InterruptedException {
		By byBotaoAutenticar = By.id("autenticar");
		funcionalidades.clicarBotao(byBotaoAutenticar);
	}

	public void clicarBotaoJuntar() throws InterruptedException {
		By byBotaoJuntar = By.id("juntar");
		funcionalidades.clicarBotao(byBotaoJuntar);
	}

	public void clicarBotaoCriarVia() throws InterruptedException {
		By byBotaoCriarVia = By.id("criar-via");
		funcionalidades.clicarBotao(byBotaoCriarVia);
	}

	public void clicarBotaoVerDocumentoCompleto() throws InterruptedException {
		By byBotaoVerDocumentoCompleto = By.id("ver-documento-completo");
		funcionalidades.clicarBotao(byBotaoVerDocumentoCompleto);
	}

	public void clicarBotaoHistorico() throws InterruptedException {
		By byBotaoHistorico = By.id("historico");
		funcionalidades.clicarBotao(byBotaoHistorico);
	}

	public void clicarBotaoCancelar() throws InterruptedException {
		By byBotaoCancelar = By.id("cancelar");
		funcionalidades.clicarBotao(byBotaoCancelar);
	}

	public void clicarBotaoDesfazerCancelamento() throws InterruptedException {
		By byBotaoDesfazerCancelamento = By.id("desfazer-cancelamento");
		funcionalidades.clicarBotao(byBotaoDesfazerCancelamento);
	}

	public void clicarBotaoDefinirAcompanhamento() throws InterruptedException {
		By byBotaoDefinirAcompanhamento = By.id("definir-acompanhamento");
		funcionalidades.clicarBotao(byBotaoDefinirAcompanhamento);
	}

	public void clicarBotaoDesfazerDefinicaoAcompanhamento() throws InterruptedException {
		By byBotaoDesfazerDefinicaoAcompanhamento = By.id("desfazer-definicao-de-acompanhamento");
		funcionalidades.clicarBotao(byBotaoDesfazerDefinicaoAcompanhamento);
	}

	public void clicarBotaoTramitar() throws InterruptedException {
		By byBotaoTramitar = By.id("tramitar");
		funcionalidades.clicarBotao(byBotaoTramitar);
	}

	public void clicarBotaoDesfazerTramitacao() throws InterruptedException {
		By byBotaoDesfazerTramitacao = By.id("desfazer-tramitacao");
		funcionalidades.clicarBotao(byBotaoDesfazerTramitacao);
	}

	public void clicarBotaoArquivoCorrente() throws InterruptedException {
		By byBotaoArquivoCorrente = By.id("arq-corrente");
		funcionalidades.clicarBotao(byBotaoArquivoCorrente);
	}
	
	public void clicarBotaoPopupOKArquivoCorrente() throws InterruptedException {
		By byBotaoPopupOKArquivoCorrente = By.xpath("//a[@class=\"btn btn-primary btn-confirmacao-arq-corrente\"]");
		funcionalidades.clicarBotao(byBotaoPopupOKArquivoCorrente);
	}

	public void clicarDesfazerArquivamentoCorrente() throws InterruptedException {
		By byBotaoDesfazerArquivamentoCorrente = By.id("desfazer-arquivamento-corrente");
		funcionalidades.clicarBotao(byBotaoDesfazerArquivamentoCorrente);
	}
	
	public boolean verificaBotaoDesfazerArquivoCorrente() throws InterruptedException {
		By byBotaoDesfazerArquivoCorrente = By.id("desfazer-arquivo-corrente");
		return funcionalidades.elementoExiste(byBotaoDesfazerArquivoCorrente);
	}

	public void clicarBotaoDesarquivamentoCorrente() throws InterruptedException {
		By byBotaoDesarquivamentoCorrente = By.id("desarq-corrente");
		funcionalidades.clicarBotao(byBotaoDesarquivamentoCorrente);
	}

	public void clicarBotaoPopupJsOK() throws InterruptedException {
		PopupConfirmacaoActions popupConfirmacaoActions = new PopupConfirmacaoActions();
		popupConfirmacaoActions.ConfirmaAlerta();		
	}
	
	public void clicarRefazer() throws InterruptedException {
		By byBotaoRefazer = By.id("refazer");
		funcionalidades.clicarBotao(byBotaoRefazer);
	}
	
	public void clicarBotaoIncluirDocumento() throws InterruptedException {
		By byBotaoIncluirDocumento = By.id("incluir-documento");
		funcionalidades.clicarBotao(byBotaoIncluirDocumento);
	}
	
	public void clicarBotaoDesentranhar() throws InterruptedException {
	By byBotaoDesentranhar = By.id("desentranhar");	
	funcionalidades.clicarBotao(byBotaoDesentranhar);
	}

	public void clicarBotaoDuplicar() throws InterruptedException {
		By byBotaoDuplicar = By.id("duplicar");
		funcionalidades.clicarBotao(byBotaoDuplicar);
		
	}

	public void clicarBotaoDefinirMarcador() throws InterruptedException {
		By byBotaoDefinirMarcador = By.id("definir-marcador");
		funcionalidades.clicarBotao(byBotaoDefinirMarcador);
	}

	public void clicarBotaoRedefinirAcesso() throws InterruptedException {
		By byBotaoRedefinirAcesso = By.id("redefinir-acesso");
		funcionalidades.clicarBotao(byBotaoRedefinirAcesso);
		
	}

	public void clicarBotaoDesfazerDefinicaoDeSigilo() throws InterruptedException {
		By byBotaoDesfazerDefinicaoDeSigilo = By.id("desfazer-definicao-de-sigilo");
		funcionalidades.clicarBotao(byBotaoDesfazerDefinicaoDeSigilo);
		
	}

	public void clicarBotaoCancelarVia() throws InterruptedException {
		By byBotaoCancelarVia = By.id("cancelar-via");
		funcionalidades.clicarBotao(byBotaoCancelarVia);
		}

	public void clicarBotaoApensar() throws InterruptedException {
		By byBotaoApensar = By.id("apensar");
		funcionalidades.clicarBotao(byBotaoApensar);
		}

	public void clicarBotaoDesapensar() throws InterruptedException {
		By byBotaoDesapensar = By.id("desapensar");
		funcionalidades.clicarBotao(byBotaoDesapensar);
	}

	public void clicarBotaoSobrestar() throws InterruptedException {
		By byBotaoSobrestar = By.id("sobrestar");
		funcionalidades.clicarBotao(byBotaoSobrestar);
		}
	
	public void clicarBotaoDesobrestar() throws InterruptedException {
		By byBotaoDesobrestar = By.id("desobrestar");
		funcionalidades.clicarBotao(byBotaoDesobrestar);
		}
	
	public void clicarBotaoDesfazerSobrestar() throws InterruptedException {
		By byBotaoDesfazerSobrestar = By.id("desfazer-sobrestar");
		funcionalidades.clicarBotao(byBotaoDesfazerSobrestar);
		}

	public void clicarBotaoDesfazerDesobrestar() throws InterruptedException {
		By byBotaoDesfazerDesobrestar = By.id("desfazer-desobrestar");
		funcionalidades.clicarBotao(byBotaoDesfazerDesobrestar);		
	}

	public void clicarBotaoVisualizar() throws InterruptedException {
		By byBotaoVisualizar = By.id("visualizar");
		funcionalidades.clicarBotao(byBotaoVisualizar);
	}

	public void clicarBotaoCiencia() throws InterruptedException {
		By byBotaoCiencia = By.id("ciencia");
		funcionalidades.clicarBotao(byBotaoCiencia);
		
	}

	public void clicarBotaoGerarProtocolo() throws InterruptedException {
		By byBotaoGerarProcolo = By.id("gerar-protocolo");
		funcionalidades.clicarBotao(byBotaoGerarProcolo);
	}

	public void clicarBotaoReclassificar() throws InterruptedException {
		By byBotaoReclassificar = By.id("reclassificar");
		funcionalidades.clicarBotao(byBotaoReclassificar);
	}

	public void clicarBotaoDesfazerReclassificacao() throws InterruptedException {
		By byBotaoDesfazerReclassificacao = By.id("desfazer-reclassificacao");
		funcionalidades.clicarBotao(byBotaoDesfazerReclassificacao);
	}

	public void clicarBotaoDesfazerJuntada() throws InterruptedException {
		By byBotaoDesfazerJuntada = By.id("desfazer-juntada");
		funcionalidades.clicarBotao(byBotaoDesfazerJuntada);
	}

}
	
	
	
