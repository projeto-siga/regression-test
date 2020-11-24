package prodesp.pages.documentos;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

public class InclusaoDeCossignatarioPage extends BasePage {

	public boolean labelInclusaoDeCosignatario() throws InterruptedException {
		By byLabelInclusaoDeCosignatario = By.xpath("//div[@class=\"card-header\"]");
		return funcionalidades.elementoExiste(byLabelInclusaoDeCosignatario);
	}

	public void escreveCampoCossignatarioSel(String sConsignatarioSel) throws InterruptedException {
		By byCampoCosignatarioSel = By.id("formulario_cosignatarioSel_sigla");
		funcionalidades.escreverTexto(byCampoCosignatarioSel, sConsignatarioSel);
	}

	public void clicarLabelCossignatarioSelSpan() throws InterruptedException {
		By byLabelCosignatarioSelSpan = By.id("cosignatarioSelSpan");
		funcionalidades.clicarBotao(byLabelCosignatarioSelSpan);
	}

	public void checkboxPersonalizar() {
		By byCheckboxPersonalizar = By.id("exDocumentoDTO.personalizacao");
		funcionalidades.clicarCheck(byCheckboxPersonalizar);
	}

	public void botaoOK() throws InterruptedException {
		By byBotaoOK = By.xpath("//input[@type=\"submit\"]");
		funcionalidades.clicarBotao(byBotaoOK);
	}

	public void botaoVoltar() throws InterruptedException {
		By byBotaoVoltar = By.id("//input[@class=\"btn btn-cancel ml-2\"]");
		funcionalidades.clicarBotao(byBotaoVoltar);
	}

	public boolean verificaQuadroCossignatarios() throws InterruptedException {
		By byQuadroCossignatarios = By.xpath("//a[@href=\"#collapseCossignatários\"]");
		return funcionalidades.elementoExiste(byQuadroCossignatarios);
	}
}
