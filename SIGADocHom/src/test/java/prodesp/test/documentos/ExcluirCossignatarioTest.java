package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.dados.acesso.UsuarioAuxiliarDadosOk;
import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;
import prodesp.pages.documentos.InclusaoDeCossignatarioPage;
import prodesp.pages.documentos.NovoDocumentoPage;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;
import prodesp.utils.Propriedades;

public class ExcluirCossignatarioTest extends BaseTest {

	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}

	@Test
	public void assinaExcluiCossignatario() throws InterruptedException {
		NovoDocumentoPage novoDocumentoPage = new NovoDocumentoPage();
		MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();

		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		mesaVirtualPage.clicarBotaoCriarNovo();

		novoDocumentoPage.campoReferencia("IndicaCossignatario");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		novoDocumentoPage.campoAssunto("Teste Cossignatário");
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);

		novoDocumentoPage.botaoOK();

		FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
		funcoesDocumentoPage.clicarBotaoIncluirCossignatario();
		
		InclusaoDeCossignatarioPage inclusaoDeCossignatario = new InclusaoDeCossignatarioPage();
		UsuarioAuxiliarDadosOk usuarioAuxiliarDadosOk = new UsuarioAuxiliarDadosOk();
		inclusaoDeCossignatario.escreveCampoCossignatarioSel(usuarioAuxiliarDadosOk.getUsuarioAuxOk());
		inclusaoDeCossignatario.clicarLabelCossignatarioSelSpan();
		
		inclusaoDeCossignatario.botaoOK();
		
		funcoesDocumentoPage.clicarBotaoExcluirCossignatario();
	}

}
