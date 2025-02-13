package br.ce.cristian.TreinamentoBasa;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Basa {

	@Test
	public void formulario() throws MalformedURLException, InterruptedException {
		// Definir as capacidades desejadas
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability(MobileCapabilityType.APP,
				"/home/cristian_ataliba/eclipse-workspace/CursoAppiumCast/src/main/resources/LCA002.apk");

		// capabilities.setCapability("appPackage", "com.ctappium.MainActivity");
		// capabilities.setCapability("appActivity",
		// "com.ctappium/com.ctappium.MainActivity");

		// Inicializar o driver do Appium
		AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		// URL serverUrl = new URL("http://0.0.0.0:4723/wd/hub");

		// Aguardar um pouco após o clique
		capabilities.setCapability("newCommandTimeout", 1200);
		ScrollExample scrollExample = new ScrollExample(driver);

		WebDriverWait wait = new WebDriverWait(driver, 50);
		// Clicar em NEWDEV para selecionar o ambiente
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@text='NEWDEV']")));
		MobileElement NEWDEV = driver.findElement(By.xpath("//android.view.View[@text='NEWDEV']"));
		NEWDEV.click();
		scrollExample.scrollVertical();

		// Escolher ambiente
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		MobileElement docker119 = driver
				.findElement(By.xpath("//android.view.View/android.widget.RadioButton[@text='Docker 119']"));
		docker119.click();

		// Clicar no botão OK
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();

		// Acessar sua conta
		driver.findElement(By.xpath("//android.view.View[@text='Acesse sua conta']")).click();

		
		//Preencher formulário
		WebDriverWait wait3 = new WebDriverWait(driver, 50);
		WebElement element2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@bounds='[35,651][1410,868]']")));
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[35,651][1410,868]']")).sendKeys("007"); // Agência
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[35,728][1382,861]']")).sendKeys("0634467"); //Conta
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[35,945][1382,1078]']")).sendKeys("nixon"); //Nome de Acesso
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[35,1155][1382,1288]']")).sendKeys("qqwweerr"); //Senha de Acesso
		driver.findElement(By.xpath("//android.widget.Button[@text='ENTRAR']")).click(); //Clicar no Botão entrar
		
		
		//Cadastrar dispositivo
		driver.findElement(By.xpath("//android.widget.Button[@text='CADASTRAR']")).click(); 


		// Fechar o aplicativo
		// driver.quit();
	}

}
