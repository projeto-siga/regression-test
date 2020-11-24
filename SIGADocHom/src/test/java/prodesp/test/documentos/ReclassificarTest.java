package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.AssinarDocumentoActions;
import prodesp.actions.documentos.CriarDocumentoActions;
import prodesp.pages.documentos.AssinarDocumentoPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.pages.documentos.ReclassificarDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;


public class ReclassificarTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}
	
	@Test
	public void CriarNovoAssinar() throws InterruptedException {
		CriarDocumentoActions criarDocumentoActions = new CriarDocumentoActions();
		criarDocumentoActions.criarNovoDocumento();

		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoAssinar();
		
		AssinarDocumentoPage assinarDocumentoPage = new AssinarDocumentoPage();
		assinarDocumentoPage.checkboxComSenha();
		assinarDocumentoPage.clicarBotaoAssinarAbaixo();
		
		AssinarDocumentoActions assinarDocumentoActions = new AssinarDocumentoActions();
		assinarDocumentoActions.assinaDocumento();
		
		funcoesDocumentoPage.clicarBotaoReclassificar();
		
		ReclassificarDocumentoPage reclassificarDocumentoPage = new ReclassificarDocumentoPage();
		reclassificarDocumentoPage.escreveCampoNovaClassificacao("001.01.01.001");
		reclassificarDocumentoPage.clicarCampoSelSpan();
		reclassificarDocumentoPage.escreveCampoMotivo("Teste de Reclassificação");
		reclassificarDocumentoPage.clicarBotaoOK();

	}
}
