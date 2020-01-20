import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;


public class PrestadorSolicitante {

    static WebDriver driver;

    @Before
    public void acessarRegulacao() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");



        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://scportalhml2.qualirede.com.br/sistemas");
        driver.findElement(By.id("username")).sendKeys("willan.nilsson");
        WebElement senha = driver.findElement(By.id("senha"));
        senha.sendKeys("willan07091992");
        driver.findElement(By.id("submit")).click();
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div[4]/div/a")).click();
        System.out.println("Teste");

    }

    @org.junit.Test
    public void AdicionarPrestador() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div/div/div/div[2]/div[2]/ul/li[9]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"j_idt262:j_idt264\"]/div")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"form-prestador-solicitante:contratado-solicitante\"]")).sendKeys("teste");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Select registro = new Select(driver.findElement(By.id("form-prestador-solicitante:registro-ans")));
        registro.selectByIndex(1);
        driver.findElement(By.id("form-prestador-solicitante:j_idt332")).click();
        driver.quit();

    }
    @org.junit.Test
    public void testarFiltro() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div/div/div/div[2]/div[2]/ul/li[9]/div/ul/li[1]/a")).click();
        //Pesquisa por Codigo
        driver.findElement(By.xpath("//*[@id=\"j_idt269\"]/div[1]/div[1]/input")).sendKeys("25185");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(By.id("j_idt269:j_idt280")).click();

        WebElement teste = wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt269:j_idt281")));
        teste.click();
       // driver.findElement(By.id("j_idt269:j_idt281")).click();
        //Pesquisa por Nome Contratado
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(By.name("j_idt269:j_idt273")).sendKeys("teste");
        driver.findElement(By.id("j_idt269:j_idt280")).click();
        WebElement limpar = wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt269:j_idt281")));
        driver.findElement(By.id("j_idt269:j_idt281")).click();

        //WebDriverWait wait = new WebDriverWait(driver, 10);
       // WebElement teste = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("j_idt269:j_idt280")));


        WebElement selecionar = wait.until(ExpectedConditions.elementToBeClickable(By.name("j_idt269:j_idt276")));
        //Pesquisa por RegistroANS
        Select registro2 = new Select(driver.findElement(By.name("j_idt269:j_idt276")));
        registro2.selectByIndex(1);
        driver.findElement(By.id("j_idt269:j_idt281")).click();
        //Navegando pelas páginas

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(By.id("j_idt298:j_idt306:3:j_idt308"));
        driver.quit();

        //Apagando um prestador
    }

    @org.junit.Test
     public void apagarPrestador() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div/div/div/div[2]/div[2]/ul/li[9]/div/ul/li[1]/a")).click();
        driver.findElement(By.name("j_idt269:j_idt273")).sendKeys("teste");
        driver.findElement(By.id("j_idt269:j_idt280")).click();
        WebElement apagar = wait.until(ExpectedConditions.elementToBeClickable(By.id("data-tables:1:j_idt295")));
        //driver.findElement(By.id("data-tables:1:j_idt295")).click();
        apagar.click();


        driver.quit();


    }

    }


    //}
