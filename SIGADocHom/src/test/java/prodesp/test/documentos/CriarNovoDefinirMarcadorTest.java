package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.CriarDocumentoActions;
import prodesp.pages.documentos.DefinirMarcadorPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;

public class CriarNovoDefinirMarcadorTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}

	@Test
	public void CriarNovoDefinirMarcador() throws InterruptedException {
		CriarDocumentoActions criarDocumentoActions = new CriarDocumentoActions();
		criarDocumentoActions.criarNovoDocumento();
	
		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoDefinirMarcador();
		
		DefinirMarcadorPage definirMarcadorPage = new DefinirMarcadorPage();
		definirMarcadorPage.clicarMarcadorUrgente();
		definirMarcadorPage.clicarMarcadorIdoso();
		definirMarcadorPage.clicarMarcadorCovid19();
		definirMarcadorPage.clicarMarcadorNotaDeEmpenho();
		definirMarcadorPage.clicarMarcadorPrioritario();
		definirMarcadorPage.clicarMarcadorRestricaoDeAcesso();
		definirMarcadorPage.clicarMarcadorDocumentoAnalisado();
		definirMarcadorPage.clicarBotaoOK();
	}
	

}
