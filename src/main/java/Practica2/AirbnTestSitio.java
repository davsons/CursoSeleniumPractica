package Practica2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirbnTestSitio {

    public WebDriver driver;

    public AirbnTestSitio(WebDriver remoteDriver) {
        driver = remoteDriver;
    }

    public void sitioAirbn(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Imagemaker\\IdeaProjects\\CursoSelenium\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.airbnb.cl/");
    }

    public void reservas(String punta_cana) throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='_160gnkxa']/button")).click();

        driver.findElement(By.xpath("//*[@placeholder='¿A dónde vas?']")).sendKeys("Punta Cana");

        WebElement calendario= driver.findElement(By.xpath("//*[@data-testid='structured-search-input-field-split-dates-0']/div/div"));
        calendario.click();

        WebElement fechaIda = driver.findElement(By.xpath("//*[@data-testid='datepicker-day-2021-09-04']"));
        fechaIda.click();

        WebElement fechaRetorno = driver.findElement(By.xpath("//*[@data-testid='datepicker-day-2021-09-10']"));
        fechaRetorno.click();

        WebElement huespedes = driver.findElement(By.xpath("//*[@data-testid='structured-search-input-field-guests-button']/div/div"));
        huespedes.click();


        WebElement cantidadAdultos = driver.findElement(By.xpath("//*[@data-testid='stepper-adults-increase-button']"));
        cantidadAdultos.click();
        cantidadAdultos.click();



        driver.findElement(By.xpath("//*[@data-testid='structured-search-input-search-button']")).click();

        //Assert.assertTrue(driver.getCurrentUrl().contains("Punta Canana"));

    }


}
