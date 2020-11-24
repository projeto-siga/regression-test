package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.AssinarDocumentoActions;
import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.pages.documentos.AssinarDocumentoPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.pages.documentos.NovoDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;
import prodesp.utils.Propriedades;

public class AssinarDocumentoPorFuncaoTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}

	@Test
	public void criarAssinarDocumentoFuncao() throws InterruptedException {

		NovoDocumentoPage novoDocumentoPage = new NovoDocumentoPage();
		MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();

		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		mesaVirtualPage.clicarBotaoCriarNovo();

		novoDocumentoPage.campoReferencia("AssinaDocumentoFuncao");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		novoDocumentoPage.campoAssunto("Teste Assina Documento Funcao");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);

		novoDocumentoPage.checkboxPersonalizar();

		novoDocumentoPage.campoPersonalizarFuncao("Testador Designado");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		novoDocumentoPage.campoPersonalizarUnidade("LAB");

		novoDocumentoPage.botaoOK();

		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoAssinar();

		Thread.sleep(Propriedades.TEMPO_ESPERA_SEG_MEDIO);
		AssinarDocumentoPage assinarDocumentoPage = new AssinarDocumentoPage();
		assinarDocumentoPage.checkboxComSenha();
		assinarDocumentoPage.clicarBotaoAssinarAbaixo();
		
		AssinarDocumentoActions assinarDocumentoActions = new AssinarDocumentoActions();
		assinarDocumentoActions.assinaDocumento();

	}
}
