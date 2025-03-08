package br.ce.cristian.appium.page;

import org.openqa.selenium.By;

import br.ce.cristian.appium.core.BasePage;

public class AbaPage extends BasePage {

	public String verificarTextoAba1() {

		return obtertexto(By.xpath("//android.widget.TextView[@text='Este é o conteúdo da Aba 1']"));

	}

	public String verificarAba1() {
		return obtertexto(By.xpath("//android.widget.TextView[@text='Aba 1']"));
	}

	public String verificarTextoAba2() {

		return obtertexto(By.xpath("//android.widget.TextView[@text='Este é o conteúdo da Aba 2']"));

	}

	public String verificarAba2() {
		return obtertexto(By.xpath("//android.widget.TextView[@text='Aba 2']"));
	}

	public void AcessarAba2() {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='Aba 2']"));
	}

}
