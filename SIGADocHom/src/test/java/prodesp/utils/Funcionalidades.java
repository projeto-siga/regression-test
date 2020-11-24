package prodesp.utils;

import static prodesp.utils.Navegadores.getNavegador;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Funcionalidades {

	/********** Tempo **********/

	protected CustomWebDriverWait espera = new CustomWebDriverWait(getNavegador(), Propriedades.TEMPO_ESPERA_SEG);

	private WebDriverWait getEspera(int timeoutEmSegundos, int tempoVerificacaoACadaMiliseg) {
		WebDriverWait espera = new WebDriverWait(getNavegador(), timeoutEmSegundos);
		espera.pollingEvery(Duration.ofMillis(tempoVerificacaoACadaMiliseg));
		espera.ignoring(NoSuchElementException.class);
		espera.ignoring(ElementNotVisibleException.class);
		espera.ignoring(StaleElementReferenceException.class);
		espera.ignoring(NoSuchFrameException.class);
		return espera;
	}

	/********* Elemento ************/

	public WebElement getWebElement(By byLocator) {
		WebElement elemento = getNavegador().findElement(byLocator);
		return elemento;
	}

	// Elemento NÃO FUNCIONA
	public boolean elementoExiste(By byLocator) throws InterruptedException {
		if (Navegadores.getNavegador().findElement(byLocator).isEnabled()) {
			return true;
		} else {
			return false;
		}
	}

	// Elemento NÃO FUNCIONA
	public boolean elementoSelecionado(By byLocator) throws InterruptedException {
		if (Navegadores.getNavegador().findElement(byLocator).isSelected()) {
			return true;
		} else {
			return false;
		}
	}

	// Foco no elemento
	public void focoNoObjeto(By byLocator) throws InterruptedException {
		Navegadores.getNavegador().findElement(byLocator).click();
	}

	// Espera elemento visível
	public void esperaElementoVisivel(WebElement element) {
//		log.info("waiting for:"+element.toString()+" for "+Propriedades.TEMPO_ESPERA_MS_MAIOR+"segundos.");
		WebDriverWait espera = getEspera(Propriedades.TEMPO_ESPERA_MS_MAIOR, Propriedades.TEMPO_ESPERA_MS);
		espera.until(ExpectedConditions.visibilityOf(element));
//		log.info("Element está visível.");
	}

	// Espera elemento clicável
	public void esperaElementoClicavel(WebElement element) {
//		log.info("waiting for:"+element.toString()+" for "+Propriedades.TEMPO_ESPERA_MS_MAIOR+"segundos.");
		WebDriverWait espera = new WebDriverWait(Navegadores.getNavegador(), Propriedades.TEMPO_ESPERA_MS_MAIOR);
		espera.until(ExpectedConditions.elementToBeClickable(element));
//		log.info("Element está clicável.");
	}

	public boolean esperaElementoDesaparecer(WebElement element) {
//		log.info("waiting for:"+element.toString()+" for "+Propriedades.TEMPO_ESPERA_MS_MAIOR+"segundos.");
		WebDriverWait espera = new WebDriverWait(Navegadores.getNavegador(), Propriedades.TEMPO_ESPERA_MS_MAIOR);
		boolean status = espera.until(ExpectedConditions.invisibilityOf(element));
//		log.info("Elemento está invisível");
		return status;
	}

	/********** Botões **********/
	public void clicarBotao(By byLocator) throws InterruptedException {
		espera.aguardar(byLocator);
		getNavegador().findElement(byLocator).click();
	}

	/********* Check ************/

	public void clicarCheck(By byLocator) {
		Navegadores.getNavegador().findElement(byLocator).click();
	}

	public boolean isCheckMarcado(By byLocator) {
		return getNavegador().findElement(byLocator).isSelected();
	}

	/********* Combo ************/

	public void selecionarCombo(By byLocator, String valor) {
		WebElement elemento = getNavegador().findElement(byLocator);
		Select combo = new Select(elemento);
		combo.selectByVisibleText(valor);
	}

	public void deselecionarCombo(By byLocator, String valor) {
		WebElement elemento = getNavegador().findElement(byLocator);
		Select combo = new Select(elemento);
		combo.deselectByVisibleText(valor);
	}

	public String obterValorCombo(By byLocator) {
		WebElement elemento = getNavegador().findElement(byLocator);
		Select combo = new Select(elemento);
		return combo.getFirstSelectedOption().getText();
	}

	public List<String> obterValoresCombo(By byLocator) {
		WebElement elemento = getNavegador().findElement(byLocator);
		Select combo = new Select(elemento);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}

	public int obterQuantidadeOpcoesCombo(By byLocator) {
		WebElement elemento = getNavegador().findElement(byLocator);
		Select combo = new Select(elemento);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}

	public boolean verificarSeExisteOpcaoCombo(By byLocator, String opcaoAProcurar) {
		WebElement elemento = getNavegador().findElement(byLocator);
		Select combo = new Select(elemento);
		List<WebElement> opcoes = combo.getOptions();
		for (WebElement opcao : opcoes) {
			if (opcao.getText().equals(opcaoAProcurar)) {
				return true;
			}
		}
		return false;
	}

	/********* Combo Múltiplo ************/

	public List<String> obterValorSelecComboMultById(String idCampo) {
		WebElement elemento = Navegadores.getNavegador().findElement(By.id(idCampo));
		Select combo = new Select(elemento);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valoresCombo = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valoresCombo.add(opcao.getText());
		}
		return valoresCombo;
	}

	/********* Link ************/

	public void clicarLink(String textoLink) {
		Navegadores.getNavegador().findElement(By.linkText(textoLink)).click();
	}

	public String obterValorLink(By byLocator) {
		return Navegadores.getNavegador().findElement(byLocator).getText();
	}

	/********** Lista de string **********/

	public List<String> obterListaDeMensagens(By byLocator) {
		List<WebElement> mensagens = Navegadores.getNavegador().findElements(byLocator);
		List<String> listaMensagens = new ArrayList<String>();
		for (WebElement mensagem : mensagens) {
			listaMensagens.add(mensagem.getText());
		}
		return listaMensagens;
	}

	/********* Radio ************/

	public void clicarRadio(By byLocator) {
		getNavegador().findElement(byLocator).click();
	}

	public boolean isRadioMarcado(By byLocator) {
		return getNavegador().findElement(byLocator).isSelected();
	}

	/********** Tabela **********/

	public void clicarTabelaBotao(By byTabela, String colunaBusca, String valorBusca, String colunaBotao) {
		// Procurar coluna do registro
		WebElement tabela = getNavegador().findElement(byTabela);
		int idColuna = obterIndiceColuna(tabela, colunaBusca);

		// Encontrar a linha do registro
		int idLinha = obterIndiceLinhaValorBuscaIgual(tabela, idColuna, valorBusca);

		// Descobrir em que coluna está o botão
		int idColunaBotao = obterIndiceColuna(tabela, colunaBotao);

		// Clicar no botão da celula encontrada
		WebElement celula = tabela.findElement(By.xpath(".//tr[" + idLinha + "]/td[" + idColunaBotao + "]"));
		celula.findElement(By.xpath(".//button")).click();
	}

	public boolean obterValorColunaTabela(By byTabela, String colunaBusca, String valorBusca) {
		// Procurar coluna do registro
		WebElement tabela = getNavegador().findElement(byTabela);
		int idColuna = obterIndiceColuna(tabela, colunaBusca);

		// Encontrar a linha do registro
		int idLinha = obterIndiceLinhaValorBuscaIgual(tabela, idColuna, valorBusca);

		// Clicar no botão da celula encontrada
		WebElement celula = tabela.findElement(By.xpath(".//tr[" + idLinha + "]/td[" + idColuna + "]"));
		return celula.getText().contains(valorBusca);
	}

	public boolean obterValorIdColunaTabela(By byTabela, int colunaBusca, String valorBusca) {
		// Procurar coluna do registro
		WebElement tabela = getNavegador().findElement(byTabela);
		int idColuna = colunaBusca;

		// Encontrar a linha do registro
		int idLinha = obterIndiceLinhaValorBuscaContem(tabela, idColuna, valorBusca);

		// Clicar no botão da celula encontrada
		WebElement celula = tabela.findElement(By.xpath(".//tr[" + idLinha + "]/td[" + idColuna + "]"));
		return celula.getText().contains(valorBusca);
	}

	private int obterIndiceColuna(WebElement tabela, String colunaBusca) {
		List<WebElement> colunas = tabela.findElements(By.xpath(".//th"));
		int idColuna = -1;
		for (int i = 0; i < colunas.size(); i++) {
			if (colunas.get(i).getText().equals(colunaBusca)) {
				idColuna = i + 1;
				break;
			}
		}
		return idColuna;
	}

	private int obterIndiceLinhaValorBuscaIgual(WebElement tabela, int idColuna, String valorBusca) {
		List<WebElement> linhas = tabela.findElements(By.xpath(".//tbody/tr/td[" + idColuna + "]"));
		int idLinha = 0;
		for (int i = 0; i < linhas.size(); i++) {
			if (linhas.get(i).getText().equals(valorBusca)) {
				idLinha = i + 1;
				break;
			}
		}
		return idLinha;
	}

	private int obterIndiceLinhaValorBuscaContem(WebElement tabela, int idColuna, String valorBusca) {
		List<WebElement> linhas = tabela.findElements(By.xpath(".//tbody/tr/td[" + idColuna + "]"));
		int idLinha = 0;
		for (int i = 0; i < linhas.size(); i++) {
			if (linhas.get(i).getText().contains(valorBusca)) {
				idLinha = i + 1;
				break;
			}
		}
		return idLinha;
	}

	/********** Texto **********/

	public String obterValueText(By byLocator) throws InterruptedException {
		espera.aguardar(byLocator);
		return getNavegador().findElement(byLocator).getAttribute("value");
	}

	public String obterGetText(By byLocator) throws InterruptedException {
		espera.aguardar(byLocator);
		return getNavegador().findElement(byLocator).getText();
	}

	public void digitarTeclaAtalho(By byLocator, Keys teclaAtalho) throws InterruptedException {
		espera.aguardar(byLocator);
		getNavegador().findElement(byLocator).sendKeys(teclaAtalho);
	}

	public void escreverTexto(By byLocator, String textoAEscrever) throws InterruptedException {
		espera.aguardar(byLocator);
		getNavegador().findElement(byLocator).clear();
		getNavegador().findElement(byLocator).sendKeys(textoAEscrever);
	}
	
	/******** Escrever em IFrame ***********/
	
	   public void escreverTextoEmIFrame(By byLocator, String textoAEscrever) throws InterruptedException {
	        WebElement iFrame = getNavegador().findElement(byLocator);
	        getNavegador().switchTo().frame(iFrame);
	        WebElement iFrameTxt = getNavegador().findElement(By.tagName("body"));            
	        iFrameTxt.click();            
	        iFrameTxt.sendKeys(textoAEscrever);    
	        getNavegador().switchTo().defaultContent();
	    }
	   
	  /****** Escrever Campo com Máscara ******/
	   
	   public void escreverTextoComMascara(By byLocator, String textoAEscrever) throws InterruptedException {
	        espera.aguardar(byLocator);
	        getNavegador().findElement(byLocator).clear();    
	        getNavegador().findElement(byLocator).click();
	        getNavegador().findElement(byLocator).sendKeys(textoAEscrever);    
	    }
	   
}
