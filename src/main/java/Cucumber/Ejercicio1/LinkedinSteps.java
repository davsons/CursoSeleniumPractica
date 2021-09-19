package Cucumber.Ejercicio1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedinSteps {

    @Given("Estoy en la pagina de login")
    public void estoy_en_la_pagina_de_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Estoy en la pagina principal");

    }

    @When("ingreso mi usuario y contraseña")
    public void ingreso_mi_usuario_y_contraseña() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Ingreso credenciales");
    }

    @Then("entro a mi cuenta")
    public void entro_a_mi_cuenta() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Me logeo satisfactoriamente");
    }

    @When("ingreso mi email incorrecto")
    public void ingreso_mi_email_incorrecto() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Ingreso direccion  incorrecta");
    }

    @When("Ingreso mi contraseña correcta")
    public void ingreso_mi_contraseña_correcta() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Ingreso contraseña correcta");
    }

    @Then("error de login")
    public void error_de_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Mensaje de error");
    }

}
