package prodesp.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class RelatorioMetodos {

	private static ExtentReports extent;
	DataHora dataHora = new DataHora();

	public static ExtentReports createInstance(String nomeRelatorio) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(nomeRelatorio);
		htmlReporter.loadXMLConfig("extent-config.xml");
//		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//		htmlReporter.config().setChartVisibilityOnOpen(true);
//		htmlReporter.config().setTheme(Theme.STANDARD);
//		htmlReporter.config().setDocumentTitle("Resultado de Testes Funcionais"); //Aba do Browser
//		htmlReporter.config().setEncoding("UTF-8");
//		htmlReporter.config().setReportName("Resultado de Testes Funcionais");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		return extent;
	}

	public String capturaImagem(String sNomeTeste) {
		File diretorio = new File(Enderecos.diretorioScreenshot() + dataHora.getAnoMesDiaAtual());
		if (!diretorio.exists()) {
			diretorio.mkdirs(); // mkdir() cria somente um diretório, mkdirs() cria diretórios e subdiretórios.
		}

		String sDiretorioNomeArquivo = null;
		if (sNomeTeste == "") {
			sNomeTeste = "blank";
		}
		Reporter.log("Captura imagem ");

		File arqDest = null;
		File arqScreenshot = ((TakesScreenshot) Navegadores.getNavegador()).getScreenshotAs(OutputType.FILE);
		try {
			sDiretorioNomeArquivo = diretorio.getAbsolutePath() + File.separator
					+ dataHora.getDataHoraMinSegAtualSeparadoUnderline() + "_" + sNomeTeste;
			arqDest = new File(sDiretorioNomeArquivo + ".jpg");
			FileUtils.copyFile(arqScreenshot, arqDest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arqDest.toString();
	}

}
