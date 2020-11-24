package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;

public class CriarViaTest extends BaseTest {
	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}
	
	@Test
	public void AssinarAdicionarVia() throws InterruptedException {
		CriarNovoAssinarTest assinarDocumentoTest = new CriarNovoAssinarTest();
		assinarDocumentoTest.CriarNovoAssinar();
		
		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoCriarVia();
		
		
	}

}
