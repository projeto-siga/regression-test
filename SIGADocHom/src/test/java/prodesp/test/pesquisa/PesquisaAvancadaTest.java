package prodesp.test.pesquisa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import prodesp.actions.acesso.LoginActions;
import prodesp.actions.pesquisa.PesquisasActions;
import prodesp.dados.acesso.LoginDadosOk;
import prodesp.dados.acesso.UsuarioAuxiliarDadosOk;
import prodesp.pages.pesquisa.PesquisaAvancadaPage;
import prodesp.utils.Propriedades;

public class PesquisaAvancadaTest {

	// Incluir excel

	@BeforeMethod
	public void loginSucesso() throws InterruptedException {
		LoginActions loginActions = new LoginActions();
		LoginDadosOk loginDadosOk = new LoginDadosOk();
		loginActions.abrirURL();
		loginActions.loginEvento(loginDadosOk.getUsuarioOk(), loginDadosOk.getSenhaOk());

	}

	@Test
	public void pesquisaDescricao() throws InterruptedException {

		PesquisasActions pesquisasActions = new PesquisasActions();
		pesquisasActions.clicarBotaoPesquisaAvancada();

		PesquisaAvancadaPage pesquisaAvancadaPage = new PesquisaAvancadaPage();
		
		UsuarioAuxiliarDadosOk usuarioAuxiliarDadosOk = new UsuarioAuxiliarDadosOk();
		pesquisaAvancadaPage.campoUsuario(usuarioAuxiliarDadosOk.getUsuarioAuxOk());
		
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		
		pesquisaAvancadaPage.clicarBotaoBuscar();
	
	}
}
