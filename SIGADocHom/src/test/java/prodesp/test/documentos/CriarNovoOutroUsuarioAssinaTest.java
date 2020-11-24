package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.dados.acesso.UsuarioAuxiliarDadosOk;
import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.pages.documentos.NovoDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;
import prodesp.utils.Propriedades;

public class CriarNovoOutroUsuarioAssinaTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}

	@Test
	public void criarNovoOutroUsuarioAssina() throws InterruptedException {

		NovoDocumentoPage novoDocumentoPage = new NovoDocumentoPage();
		MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();

		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		mesaVirtualPage.clicarBotaoCriarNovo();

		novoDocumentoPage.campoReferencia("AssinaDocumentoOutroUsuario");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		novoDocumentoPage.campoAssunto("Teste Outro Usuario");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);

		UsuarioAuxiliarDadosOk usuarioAuxiliarDadosOk = new UsuarioAuxiliarDadosOk();
		novoDocumentoPage.campoResponsavelPelaAssinatura(usuarioAuxiliarDadosOk.getUsuarioAuxOk());
		
		novoDocumentoPage.clicarLabelSubscritorSelecionado();
				
		novoDocumentoPage.botaoOK();

	}
}
