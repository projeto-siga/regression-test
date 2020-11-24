package prodesp.test.config;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.pages.config.ClassificacaoDocumentalPage;
import prodesp.pages.config.EditarClassificacaoDocumentalPage;
import prodesp.pages.config.NovaClassificacaoDocumentalPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;
import prodesp.utils.Enderecos;
import prodesp.utils.MetodosExcel;

public class ClassificacaoDocumentalTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();

	}

	@DataProvider(name = "TabelaModelos_SES_saude_v1.xlsx")
	public Object[][] pegaDadosTabela() throws Exception {
		Object[][] testObjArray = MetodosExcel
				.getTabelaArray(Enderecos.getCaminhoDadosTeste() + "TabelaModelos_SES_saude_v1.xlsx", "TTD-Fim");
		return (testObjArray);
	}

	@Test(dataProvider = "TabelaModelos_SES_saude_v1.xlsx")

	public void cadastrarClassificacaoDocumental(String sCodificacao, String sDescricao, String sDestino,
			String sArquivoCorrente, String sArquivoIntermediario, String sDestinacaoFinal, String sObservacao)
			throws InterruptedException {
	
		MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();

		mesaVirtualPage.clicarFerramentas();
		Thread.sleep(2000);
		
		mesaVirtualPage.clicarFerramentasClassificacaoDocumental();
		Thread.sleep(4000);
		
		ClassificacaoDocumentalPage classificacaoDocumentalPage = new ClassificacaoDocumentalPage();

		classificacaoDocumentalPage.clicarBotaoNovaClassificacao();
		Thread.sleep(2000);
		
		NovaClassificacaoDocumentalPage novaClassificacaoDocumentalPage = new NovaClassificacaoDocumentalPage();
		
		novaClassificacaoDocumentalPage.escreveCampoCodificacao(sCodificacao);
		Thread.sleep(2000);
		
		novaClassificacaoDocumentalPage.escreveCampoDescricao(sDescricao);
		Thread.sleep(1200);
		
		novaClassificacaoDocumentalPage.clicarBotaoGravarPrimeiro();
		Thread.sleep(1200);
		
		EditarClassificacaoDocumentalPage editarClassificacaoDocumentalPage = new EditarClassificacaoDocumentalPage();

		editarClassificacaoDocumentalPage.clicarBotaoAdicionarVia();
		Thread.sleep(1200);
		
		editarClassificacaoDocumentalPage.selecionaComboDestino(sDestino);
		Thread.sleep(1200);
		
		editarClassificacaoDocumentalPage.selecionaComboArquivoCorrente(sArquivoCorrente);
		Thread.sleep(1200);
		
		editarClassificacaoDocumentalPage.selecionaComboArquivoIntermediario(sArquivoIntermediario);
		Thread.sleep(1200);

		editarClassificacaoDocumentalPage.selecionaComboDestinacaoFinal(sDestinacaoFinal);
		Thread.sleep(1200);
		
		editarClassificacaoDocumentalPage.escreveCampoObservacao(sObservacao);
		Thread.sleep(1200);
		
		editarClassificacaoDocumentalPage.clicarBotaoGravarSegundo();
		Thread.sleep(1500);

	}

}
