package prodesp.utils;

import java.io.IOException;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class RelatorioListener implements ITestListener, ISuiteListener, IInvokedMethodListener {

	DataHora dataHora = new DataHora();
	RelatorioMetodos relatorioMetodos = new RelatorioMetodos();

	String caminhoNomeRelatorio = Enderecos.diretorioRelatorioEvidenciaTeste() + "RelatorioEvidenciaTestes_"
			+ dataHora.getAnoMesDiaHoraMinAtual() + ".html";

	private ExtentReports extent = relatorioMetodos.createInstance(caminhoNomeRelatorio);
	private static ThreadLocal parentTest = new ThreadLocal();
	private static ThreadLocal test = new ThreadLocal();

	@Override
	public synchronized void onStart(ISuite suite) {
		Reporter.log("onStart do Suite: " + suite.getName(), true);
	}

	@Override
	public synchronized void onStart(ITestContext context) {
		Reporter.log("onStart do Test: " + context.getName() + " " + context.getAttributeNames(), true);
		ExtentTest parent = extent.createTest(context.getName());
		parentTest.set(parent);
	}

	@Override
	public synchronized void onFinish(ITestContext context) {
		Reporter.log("onFinish do Test: " + context.getName(), true);
		extent.flush();
	}

	@Override
	public synchronized void onTestStart(ITestResult result) {
		ExtentTest child = ((ExtentTest) parentTest.get())
				.createNode(result.getMethod().getMethodName() + " - " + retornaDescricaoTeste(result));
		test.set(child);
	}

	@Override
	public synchronized void onTestSuccess(ITestResult result) {
		printTestResults(result);
		try {
			((ExtentTest) test.get())
					.pass(result.getName() + " " + retornaDescricaoTeste(result) + " executado com sucesso. ");
			((ExtentTest) test.get()).addScreenCaptureFromPath(relatorioMetodos.capturaImagem(result.getName()));
		} catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

	@Override
	public synchronized void onTestFailure(ITestResult result) {
		printTestResults(result);
		try {
			((ExtentTest) test.get()).addScreenCaptureFromPath(relatorioMetodos.capturaImagem(result.getName()));
			((ExtentTest) test.get()).fail(result.getThrowable());
		} catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

	@Override
	public synchronized void onTestSkipped(ITestResult result) {
		printTestResults(result);
		try {
			((ExtentTest) test.get()).addScreenCaptureFromPath(relatorioMetodos.capturaImagem(result.getName()));
			((ExtentTest) test.get()).skip(result.getThrowable());
		} catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

	@Override
	public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public synchronized void onFinish(ISuite suite) {
		Reporter.log("onFinish do Suite " + suite.getName(), true);
	}

	public synchronized void beforeInvocation(IInvokedMethod InvokedMethod, ITestResult result) {
		String textoMsg = "Início da execução do método: " + returnMethodName(InvokedMethod.getTestMethod());
		Reporter.log(textoMsg, true);
	}

	// This belongs to IInvokedMethodListener and will execute after every method
	// including @Before @After @Test
	public synchronized void afterInvocation(IInvokedMethod invokedMethod, ITestResult result) {
		String textoMsg = "Finalizada execução do método: " + returnMethodName(invokedMethod.getTestMethod());
		Reporter.log(textoMsg, true);
	}

	// This will return method names to the calling function
	private String returnMethodName(ITestNGMethod method) {
		return method.getRealClass().getSimpleName() + "." + method.getMethodName();
	}

	private void printTestResults(ITestResult result) {

		if (result.getParameters().length != 0) {
			Reporter.log("Método de teste " + result.getTestClass().getName() +": " + retornaParamentrosTeste(result), true);
		} else {
			Reporter.log("Método de teste " + result.getTestClass().getName(), true);
		}

		String status = null;

		switch (result.getStatus()) {
		case ITestResult.SUCCESS:
			status = "Passou";
			break;
		case ITestResult.FAILURE:
			status = "Falhou";
			break;
		case ITestResult.SKIP:
			status = "Não executado";
		}
		Reporter.log("Status do Teste: " + status, true);
	}

	private String retornaDescricaoTeste(ITestResult result) {
		if (result.getParameters().length != 0) {
			String params = "";
			int i = 0;
			for (Object parameter : result.getParameters()) {
				params += parameter.toString() + " ";
				i++;
				if (i == 2)
					break;
			}
			return params;
		} else
			return "";
	}

	private String retornaParamentrosTeste(ITestResult result) {
		if (result.getParameters().length != 0) {
			String params = "";
			for (Object parameter : result.getParameters()) {
				params += "\"" + parameter.toString() + "\" ";
			}
			return params;
		} else
			return "";
	}
}
