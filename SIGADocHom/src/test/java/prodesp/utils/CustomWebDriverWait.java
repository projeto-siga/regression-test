package prodesp.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWebDriverWait extends WebDriverWait {

	public CustomWebDriverWait(WebDriver driver, long timeOutInSeconds) {
		super(driver, timeOutInSeconds);
	}

	public CustomWebDriverWait(WebDriver driver, long timeOutInSeconds, long sleepInMillis) {
		super(driver, timeOutInSeconds, sleepInMillis);
	}

	public void aguardar(By locator) throws InterruptedException {
		Thread.sleep(Propriedades.TEMPO_ESPERA_SLEEP);
		this.until(ExpectedConditions.visibilityOfElementLocated(locator));
		this.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void aguardarSemVerificarElemento(By locator) throws InterruptedException {
		Thread.sleep(Propriedades.TEMPO_ESPERA_SLEEP);
	}
}
