package Cucumber.OrangeFeature;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class OrangeSteps {
    public WebDriver driver;

    @Given("on the orange page")

    public void on_the_orange_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

    }

    @When("Logged in")
    public void logged() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }

    @When("I enter landing page")
    public void i_enter_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"OrangeHRM","No se encontro el titulo");
        Assert.assertTrue(driver.getCurrentUrl().contains("/dashboard"),"No se encontro la url");


    }

    @Then("See Assign Leave of quick actions")
    public void see_assign_Leave_of_quick_actions() {
        searchQuickAction("Assign Leave");



        }


    @Then("See Leave List of quick actions")
    public void see_leave_list_of_quick_actions() {
        searchQuickAction("Leave List");


        }


    @Then("See My Leave of quick actions")
    public void see_My_Leave_of_quick_actions() {
        searchQuickAction("My Leave");

    }

    private void searchQuickAction(String quickActionNAme){
        boolean quickActionFound = false;

        List<WebElement> listQuickActions = driver.findElements(By.className("quickLaunge"));
        for (WebElement quickActions: listQuickActions){
            if (quickActions.getText().equals(quickActionNAme)){

                quickActionFound=true;
                System.out.println("---->" + quickActions.getText() );
            }


        }

    }
    @When("Prueba")
    public void prueba() {
        System.out.println("Prueba del error");
    }

}