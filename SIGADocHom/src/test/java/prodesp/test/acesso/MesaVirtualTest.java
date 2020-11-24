package prodesp.test.acesso;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.test.comuns.BaseTest;

public class MesaVirtualTest extends BaseTest{
	
	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}

	@Test
	public void mesaVirtualAcesso() throws InterruptedException {
		MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();
		mesaVirtualPage.clicarLogoSemPapel();
	 /*	Assert.assertTrue(mesaVirtualPage.verificaExistenciaMesaVirtual()); */
	}


}
