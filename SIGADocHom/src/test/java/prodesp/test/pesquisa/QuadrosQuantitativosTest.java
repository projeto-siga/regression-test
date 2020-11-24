package prodesp.test.pesquisa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import prodesp.actions.acesso.LoginActions;
import prodesp.dados.acesso.LoginDadosOk;
import prodesp.pages.acesso.MesaVirtualPage;

public class QuadrosQuantitativosTest {

	@BeforeMethod
	public void loginSucesso() throws InterruptedException {
		LoginActions loginActions = new LoginActions();
		LoginDadosOk loginDadosOk = new LoginDadosOk();
		loginActions.abrirURL();
		loginActions.loginEvento(loginDadosOk.getUsuarioOk(), loginDadosOk.getSenhaOk());
	}

	@Test
	public void quadrosQuantitativos() throws InterruptedException {
		
		MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();
		mesaVirtualPage.clicarMenu();
		mesaVirtualPage.clicarQuadrosQuantitativos();
	}
}
