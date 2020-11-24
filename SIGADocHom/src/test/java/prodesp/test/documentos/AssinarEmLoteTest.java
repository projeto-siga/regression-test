package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.CriarDocumentoActions;
import prodesp.dados.acesso.LoginDadosOk;
import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.pages.documentos.AssinarDocumentoPage;
import prodesp.pages.documentos.AssinarDocumentosEmLotePage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;
import prodesp.utils.Propriedades;

public class AssinarEmLoteTest extends BaseTest {
	
	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}
	
	@Test
	public void CriarNovoAssinarEmLote () throws InterruptedException {

	MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();
	
	CriarDocumentoActions criarDocumentoActions = new CriarDocumentoActions();
	criarDocumentoActions.criarNovoDocumento();
	
	FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
	funcoesDocumentoPage.clicarBotaoFinalizar();
	
	mesaVirtualPage.clicarBotaoDocumentos();
	Thread.sleep(Propriedades.TEMPO_ESPERA_MS);

	mesaVirtualPage.clicarBotaoAssinarEmLote();
	Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
	
	AssinarDocumentosEmLotePage assinarDocumentosEmLote = new AssinarDocumentosEmLotePage();
	assinarDocumentosEmLote.checkboxAssinaTodos();
	Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
	assinarDocumentosEmLote.clicarBotaoAssinarSenha();
	
	Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
	AssinarDocumentoPage assinarDocumentoPage = new AssinarDocumentoPage();

	LoginDadosOk loginDadosOk = new LoginDadosOk();
	String sCampoMatricula;
	sCampoMatricula = loginDadosOk.getUsuarioOk();
	assinarDocumentoPage.escreveCampoMatricula(sCampoMatricula);

	String sCampoSenha;
	sCampoSenha = loginDadosOk.getSenhaOk();
	assinarDocumentoPage.escreveCampoSenha(sCampoSenha);
	
	assinarDocumentosEmLote.botaoAssinarLote();
	
	}
	
}
