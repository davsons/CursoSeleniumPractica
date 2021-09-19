package EvaluacionNivelM.steps;

import EvaluacionNivelM.pageObject.SpotifyLegalSite;
import EvaluacionNivelM.pageObject.SpotifyRegistrer;
import EvaluacionNivelM.pageObject.SpotifySitePremium;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Spotify {


   public  WebDriver driver;
   public SpotifySitePremium spotifySitePremium;
   public SpotifyRegistrer spotifyRegistrer;
   public SpotifyLegalSite spotifyLegalSite;




    @Given("Estoy en Sitio SpotifyPremium")
    public void estoy_en_sitio_spotify_premium() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Imagemaker\\IdeaProjects\\CursoSelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spotify.com/uy/");
        //SpotifySitePremium spotifySitePremium = new SpotifySitePremium( driver);
        spotifySitePremium = new SpotifySitePremium( driver);
        spotifySitePremium.principalsite();


    }

    @When("Ingreso a options Individual")
    public void ingreso_a_options_individual() throws InterruptedException {


        //SpotifySitePremium spotifySitePremium = new SpotifySitePremium(driver);
        spotifySitePremium.principalsite();
        spotifySitePremium.optionsPlan("Individual", driver);

    }

    @When("Ingreso a options Familiar")
    public void ingreso_a_options_familiar() throws InterruptedException {
        //optionsPlan("Familiar)");
        //SpotifySitePremium spotifySitePremium = new SpotifySitePremium(driver);
        spotifySitePremium.optionsPlan("Familiar", driver);


    }




    @When("Ingreso a options Duo")
    public void ingreso_a_options_duo() throws InterruptedException {
        //SpotifySitePremium spotifySitePremium = new SpotifySitePremium(driver);
        spotifySitePremium.optionsPlan("Duo", driver);
    }

    @When("Estoy en registro")
    public void estoy_en_registro() throws InterruptedException {
        Thread.sleep(2000);
        //SpotifySitePremium spotifySitePremium = new SpotifySitePremium(driver);
        //SpotifySitePremium spotifySitePremium = new SpotifySitePremium(driver);
        spotifySitePremium.principalsite();
        driver.findElement(By.xpath("//*[@href='https://www.spotify.com/uy/signup/']")).click();
        ///SpotifyRegistrer spotifyRegistrer = new SpotifyRegistrer(driver);
        spotifyRegistrer = new SpotifyRegistrer(driver);
        //spotifySitePremium.principalsite();
        spotifySitePremium.registrer();
    }

    @When("Valido Correo vacios")
    public void valido_correo_vacios() throws InterruptedException {
        Thread.sleep(2000);
        //SpotifySitePremium spotifySitePremium = new SpotifySitePremium(driver);
        spotifySitePremium.principalsite();
        ///SpotifyRegistrer spotifyRegistrer = new SpotifyRegistrer(driver);
        spotifyRegistrer = new SpotifyRegistrer(driver);
       spotifySitePremium.registrer();
       spotifyRegistrer.emailVacio();


    }

    @Then("Valido Correo Incorrecto")
    public void valido_correo_incorrecto() throws InterruptedException {
        ///SpotifyRegistrer spotifyRegistrer = new SpotifyRegistrer(driver);
        spotifyRegistrer = new SpotifyRegistrer(driver);
        spotifySitePremium.registrer();
        spotifyRegistrer.emailIncorrecto();





    }

    @Then("Valido Correo Existente")
    public void valido_correo_existente() throws InterruptedException {

        SpotifyRegistrer spotifyRegistrer = new SpotifyRegistrer(driver);
        spotifySitePremium.registrer();
        spotifyRegistrer.emailExistente();


    }

    @Given("Estoy en Sitio SpotifyLegal")
    public void estoy_en_sitio_spotify_legal() {
        ///SpotifyLegalSite spotifyLegalSite = new SpotifyLegalSite(driver);
        spotifyLegalSite = new SpotifyLegalSite(driver);
        spotifyLegalSite.legalSite();

    }

    @When("Ingreso a options Disfrutando Spotify")
    public void ingreso_a_options_disfrutando_spotify() throws InterruptedException {
        ///SpotifyLegalSite spotifyLegalSite = new SpotifyLegalSite(driver);
        spotifyLegalSite = new SpotifyLegalSite(driver);
        spotifyLegalSite.legalSite();
        spotifyLegalSite.optionsLinks("Disfrutando Spotify");
    }

    @When("Ingreso a options Pagos,cancelaciones y periodo de reflexión")
    public void ingreso_a_options_pagos_cancelaciones_y_periodo_de_reflexión() throws InterruptedException {
        ///SpotifyLegalSite spotifyLegalSite = new SpotifyLegalSite(driver);
        spotifyLegalSite = new SpotifyLegalSite(driver);
        spotifyLegalSite.legalSite();
        spotifyLegalSite.optionsLinks("Pagos, cancelaciones y periodo de reflexión");
    }

    @When("Ingreso a options Uso de nuestro servicio")
    public void ingreso_a_options_uso_de_nuestro_servicio() throws InterruptedException {
        ///SpotifyLegalSite spotifyLegalSite = new SpotifyLegalSite(driver);
        spotifyLegalSite = new SpotifyLegalSite(driver);
        spotifyLegalSite.legalSite();
        spotifyLegalSite.optionsLinks("Uso de nuestro servicio");
    }







        }













