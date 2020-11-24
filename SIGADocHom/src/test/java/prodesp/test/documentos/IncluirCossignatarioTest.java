package prodesp.test.documentos;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.acesso.LoginActions;
import prodesp.actions.documentos.AssinarDocumentoActions;
import prodesp.dados.acesso.UsuarioAuxiliarDadosOk;
import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.pages.documentos.AssinarDocumentoPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.pages.documentos.InclusaoDeCossignatarioPage;
import prodesp.pages.documentos.NovoDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;
import prodesp.utils.Propriedades;

public class IncluirCossignatarioTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}
	
	@Test
	public void criarAssinarDocumentoCossignatario() throws InterruptedException {

		NovoDocumentoPage novoDocumentoPage = new NovoDocumentoPage();
		MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();

		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		mesaVirtualPage.clicarBotaoCriarNovo();

		novoDocumentoPage.campoReferencia("AssinaDocumentoCossignatario");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		novoDocumentoPage.campoAssunto("Teste Cossignatário");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);

		novoDocumentoPage.botaoOK();

		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoIncluirCossignatario();
		
		InclusaoDeCossignatarioPage inclusaoDeCossignatarioPage = new InclusaoDeCossignatarioPage();
		
		UsuarioAuxiliarDadosOk usuarioAuxiliarDadosOk = new UsuarioAuxiliarDadosOk();
		inclusaoDeCossignatarioPage.escreveCampoCossignatarioSel(usuarioAuxiliarDadosOk.getUsuarioAuxOk());

		inclusaoDeCossignatarioPage.clicarLabelCossignatarioSelSpan();
		
		inclusaoDeCossignatarioPage.botaoOK();
		
		funcoesDocumentoPage.clicarBotaoAssinar();
		
		AssinarDocumentoActions assinarDocumentoActions = new AssinarDocumentoActions();
		
		AssinarDocumentoPage assinarDocumentoPage = new AssinarDocumentoPage();
		assinarDocumentoPage.checkboxComSenha();
		assinarDocumentoPage.clicarBotaoAssinarAbaixo();
		   
		assinarDocumentoActions.assinaDocumento();
		
		AssertJUnit.assertTrue(inclusaoDeCossignatarioPage.verificaQuadroCossignatarios());
		
		mesaVirtualPage.clicarLinkSair();
		
		LoginActions loginActions = new LoginActions();
		
		loginActions.loginEvento(usuarioAuxiliarDadosOk.getUsuarioAuxOk(), usuarioAuxiliarDadosOk.getSenhaAuxOk());
		
		
	}
}
