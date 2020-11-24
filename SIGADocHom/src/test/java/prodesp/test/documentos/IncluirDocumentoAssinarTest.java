package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.AssinarDocumentoActions;
import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.pages.documentos.AssinarDocumentoPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.pages.documentos.IncluirDocumentoPage;
import prodesp.pages.documentos.NovoDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;
import prodesp.utils.Propriedades;

public class IncluirDocumentoAssinarTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}

	@Test
	public void CriarNovoAssinarIncluirDocumentoAssinar() throws InterruptedException {
		NovoDocumentoPage novoDocumentoPage = new NovoDocumentoPage();
		MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();
		
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		mesaVirtualPage.clicarBotaoCriarNovo();
			
		novoDocumentoPage.clicarBotaoSelecioneOModelo();
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		
		String modeloRef = "Expediente de análise de amostra de produtos";
		
		novoDocumentoPage.selecionaPesquisarModelo(modeloRef);
		
		novoDocumentoPage.selecionaListaModelo(modeloRef);
		
		novoDocumentoPage.campoAssunto("Teste de Assunto");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		
		novoDocumentoPage.campoReferencia("Teste Ref");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
			
		novoDocumentoPage.botaoOK();	
		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoAssinar();
		
		AssinarDocumentoPage assinarDocumentoPage = new AssinarDocumentoPage();
		assinarDocumentoPage.checkboxComSenha();
		assinarDocumentoPage.clicarBotaoAssinarAbaixo();
		
		AssinarDocumentoActions assinarDocumentoActions = new AssinarDocumentoActions();
		assinarDocumentoActions.assinaDocumento();
		
		funcoesDocumentoPage.clicarBotaoIncluirDocumento();
		
		IncluirDocumentoPage incluirDocumentoPage = new IncluirDocumentoPage();
		incluirDocumentoPage.botaoOK();
		
		funcoesDocumentoPage.clicarBotaoAssinar();
		assinarDocumentoPage.checkboxComSenha();
		assinarDocumentoPage.clicarBotaoAssinarAbaixo();
		
		assinarDocumentoActions.assinaDocumento();
	}

}
