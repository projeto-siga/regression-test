package prodesp.pages.acesso;

	import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;

	public class EsqueciMinhaSenha extends BasePage {

		public boolean verificaLabelEsqueciMinhaSenha() throws InterruptedException {

			By byLabelEsqueciMinhaSenha = By.xpath("//h5[text()=\"Esqueci Minha Senha\"]");
			return funcionalidades.elementoExiste(byLabelEsqueciMinhaSenha);
		}
		
		public void escreverMatricula(String sMatricula) throws InterruptedException {
			By byCampoMatricula = By.id("txtMatricula");
			funcionalidades.escreverTexto(byCampoMatricula, sMatricula);
		}
		
		public void escreverCPF(String sCPF) throws InterruptedException {
			By byCampoCPF = By.xpath("//input[@name=\"usuario.cpf\"]");
			funcionalidades.escreverTexto(byCampoCPF, sCPF);
		}
		
		public void botaoOK() throws InterruptedException {
			By byBotaoOK = By.xpath("//button[@class=\"btn btn-primary\" and @type=\"submit\"]");
			funcionalidades.clicarBotao(byBotaoOK);
		}
	}


