package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.AssinarDocumentoActions;
import prodesp.pages.documentos.AssinarDocumentoPage;
import prodesp.pages.documentos.DesentranharDocumentoPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.pages.documentos.JuntarDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;

public class JuntarDesentranharTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}

	@Test
	public void CriarNovoFinalizarAssinarJuntarDesentranhar() throws InterruptedException {
		
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
		juntarDocumentoPage.escreveCampoDocumento("SA-MEM-2020/00990");
		juntarDocumentoPage.clicarDocumentoRefSelSpan();
		juntarDocumentoPage.clicarCampoDocumento();
		
		Thread.sleep(2000);
		juntarDocumentoPage.clicarBotaoOk();
		
		funcoesDocumentoPage.clicarBotaoDesentranhar();
		
		DesentranharDocumentoPage desentranharDocumentoPage = new DesentranharDocumentoPage();
		desentranharDocumentoPage.escreveCampoMotivo("Teste da função Desentranhar");
		desentranharDocumentoPage.clicarBotaoOK();
		
	}

}
