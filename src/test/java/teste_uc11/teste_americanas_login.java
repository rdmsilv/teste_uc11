package teste_uc11;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class teste_americanas_login {
		 private WebDriver driver;
		 
		 @Before
		 public void abrirNavegador() {
			 System.setProperty("web.drive.chrome.driver","/usr/local/bin/chromedriver");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("http://localhost:4200/login");
			 
			 
		 }
		 
		 @Test
		public void testeNavegador(){
			 
			WebElement inputEmail = driver.findElement(By.id("email"));
			WebElement inputSenha = driver.findElement(By.id("senha"));
			WebElement botaoLogin = driver.findElement(By.id("botao-enviar"));
			
			inputEmail .sendKeys("rudimar@gmail.com");
			inputSenha.sendKeys("12131415");
			botaoLogin.click();
			
			
		 }
}
