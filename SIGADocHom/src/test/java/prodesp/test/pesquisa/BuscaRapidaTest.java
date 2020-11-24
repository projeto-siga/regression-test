package prodesp.test.pesquisa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import prodesp.actions.acesso.LoginActions;
import prodesp.dados.acesso.LoginDadosOk;
import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.test.comuns.BaseTest;

public class BuscaRapidaTest extends BaseTest {

	@BeforeMethod
	public void loginSucesso() throws InterruptedException {
		LoginActions loginActions = new LoginActions();
		LoginDadosOk loginDadosOk = new LoginDadosOk();
		loginActions.abrirURL();
		loginActions.loginEvento(loginDadosOk.getUsuarioOk(), loginDadosOk.getSenhaOk());
	}

	@Test
	public void buscaRapida() throws InterruptedException {
		
		MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();
		
		String sBuscaRapida = "SEGOV-MEM-2020/00063";
		mesaVirtualPage.escreveCampoBuscaRapida(sBuscaRapida);
		mesaVirtualPage.clicarBotaoBuscaRapida();	
	}
}
