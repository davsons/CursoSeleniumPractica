package Practica2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AirbnPractica {


    String URL = "https://www.airbnb.cl/";
    public WebDriver driver;
    //public AirbnTestSitio airbnTestSitio;

    @BeforeMethod

    public void setup(){

        AirbnTestSitio airbnTestSitio = new AirbnTestSitio(driver);
        airbnTestSitio.sitioAirbn();

        /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Imagemaker\\IdeaProjects\\CursoSelenium\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get(URL);*/
    }

    @Test

    public void resevaVuelos() throws InterruptedException {
        AirbnTestSitio airbnTestSitio = new AirbnTestSitio(driver);
        airbnTestSitio.sitioAirbn();
        airbnTestSitio.reservas("Punta Cana");

       /* Thread.sleep(2000);
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

       Assert.assertTrue(driver.getCurrentUrl().contains("Punta Canana"));*/

    }

    @Test

    public void vuelosReservas(String pais) throws InterruptedException {
        Thread.sleep(2000);
        /*driver.findElement(By.xpath("//*[@class='_160gnkxa']/button")).click();

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

        //Assert.assertTrue(driver.getCurrentUrl().contains("Punta Canana"));*/

    }

    @Test

    public void experiencias() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='_160gnkxa']/button")).click();



        driver.findElement(By.xpath("//*[@id='search-block-tab-false-EXPERIENCES']")).click();

        driver.findElement(By.id("bigsearch-query-detached-query-input")).sendKeys("Mexico");
        WebElement calendario2 = driver.findElement(By.xpath("//*[@data-testid='structured-search-input-field-dates-button']"));
        calendario2.click();
        WebElement fechaida = driver.findElement(By.xpath("//*[@data-testid='datepicker-day-2021-09-20']"));
        fechaida.click();
        driver.findElement(By.xpath("//*[@data-testid='structured-search-input-search-button']")).click();
    }

    @Test

    public void destinosCercanos() throws InterruptedException {
        Thread.sleep(3000);

        System.out.println("Titulo --->" + driver.getTitle());
        //driver.findElement(By.xpath("//*[@href='https://www.spotify.com/cl/premium/']")).click();
        List<WebElement> as = driver.findElements(By.tagName("a"));
        System.out.println(as.size());
        //boolean optionsFoud = false;
        for (WebElement a : as) {
            System.out.println(a.getText());

            }



        }




    }



