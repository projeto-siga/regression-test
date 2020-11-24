package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.AssinarDocumentoActions;
import prodesp.actions.documentos.CriarDocumentoActions;
import prodesp.actions.documentos.PopupConfirmacaoActions;
import prodesp.pages.documentos.AssinarDocumentoPage;
import prodesp.pages.documentos.CancelarDocumentoPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;


public class CancelarDesfazerCancelamentoTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}
	
	@Test
	public void CriarAssinarDocumento() throws InterruptedException {
		CriarDocumentoActions criarDocumentoActions = new CriarDocumentoActions();
		criarDocumentoActions.criarNovoDocumento();

		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoAssinar();
		
		AssinarDocumentoPage assinarDocumentoPage = new AssinarDocumentoPage();
		assinarDocumentoPage.checkboxComSenha();
		assinarDocumentoPage.clicarBotaoAssinarAbaixo();
		
		AssinarDocumentoActions assinarDocumentoActions = new AssinarDocumentoActions();
		assinarDocumentoActions.assinaDocumento();
		
		funcoesDocumentoPage.clicarBotaoCancelar();
		
		PopupConfirmacaoActions popupConfirmacaoActions = new PopupConfirmacaoActions();
		popupConfirmacaoActions.ConfirmaAlerta();
		
		CancelarDocumentoPage cancelarDocumentoPage = new CancelarDocumentoPage();
		cancelarDocumentoPage.escreveCampoMotivo("Teste de cancelamento de documento");
		cancelarDocumentoPage.clicarBotaoOK();
		
		funcoesDocumentoPage.clicarBotaoDesfazerCancelamento();
		
		popupConfirmacaoActions.ConfirmaAlerta();
		

	}
}
