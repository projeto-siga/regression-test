package prodesp.actions.documentos;

import prodesp.dados.acesso.LoginDadosOk;
import prodesp.pages.documentos.AssinarDocumentoPage;
import prodesp.test.comuns.BaseTest;
import prodesp.utils.Propriedades;;

public class AssinarDocumentoActions extends BaseTest {

	public void assinaDocumento() throws InterruptedException {

		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		AssinarDocumentoPage assinarDocumentoPage = new AssinarDocumentoPage();

		LoginDadosOk loginDadosOk = new LoginDadosOk();
		String sCampoMatricula;
		sCampoMatricula = loginDadosOk.getUsuarioOk();
		assinarDocumentoPage.escreveCampoMatricula(sCampoMatricula);

		String sCampoSenha;
		sCampoSenha = loginDadosOk.getSenhaOk();
		assinarDocumentoPage.escreveCampoSenha(sCampoSenha);

		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		assinarDocumentoPage.clicarBotaoOK();
	}
}
