package pageObjects.Generics;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import drive.DriverFactory;

public class GenericsLogic extends DriverFactory {

	private GenericsPage genericsPage;

	public GenericsLogic() {
		genericsPage = new GenericsPage();

	}

	public void navega() {
		navega("https://www.brilhoso.com.br/");
	}

	public void validoMsg(String msgFinal) {
		String cmpValidacao = String.format(genericsPage.getTxtVisivel(), msgFinal);
		tempoDeEspera(2000);
		WebElement xpathMsg = driver.findElement(By.xpath(cmpValidacao));
		assertTrue(xpathMsg.isDisplayed());
	}
	
	public void validoRedirecionamento(String vldRedirecionamento) {
		String valida = String.format(genericsPage.getClassVisivel(), vldRedirecionamento);
		tempoDeEspera(2000);
		WebElement xpathValida = driver.findElement(By.xpath(valida));
		assertTrue(xpathValida.isDisplayed());
	}

}
