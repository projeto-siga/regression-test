package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.PopupConfirmacaoActions;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;


public class DefinicaoDeAcompanhamentoDesfazerDefinicaoDeAcompanhamentoTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}
	
	@Test
	public void CriarNovoAssinarDefinirAcompanhamentoDesfazerDefinicaoAcompanhamento() throws InterruptedException {
		
		DefinirAcompanhamentoTest definirAcompanhamentoTest = new DefinirAcompanhamentoTest();
		definirAcompanhamentoTest.CriarAssinarDefinirAcompanhamentoDocumento();
		Thread.sleep(2000);
		
		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoDesfazerDefinicaoAcompanhamento();
				
		PopupConfirmacaoActions popupConfirmacaoActions = new PopupConfirmacaoActions();
		popupConfirmacaoActions.ConfirmaAlerta();
	}
}
