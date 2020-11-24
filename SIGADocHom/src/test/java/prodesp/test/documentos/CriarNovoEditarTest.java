package prodesp.test.documentos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import prodesp.actions.documentos.CriarDocumentoActions;
import prodesp.actions.documentos.EditarDocumentoActions;
import prodesp.test.acesso.LoginTest;
import prodesp.test.comuns.BaseTest;

public class CriarNovoEditarTest extends BaseTest {
	
	@BeforeClass
	public void loginSucesso() throws InterruptedException {
		LoginTest loginTest = new LoginTest();
		loginTest.loginSucesso();
	}

	@Test
	public void CriarNovoEditar() throws InterruptedException {
		CriarDocumentoActions criarDocumentoActions = new CriarDocumentoActions();
		criarDocumentoActions.criarNovoDocumento();
		
		EditarDocumentoActions editarDocumentoActions = new EditarDocumentoActions();
		editarDocumentoActions.EditarDocumento();
	}

}
