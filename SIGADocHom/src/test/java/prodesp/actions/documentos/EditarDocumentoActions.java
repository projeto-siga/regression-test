package prodesp.actions.documentos;

import prodesp.pages.documentos.EditarDocumentoPage;
import prodesp.pages.documentos.FuncoesDocumentoPage;

public class EditarDocumentoActions {
	FuncoesDocumentoPage funcoesDocumentoPage = new FuncoesDocumentoPage();
	EditarDocumentoPage editarDocumentoPage = new EditarDocumentoPage();
	
	public void EditarDocumento() throws InterruptedException {

		
		funcoesDocumentoPage.clicarBotaoEditar();

		
		editarDocumentoPage.campoReferencia("Altera");
		editarDocumentoPage.campoAssunto("Altera");
		editarDocumentoPage.botaoOK();

	}

}
