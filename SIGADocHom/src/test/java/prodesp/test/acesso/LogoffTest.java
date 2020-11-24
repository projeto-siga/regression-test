package prodesp.test.acesso;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.pages.acesso.LoginPage;
import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.test.comuns.BaseTest;

public class LogoffTest extends BaseTest {
	
	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}
	

	@Test
	public void logoffSucesso() throws InterruptedException {
		MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();
		mesaVirtualPage.clicarLinkSair();
		
		LoginPage loginPage = new LoginPage();
		
		AssertJUnit.assertTrue(loginPage.verificaExistenciaBotaoEntrar());
	
	}
}
