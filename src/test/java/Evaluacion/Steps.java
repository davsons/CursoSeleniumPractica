package Evaluacion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Steps {

    public WebDriver driver;

    @Given("Estoy en la pagina")
    public void estoy_en_la_pagina() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.airbnb.cl/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@class='_160gnkxa']/button")).click();
    }

    @When("Ingreso Reserva Punta Cana")

    public void ingreso_reserva_punta_cana() {
        driver.findElement(By.id("bigsearch-query-detached-query-input")).sendKeys("Punta Cana, Santo Domingo Este");
        //driver.findElement(By.xpath("//*[@class='_j8gg2a']/div")).click();
        WebElement calendario= driver.findElement(By.xpath("//*[@data-testid='structured-search-input-field-split-dates-0']/div/div"));
        calendario.click();

        WebElement fechaIda = driver.findElement(By.xpath("//*[@data-testid='datepicker-day-2021-09-01']"));
        fechaIda.click();

        WebElement fechaRetorno = driver.findElement(By.xpath("//*[@data-testid='datepicker-day-2021-09-15']"));
        fechaRetorno.click();

        WebElement huespedes = driver.findElement(By.xpath("//*[@data-testid='structured-search-input-field-guests-button']/div/div"));
        huespedes.click();


        WebElement cantidadAdultos = driver.findElement(By.xpath("//*[@data-testid='stepper-adults-increase-button']"));
        cantidadAdultos.click();
        cantidadAdultos.click();

        driver.findElement(By.xpath("//*[@data-testid='structured-search-input-search-button']")).click();
    }

    @Then("Valido Reserva Punta Cana")
    public void valido_reserva_venezuela() {

        Assert.assertTrue(driver.getCurrentUrl().contains("Punta-Cana"));
        System.out.println(" TExto de la URL ----------->" +driver.getCurrentUrl());
    }

    @When("Ingreso Reserva Argentina")
    public void ingreso_reserva_argentina() {
        driver.findElement(By.id("bigsearch-query-detached-query-input")).sendKeys("Argentina");
        //driver.findElement(By.xpath("//*[@class='_j8gg2a']/div")).click();
        WebElement calendario= driver.findElement(By.xpath("//*[@data-testid='structured-search-input-field-split-dates-0']/div/div"));
        calendario.click();

        WebElement fechaIda = driver.findElement(By.xpath("//*[@data-testid='datepicker-day-2021-09-09']"));
        fechaIda.click();

        WebElement fechaRetorno = driver.findElement(By.xpath("//*[@data-testid='datepicker-day-2021-09-25']"));
        fechaRetorno.click();

        WebElement huespedes = driver.findElement(By.xpath("//*[@data-testid='structured-search-input-field-guests-button']/div/div"));
        huespedes.click();


        WebElement cantidadAdultos = driver.findElement(By.xpath("//*[@data-testid='stepper-adults-increase-button']"));
        cantidadAdultos.click();
        cantidadAdultos.click();

        driver.findElement(By.xpath("//*[@data-testid='structured-search-input-search-button']")).click();
    }

    @Then("Valido Reserva Argentina")
    public void valido_reserva_argentina() {

        Assert.assertTrue(driver.getCurrentUrl().contains("Argentina"));
        System.out.println(" TExto de la URL ----------->" +driver.getCurrentUrl());

    }



    @When("Ingreso Reserva Colombia")
    public void ingreso_reserva_colombia() {
        driver.findElement(By.id("bigsearch-query-detached-query-input")).sendKeys("Colombia");
        //driver.findElement(By.xpath("//*[@class='_j8gg2a']/div")).click();
        WebElement calendario= driver.findElement(By.xpath("//*[@data-testid='structured-search-input-field-split-dates-0']/div/div"));
        calendario.click();

        WebElement fechaIda = driver.findElement(By.xpath("//*[@data-testid='datepicker-day-2021-09-18']"));
        fechaIda.click();

        WebElement fechaRetorno = driver.findElement(By.xpath("//*[@data-testid='datepicker-day-2021-09-30']"));
        fechaRetorno.click();

        WebElement huespedes = driver.findElement(By.xpath("//*[@data-testid='structured-search-input-field-guests-button']/div/div"));
        huespedes.click();


        WebElement cantidadAdultos = driver.findElement(By.xpath("//*[@data-testid='stepper-adults-increase-button']"));
        cantidadAdultos.click();
        cantidadAdultos.click();

        driver.findElement(By.xpath("//*[@data-testid='structured-search-input-search-button']")).click();
    }

    @Then("Valido Reserva Colombia")
    public void valido_reserva_colombia() {

        Assert.assertTrue(driver.getCurrentUrl().contains("Colombia"));
        System.out.println(" TExto de la URL ----------->" +driver.getCurrentUrl());

    }


    @When("Ingreso a experiencias")
    public void ingreso_a_experiencias() {
        driver.findElement(By.id("search-block-tab-false-EXPERIENCES")).click();
    }

    @When("Reservo Experiencias")
    public void reservo_experiencias() {
        driver.findElement(By.id("bigsearch-query-detached-query-input")).sendKeys("Tulum");
        WebElement calendar = driver.findElement(By.xpath("//*[@data-testid='structured-search-input-field-dates-button']/div/div"));
        calendar.click();

        WebElement fechaExperiencia = driver.findElement(By.xpath("//*[@data-testid='datepicker-day-2021-08-14']"));
        fechaExperiencia.click();

        driver.findElement(By.xpath("//*[@data-testid='structured-search-input-search-button']")).click();

    }

    @Then("Valido Reserva")
    public void valido_reserva() {
        Assert.assertTrue(driver.getCurrentUrl().contains("Tulum"));
        System.out.println(" TExto de la URL ----------->" +driver.getCurrentUrl());
    }

    @Then("Valido Lugares Cercanos")
    public void valido_lugares_cercanos() {
        List<WebElement> listaLugaresCercanos = driver.findElements(By.className("_wy1hs1"));
        Assert.assertNotEquals(listaLugaresCercanos.size(),0,"Deberia tener 8 Elementos");

        boolean lugaresCercanos = false;

        for(WebElement lcercanos : listaLugaresCercanos){
            System.out.println("Los Lugares son" + lcercanos.getText());

            }
        }
    }





