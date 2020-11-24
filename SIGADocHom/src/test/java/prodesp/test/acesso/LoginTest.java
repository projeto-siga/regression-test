package prodesp.test.acesso;

import org.testng.annotations.Test;

import prodesp.actions.acesso.LoginActions;
import prodesp.dados.acesso.LoginDadosOk;
import prodesp.test.comuns.BaseTest;

public class LoginTest extends BaseTest {
	
	

	@Test
	public void loginSucesso() throws InterruptedException {
		LoginActions loginActions = new LoginActions();
		LoginDadosOk loginDadosOk = new LoginDadosOk();
		loginActions.abrirURL();
		loginActions.loginEvento(loginDadosOk.getUsuarioOk(), loginDadosOk.getSenhaOk());
		
		/*Assert.assertTrue(mesaVirtualPage.verificaExistenciaMesaVirtual());*/
	}
}
