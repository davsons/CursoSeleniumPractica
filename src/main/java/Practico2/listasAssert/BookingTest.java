package Practico2.listasAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Timer;

public class BookingTest {
    String URL = "https://www.booking.com";
    public WebDriver driver;

    @BeforeMethod

    public void setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Imagemaker\\IdeaProjects\\CursoSelenium\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get(URL);

    }

    @Test

    public void primerTest(){

        System.out.println("Titulo --->" + driver.getTitle());

    }

    @Test

    public void bookingTest(){

        List<WebElement> h2s = driver.findElements(By.tagName("h2"));
        System.out.println(h2s.size());
        boolean genteviajeraexiste =false;
        for (WebElement h2:h2s){
            System.out.println(h2.getText());
            if (h2.getText().equals("Conecta con gente viajera")){

                genteviajeraexiste =true;
            }

        }

        Assert.assertTrue(genteviajeraexiste,"No existe la etiqueta solicitada");

    }

    @Test

    public void iniciaSesion()  {

     WebElement btnsesion = driver.findElement(By.className("bui-button__text"));


     btnsesion.click();

    }




    @AfterMethod
    public void tearDown(){
        System.out.println("Se ha terminado de ejecutar un test");
    }



}
