package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.CriarDocumentoActions;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;

public class FinalizarTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}

	@Test
	public void CriarNovoFinalizar() throws InterruptedException {
		CriarDocumentoActions criarDocumentoActions = new CriarDocumentoActions();
		criarDocumentoActions.criarNovoDocumento();
		
		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoFinalizar();
		
		
	}
}
