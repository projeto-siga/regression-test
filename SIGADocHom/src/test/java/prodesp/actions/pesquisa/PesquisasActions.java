package prodesp.actions.pesquisa;

import prodesp.pages.acesso.MesaVirtualPage;
import prodesp.pages.pesquisa.PesquisaAvancadaPage;

public class PesquisasActions {

	// Páginas
	MesaVirtualPage mesaVirtualPage = new MesaVirtualPage();

	PesquisaAvancadaPage pesquisaAvancadaPage = new PesquisaAvancadaPage();

	public void clicarBotaoPesquisaAvancada() throws InterruptedException {
		mesaVirtualPage.clicarBotaoPesquisaAvancada();
		pesquisaAvancadaPage.verificaPesquisaAvancadaLabel();

	}
}
