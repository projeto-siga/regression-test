package prodesp.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import prodesp.utils.Propriedades.LocalExecucao;
import prodesp.utils.Propriedades.TipoNavegadores;

public class Navegadores {
	private static ThreadLocal<WebDriver> threadNavegador = new ThreadLocal<WebDriver>() {
		@Override
		protected synchronized WebDriver initialValue() {
			Propriedades prop = new Propriedades();
			return iniciaNavegador(prop.obterTipoNavegador());
		}
	};

	public static WebDriver getNavegador() {
		return threadNavegador.get();
	}

	public static WebDriver iniciaNavegador(TipoNavegadores tpNavegador) {
		Propriedades prop = new Propriedades();
		System.out.println("Navegador " + tpNavegador);
		WebDriver navegador = null;
		if (Propriedades.TIPO_EXECUCAO == LocalExecucao.LOCAL) {
			switch (tpNavegador) {
			case CHROME:
				ChromeOptions options = new ChromeOptions();
//				options.addArguments("--window-size=800,1336");	
//				options.addArguments("--disable-default-apps");					
//				options.addArguments("--no-proxy-server"); 
				navegador = new ChromeDriver(options);

				break;
			case FIREFOX:
				navegador = new FirefoxDriver();
				break;
			case EDGE:
				navegador = new EdgeDriver();
				break;
			case IE:
				navegador = new InternetExplorerDriver();
				break;
//				default:
//					throw new IllegalAccessException(tpNavegador + "Não encontrado");
			}
		}

		if (Propriedades.TIPO_EXECUCAO == LocalExecucao.GRID) {
			DesiredCapabilities cap = null;
			switch (prop.TIPO_NAVEGADOR) {
			case CHROME:
				cap = DesiredCapabilities.chrome();
				break;
			case FIREFOX:
				cap = DesiredCapabilities.firefox();
				break;
			case EDGE:
				cap = DesiredCapabilities.edge();
				break;
			case IE:
				cap = DesiredCapabilities.internetExplorer();
				break;
//				default:
//					throw new IllegalAccessException(prop.TIPO_NAVEGADOR + " não encontrado");
			}

			try {
				navegador = new RemoteWebDriver(new URL(Enderecos.URL_GRID), cap);
			} catch (MalformedURLException e) {
				System.err.println("Falha na conexão com GRID");
				e.printStackTrace();
			}
		}

//		navegador.manage().window().setSize(new Dimension(800, 1336));
		navegador.manage().window().maximize();

		navegador.manage().timeouts().implicitlyWait(Propriedades.TEMPO_ESPERA_SEG_MEDIO, TimeUnit.SECONDS);
		navegador.manage().timeouts().pageLoadTimeout(Propriedades.TEMPO_ESPERA_SEG_ALTO, TimeUnit.SECONDS);

		return navegador;
	}

	public static void fecharAbaNavegador() {
		WebDriver navegador = getNavegador();
		if (navegador != null) {
			navegador.close();
		}
	}

	public static void fecharNavegador() {
		WebDriver navegador = getNavegador();
		if (navegador != null) {
			navegador.quit();
			navegador = null;
		}
		if (threadNavegador != null) {
			threadNavegador.remove();
		}

	}
}
