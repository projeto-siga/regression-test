package prodesp.actions.acesso;
import prodesp.pages.acesso.LoginPage;
import prodesp.utils.Propriedades;

public class LoginActions {
	LoginPage loginPage = new LoginPage();

	public void abrirURL() throws InterruptedException {
	    loginPage.abrirURLHome();
	}

	public void loginEvento(String sMatricula, String sSenha) throws InterruptedException {
		
	//suaConexaoNaoEParticularPage.clicarBotaoAvancado();
	//SuaConexaoNaoEParticularPage.clicarLinkIrParaLink();
		
		/*loginPage.clicarBotaoOkAviso();*/
		
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		
		loginPage.informarUsuario(sMatricula);
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		loginPage.informarSenha(sSenha);
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		loginPage.clicarBotaoEntrar();
	}
}
