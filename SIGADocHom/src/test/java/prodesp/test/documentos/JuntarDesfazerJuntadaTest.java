package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.AssinarDocumentoActions;
import prodesp.pages.documentos.AssinarDocumentoPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.pages.documentos.JuntarDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;

public class JuntarDesfazerJuntadaTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}

	@Test
	public void CriarNovoFinalizarAssinarJuntarDesfazerJuntada() throws InterruptedException {
		
		FinalizarTest finalizarDocumentoTest =  new FinalizarTest();
		finalizarDocumentoTest.CriarNovoFinalizar();
				
		
		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoAssinar();
		
		AssinarDocumentoPage assinarDocumentoPage = new AssinarDocumentoPage();
		assinarDocumentoPage.checkboxComSenha();
		assinarDocumentoPage.clicarBotaoAssinarAbaixo();
		
		AssinarDocumentoActions assinarDocumentoActions = new AssinarDocumentoActions();
		assinarDocumentoActions.assinaDocumento();
		
		funcoesDocumentoPage.clicarBotaoJuntar();
		
		JuntarDocumentoPage juntarDocumentoPage = new JuntarDocumentoPage();
		juntarDocumentoPage.escreveCampoDocumento("SA-MEM-2020/00949");
		juntarDocumentoPage.clicarDocumentoRefSelSpan();
		juntarDocumentoPage.clicarCampoDocumento();
		
		Thread.sleep(2000);
		juntarDocumentoPage.clicarBotaoOk();
		
		Thread.sleep(2000);
		funcoesDocumentoPage.clicarBotaoDesfazerJuntada();
		
		Thread.sleep(2000);
		funcoesDocumentoPage.clicarBotaoPopupJsOK();
		
	}

}
