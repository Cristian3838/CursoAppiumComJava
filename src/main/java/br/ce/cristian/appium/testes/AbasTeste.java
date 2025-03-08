package br.ce.cristian.appium.testes;

import org.junit.Before;
import org.junit.Test;

import br.ce.cristian.appium.core.BaseTest;
import br.ce.cristian.appium.core.DriverFactory;
import br.ce.cristian.appium.page.AbaPage;
import br.ce.cristian.appium.page.MenuPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;


//Roteiro de Testes
public class AbasTeste extends BaseTest {
	
	private AndroidDriver<MobileElement> driver;
	private MenuPage menu = new MenuPage();
	private AbaPage page = new AbaPage();
	
	@Before
	public void inicializaAppium() {
		menu.AcessarAbas();
		driver = DriverFactory.getdriver();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void deveInteragirComAbas() {		
		
		//Verificar que está na aba 1
		Assert.assertEquals("Aba 1", page.verificarAba1());
		Assert.assertEquals("Este é o conteúdo da Aba 1", page.verificarTextoAba1());
		
		//Acessar aba 2
		page.AcessarAba2();
		
		//Verificar que está an aba 2
		Assert.assertEquals("Aba 2", page.verificarAba2());
		Assert.assertEquals("Este é o conteúdo da Aba 2", page.verificarTextoAba2());
		
		
		
	}
	
	

}
