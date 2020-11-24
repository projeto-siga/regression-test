package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.AssinarDocumentoActions;
import prodesp.actions.documentos.CriarDocumentoActions;
import prodesp.pages.documentos.AssinarDocumentoPage;
import prodesp.pages.documentos.CienciaDocumentoPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;


public class AssinarCienciaTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}
	
	@Test
	public void CriarNovoAssinarCiencia() throws InterruptedException {
		CriarDocumentoActions criarDocumentoActions = new CriarDocumentoActions();
		criarDocumentoActions.criarNovoDocumento();

		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoAssinar();
		
		AssinarDocumentoPage assinarDocumentoPage = new AssinarDocumentoPage();
		assinarDocumentoPage.checkboxComSenha();
		assinarDocumentoPage.clicarBotaoAssinarAbaixo();
		
		AssinarDocumentoActions assinarDocumentoActions = new AssinarDocumentoActions();
		assinarDocumentoActions.assinaDocumento();
		
		funcoesDocumentoPage.clicarBotaoCiencia();
		
		CienciaDocumentoPage cienciaDocumentoPage = new CienciaDocumentoPage();
		cienciaDocumentoPage.escreveCampoMotivo("Teste de Ciência");
		cienciaDocumentoPage.clicarBotaoOK();
			

	}
}
