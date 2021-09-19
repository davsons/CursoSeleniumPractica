package EvaluacionNivelM.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SpotifyRegistrer {

    public WebDriver driver;

    public SpotifyRegistrer(WebDriver remoteDriver){
        driver = remoteDriver;
    }

    public void emailVacio() throws InterruptedException {
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@class='Button-sc-8cs45s-0 jgLyVk']/div")).click();
        WebElement mensaje = driver.findElement(By.xpath("//*[contains(text(),'Es necesario que introduzcas tu correo electrónico.')]"));
        System.out.println("Valido email vacio --->" + mensaje.getText());
        Assert.assertEquals(mensaje.getText(), "Es necesario que introduzcas tu correo electrónico.", "se esperaba el msj Es necesario que introduzcas tu correo electrónico.");
        System.out.println("Paso por email vacio ----------->");


    }

    public void emailIncorrecto() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("hhhhhhh");
        driver.findElement(By.xpath("//*[@class='Button-sc-8cs45s-0 jgLyVk']/div")).click();
        WebElement mensaje = driver.findElement(By.xpath("//*[contains(text(),'Este correo electrónico no es válido. Asegúrate de que tenga un formato como este: ejemplo@email.com')]"));
        System.out.println("Valido email incorrecto --->" + mensaje.getText());
        Assert.assertEquals(mensaje.getText(), "Este correo electrónico no es válido. Asegúrate de que tenga un formato como este: ejemplo@email.com", "se esperaba el msj Es necesario que introduzcas tu correo electrónico.");
        System.out.println("Paso por correo invalido ----------->");
    }

    public void emailExistente() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//*[@class='Button-sc-8cs45s-0 jgLyVk']/div")).click();
        WebElement mensaje = driver.findElement(By.xpath("//*[contains(text(),'Este correo electrónico ya está conectado a una cuenta. ')]"));
        System.out.println("Valido email existente --->" + mensaje.getText());
        System.out.println("Paso por correo existente ----------->");

    }




    }

