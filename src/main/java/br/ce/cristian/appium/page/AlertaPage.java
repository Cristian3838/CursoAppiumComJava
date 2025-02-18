package br.ce.cristian.appium.page;

import org.openqa.selenium.By;

import br.ce.cristian.appium.core.BasePage;

public class AlertaPage extends BasePage {
	
	public void clicarAlertaConfirm() {
		clicarNoElemento(By.xpath("//android.widget.TextView[@text='ALERTA CONFIRM']"));
		
	}
	
	public String obterTituloTexto() {
		return obtertexto(By.xpath("//android.widget.TextView[@text='Info']"));
	}

	public String frasePageModal1() {
		return obtertexto(By.xpath("//android.widget.TextView[@text='Confirma a operação?']"));
	}

	public void clicarBotaoConfirm() {
		clicarNoElemento(By.xpath("//android.widget.Button[@text='CONFIRMAR']"));
		
	}

	public String frasePageModal2() {
		
		return obtertexto(By.xpath("//android.widget.TextView[@text='Confirmado']"));
	}

	public void clicarBotaoSair() {
		clicarNoElemento(By.xpath("//android.widget.Button[@text='SAIR']"));
		
	}
	
	
	

}
