package prodesp.actions.documentos;

import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.pages.documentos.NovoDocumentoPage;
import prodesp.utils.Propriedades;

public class CriarDocumentoActions {
	
	public void criarNovoDocumento() throws InterruptedException {
	NovoDocumentoPage novoDocumentoPage = new NovoDocumentoPage();
	MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();
	
	Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
	mesaVirtualPage.clicarBotaoCriarNovo();
		
	novoDocumentoPage.campoAssunto("Teste de Assunto");
	Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
	
	novoDocumentoPage.campoReferencia("Teste Ref");
	Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		
	novoDocumentoPage.campoTextoDoMemorando("O texto do memorando vai aqui");
	Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
	
	novoDocumentoPage.botaoOK();

	}


}
