package prodesp.actions.documentos;

import org.openqa.selenium.Alert;

import prodesp.utils.Navegadores;

public class PopupConfirmacaoActions {

	public void ConfirmaAlerta() throws InterruptedException {		
		Alert alert = Navegadores.getNavegador().switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
}