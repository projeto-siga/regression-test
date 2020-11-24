package prodesp.test.comuns;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import prodesp.actions.acesso.LoginActions;
import prodesp.utils.Navegadores;
import prodesp.utils.Propriedades;

public class BaseTest {

	protected WebDriver driver;
//	public ExtentTest extentTest;
//	RelatorioMetodos relatorio = new RelatorioMetodos();
	LoginActions loginActions = new LoginActions();
	

	@Parameters("tipoNavegador")
	@BeforeMethod
	public void abrirHome() throws InterruptedException {
		loginActions.abrirURL();
	}

	@AfterClass
	public void finalizarTeste() throws IOException {
		if (Propriedades.FECHAR_NAVEGADOR) {
			Navegadores.fecharNavegador();
		}
	}

}
