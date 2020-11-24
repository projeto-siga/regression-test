package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.pages.documentos.CapturarDocumentoPage;
import prodesp.pages.documentos.NovoDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;
import prodesp.utils.Propriedades;

public class CapturarDocumentoTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}

	@Test
	public void CriarCapturarDocumento() throws InterruptedException {
			NovoDocumentoPage novoDocumentoPage = new NovoDocumentoPage();
			CapturarDocumentoPage capturarDocumentoPage = new CapturarDocumentoPage();
			MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();
			
			Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
			mesaVirtualPage.clicarBotaoCriarNovo();
				
			novoDocumentoPage.clicarBotaoSelecioneOModelo();
			
			novoDocumentoPage.clicarDocumentoCapturado();
						
			//capturarDocumentoPage.clicarBotaoSelecioneArquivo();
			Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
			
			capturarDocumentoPage.escreverCaminhoArquivo("C:\\Projetos\\Java\\teste.pdf");				
		
			capturarDocumentoPage.escreverCampoAssunto("Qualquer assunto");
			
			capturarDocumentoPage.selecionaComboModelo("Outros");
			Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
					
			novoDocumentoPage.botaoOK();
	}

}
