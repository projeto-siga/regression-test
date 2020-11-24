package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.PopupConfirmacaoActions;
import prodesp.dados.acesso.LoginDadosOk;
import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.pages.documentos.AssinarDocumentoPage;
import prodesp.pages.documentos.AutenticarDocumentoPage;
import prodesp.pages.documentos.CancelarDocumentoPage;
import prodesp.pages.documentos.CapturarDocumentoPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.pages.documentos.NovoDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;
import prodesp.utils.Propriedades;

public class AutenticarCancelarTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}

	@Test
	public void CriarAutenticarCancelar() throws InterruptedException {
		NovoDocumentoPage novoDocumentoPage = new NovoDocumentoPage();
		CapturarDocumentoPage capturarDocumentoPage = new CapturarDocumentoPage();
		MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();

		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		mesaVirtualPage.clicarBotaoCriarNovo();

		novoDocumentoPage.clicarBotaoSelecioneOModelo();

		novoDocumentoPage.clicarDocumentoCapturado();

		//capturarDocumentoPage.clicarBotaoSelecioneArquivo();
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		
		capturarDocumentoPage.escreverCaminhoArquivo("C:\\Projetos\\Java\\SIGADocHom\\src\\test\\resources\\dados\\teste.pdf");

		capturarDocumentoPage.escreverCampoAssunto("Qualquer assunto");
		
		capturarDocumentoPage.selecionaComboModelo("Outros");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);

		capturarDocumentoPage.escreverCampoDescricao("Qualquer texto camp desc");
		novoDocumentoPage.botaoOK();

		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoAutenticar();

		AutenticarDocumentoPage autenticarDocumentoPage = new AutenticarDocumentoPage();
		autenticarDocumentoPage.clicarBotaoAutenticar();

		AssinarDocumentoPage assinarDocumentoPage = new AssinarDocumentoPage();

		LoginDadosOk loginDadosOk = new LoginDadosOk();
		String sCampoMatricula;
		sCampoMatricula = loginDadosOk.getUsuarioOk();
		assinarDocumentoPage.escreveCampoMatricula(sCampoMatricula);

		String sCampoSenha;
		sCampoSenha = loginDadosOk.getSenhaOk();
		assinarDocumentoPage.escreveCampoSenha(sCampoSenha);

		Thread.sleep(Propriedades.TEMPO_ESPERA_MS_MAIOR);

		assinarDocumentoPage.clicarBotaoOK();
		
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS_MAIOR);		
	    funcoesDocumentoPage.clicarBotaoCancelar();
		
		PopupConfirmacaoActions popupConfirmacaoActions = new PopupConfirmacaoActions();
		popupConfirmacaoActions.ConfirmaAlerta();
		
		CancelarDocumentoPage cancelarDocumentoPage = new CancelarDocumentoPage();
		cancelarDocumentoPage.escreveCampoMotivo("Teste de cancelamento de documento");
		cancelarDocumentoPage.clicarBotaoOK();
	}

}
