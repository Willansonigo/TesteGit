import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class TesteRegulacao {
	
	 static WebDriver driver; 	
	 
	 
	 
	

    @Before
	public void acessarRegulacao() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	
    driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://scportalhml2.qualirede.com.br/sistemas");
    driver.findElement(By.id("username")).sendKeys("willan.nilsson" );
    WebElement senha = driver.findElement(By.id("senha"));
    senha.sendKeys("willan07091992");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div[4]/div/a")).click();
    
    
    }
	
    
    
    
    
    
    
    @org.junit.Test
	public void usuarioAdd(){
   
   driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div[4]/div/a")).click();
   driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/a")).click();
  
    
    driver.close();
    
  //  WebElement solicitacao = driver.findElement(By.id("form-selecao:btn-proc-solic-aut"));
   // solicitacao.click();
	
   // WebElement registro = driver.findElement(By.id("form-principal:j_idt912"));
  //  registro.click();
                         
    }
    //Movendo Bandeja de não consultoria para de consultoria.
    @org.junit.Test
    public void solicitacaoMoverBandeja() {
    driver.findElement(By.id("menu-atendimentos-analise")).click();
    driver.findElement(By.xpath("//*[@id=\"j_idt262\"]/div[10]/div[2]/input")).sendKeys("26102846");
    driver.findElement(By.id("j_idt262:j_idt421")).click();
    driver.findElement(By.xpath("//*[@id=\"data-tables\"]/tbody/tr/td[2]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"form-principal:btn-mover-bandeja\"]/div")).click();
    try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
    Select teste = new Select(driver.findElement(By.xpath("//*[@id=\"form-mover-bandeja:bandejaSelected\"]")));
    teste.selectByIndex(3);
    driver.findElement(By.id("form-mover-bandeja:j_idt3941")).click();
    }

 
    public void Encerrar() {
    	driver.close();
    	
    	
    	
    }

}
