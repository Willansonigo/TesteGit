

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestePagamento {

	@org.junit.Test
	public void testePagamento() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS);
	
	driver.get("http://pagamentoschml.qualirede.com.br/home");
	                              
	WebElement usuario = driver.findElement(By.id("username"));
    usuario.sendKeys("sandro.junior");
    
    WebElement senha = driver.findElement(By.id("senha"));
    senha.sendKeys("quali2019");
    senha.submit();
    
    WebElement aaa = driver.findElement(By.id("submit"));
    aaa.submit();
    
  //  WebElement pagamento = driver.findElement(By.xpath("//img[contains(@src,'http://pagamento.qualirede.com.br/resources/images/sistema/pagamento.svg')]"));
  //  pagamento.click();
    
    	    
    
	}

}