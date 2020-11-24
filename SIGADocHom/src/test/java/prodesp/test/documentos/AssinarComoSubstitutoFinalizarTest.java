package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.AssinarDocumentoActions;
import prodesp.dados.acesso.UsuarioAuxiliarDadosOk;
import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.pages.documentos.AssinarDocumentoPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.pages.documentos.NovoDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;
import prodesp.utils.Propriedades;

public class AssinarComoSubstitutoFinalizarTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}

	@Test
	public void criarAssinarAssinarComoSubstituto() throws InterruptedException {

		NovoDocumentoPage novoDocumentoPage = new NovoDocumentoPage();
		MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();

		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		mesaVirtualPage.clicarBotaoCriarNovo();

		novoDocumentoPage.campoReferencia("AssinaDocumentoSubstituto");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		novoDocumentoPage.campoAssunto("Teste Substituto");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);

		novoDocumentoPage.checkboxSubstituto();

		UsuarioAuxiliarDadosOk usuarioAuxiliarDadosOk = new UsuarioAuxiliarDadosOk();
		novoDocumentoPage.campoSubstitutoResponsavelAssinatura(usuarioAuxiliarDadosOk.getUsuarioAuxOk());
		
		novoDocumentoPage.clicarLabelSubscritorSelecionado();
				
		novoDocumentoPage.botaoOK();

		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoAssinar();
		
		AssinarDocumentoPage assinarDocumentoPage = new AssinarDocumentoPage();
		assinarDocumentoPage.checkboxComSenha();
		assinarDocumentoPage.clicarBotaoAssinarAbaixo();
		
		AssinarDocumentoActions assinarDocumentoActions = new AssinarDocumentoActions();
		assinarDocumentoActions.assinaDocumento();
		
		
	}
}
