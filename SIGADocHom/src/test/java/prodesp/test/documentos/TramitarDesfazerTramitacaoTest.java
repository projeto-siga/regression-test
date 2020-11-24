package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.AssinarDocumentoActions;
import prodesp.actions.documentos.CriarDocumentoActions;
import prodesp.actions.documentos.PopupConfirmacaoActions;
import prodesp.dados.acesso.UsuarioAuxiliarDadosOk;
import prodesp.pages.documentos.AssinarDocumentoPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.pages.documentos.TramitarPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;


public class TramitarDesfazerTramitacaoTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}
	
	@Test
	public void CriarNovoAssinarTramitar() throws InterruptedException {
		CriarDocumentoActions criarDocumentoActions = new CriarDocumentoActions();
		criarDocumentoActions.criarNovoDocumento();

		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoAssinar();
		
		AssinarDocumentoPage assinarDocumentoPage = new AssinarDocumentoPage();
		assinarDocumentoPage.checkboxComSenha();
		assinarDocumentoPage.clicarBotaoAssinarAbaixo();
		
		AssinarDocumentoActions assinarDocumentoActions = new AssinarDocumentoActions();
		assinarDocumentoActions.assinaDocumento();
		
		funcoesDocumentoPage.clicarBotaoTramitar();
		
		TramitarPage tramitarPage = new TramitarPage();
		tramitarPage.selecionaComboDestinatario("Usuário");
		
		UsuarioAuxiliarDadosOk usuarioAuxiliarDadosOk = new UsuarioAuxiliarDadosOk();
		tramitarPage.escreveCampoSelSigla(usuarioAuxiliarDadosOk.getUsuarioAuxOk());

		tramitarPage.clicarResponsavelSelSpan();
		
		tramitarPage.clicarBotaoOk();
		
		funcoesDocumentoPage.clicarBotaoDesfazerTramitacao();
		
		PopupConfirmacaoActions popupConfirmacaoActions = new PopupConfirmacaoActions();
		popupConfirmacaoActions.ConfirmaAlerta();

	}
}
