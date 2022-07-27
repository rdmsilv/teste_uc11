package teste_uc11;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class teste_senai {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("web.drive.chrome.driver","/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testeNavegador() {
		driver.get("https://informatica.sp.senai.br/");
		 driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("informatica");
		 driver.findElement(By.id("Busca1_btnBusca")).click();
	}
}
