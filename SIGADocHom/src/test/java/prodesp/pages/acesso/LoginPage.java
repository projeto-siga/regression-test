package prodesp.pages.acesso;

import org.openqa.selenium.By;

import prodesp.pages.comuns.BasePage;
import prodesp.utils.Enderecos;
import prodesp.utils.Navegadores;
import prodesp.utils.Propriedades;

public class LoginPage extends BasePage {
	
	public boolean verificaExistenciaMsgAviso() throws InterruptedException {
		By msgAviso = By.xpath("//h5[@class=\"modal-title\" and text()=\"Aviso Importante\"]");
		return funcionalidades.elementoExiste(msgAviso);
	}
	
	public void clicarBotaoOkAviso() throws InterruptedException {
		By btnOkAviso = By.xpath("//button[text()=\"Ok\"]");
		funcionalidades.clicarBotao(btnOkAviso);
	}
	
	public void clicarBotaoEntrar() throws InterruptedException {	
		By btnEntrar = By.xpath("//button[text()=\" Entrar\"]");
		funcionalidades.clicarBotao(btnEntrar);
	}
	
	public boolean verificaExistenciaBotaoEntrar() throws InterruptedException {
		By btnEntrar = By.xpath("//button[text()=\" Entrar\"]");
		return funcionalidades.elementoExiste(btnEntrar);
	}
	
	public void abrirURLHome() throws InterruptedException {	
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
		Navegadores.getNavegador().get(Enderecos.URLInicial());
		Thread.sleep(Propriedades.TEMPO_ESPERA_MS);
	}	
	
	public void informarUsuario(String sUsuario) throws InterruptedException {		
		By byUsuario = By.name("username");
		funcionalidades.escreverTexto(byUsuario, sUsuario);
	}
	
	public void informarSenha(String sSenha) throws InterruptedException {		
		By bySenha = By.id("password");
		funcionalidades.escreverTexto(bySenha, sSenha);
	}
	
	
	public boolean verificaExistenciaMsgFalhaAutenticacao() throws InterruptedException {
		By msgFalhaAutenticacao = By.xpath("//p[text()=\"Falha de autenticação!\"]");
		return funcionalidades.elementoExiste(msgFalhaAutenticacao);
	} 
	
	
}
