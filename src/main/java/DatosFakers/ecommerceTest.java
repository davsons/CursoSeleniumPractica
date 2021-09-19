package DatosFakers;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ecommerceTest {

    String URL = "http://automationpractice.com/index.php";
    public WebDriver driver;


    @BeforeMethod

    public void setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get(URL);
        PageFactory.initElements(driver,this);
}


    @Test

    public void registrerTest() throws InterruptedException {
        String email = "selenium"+ Math.random()+"@gmail.com";
        Faker faker = new Faker();
        String fakefirstName = faker.name().firstName();
        String fakelasttName = faker.name().firstName();
        String fakecompany = (faker.company().name());
        registrerAnUser(email,fakefirstName,fakelasttName,fakecompany);


    }

    @FindBy(xpath="//*[@href='http://automationpractice.com/index.php?mylogout=']")
    public WebElement logoutBtn;

    @FindBy(xpath = "//*[@href='http://automationpractice.com/index.php?controller=my-account']")
    public WebElement loginBtn;

    @FindBy(id = "email_create")
    public WebElement email_create;

    @FindBy (id = "email")
    public WebElement emailLoginField;

    @FindBy(id="SubmitCreate")
    public WebElement subMitCreatebtn;

    @FindBy(xpath = "//*[@id='create_account_error']/ol/li")
    public WebElement emailRegistreredErrorMsg;

    @FindBy(id = "passwd")
    public WebElement passwordLoginField;

    @FindBy (id = "SubmitLogin")
    public WebElement loginAccountBtn;




    @Test

    public void registrerTestduplicatefailled() throws InterruptedException {
        Thread.sleep(2000);
        String email = "selenium"+ Math.random()+"@gmail.com";
        Faker faker = new Faker();
        String fakefirstName = faker.name().firstName();
        String fakelasttName = faker.name().firstName();
        String fakecompany = (faker.company().name());
        registrerAnUser(email,fakefirstName,fakelasttName,fakecompany);
        WebDriverWait wait = new WebDriverWait(driver,3);


        //driver.findElement(By.xpath("//*[@href='http://automationpractice.com/index.php?mylogout=']")).click();
        logoutBtn.click();
        //driver.findElement(By.xpath("//*[@href='http://automationpractice.com/index.php?controller=my-account']")).click();
        loginBtn.click();
        //driver.findElement(By.id("email_create")).sendKeys(email);
        email_create.sendKeys(email);
        //driver.findElement(By.id("SubmitCreate")).click();
        subMitCreatebtn.click();

        Thread.sleep(3000);


        //WebElement emailRegistreredErrorMsg = driver.findElement(By.xpath("//*[@id='create_account_error']/ol/li"));
        System.out.println(emailRegistreredErrorMsg.getText());


          Assert.assertEquals(emailRegistreredErrorMsg.getText() ,"An account using this email address has already been registered. Please enter a valid password or request a new one.");
    }

    @Test

    public void loginTest() throws InterruptedException {
        Thread.sleep(2000);
        String email = "selenium"+ Math.random()+"@gmail.com";
        Faker faker = new Faker();
        String fakefirstName = faker.name().firstName();
        String fakelasttName = faker.name().firstName();
        String fakecompany = (faker.company().name());
        registrerAnUser(email,fakefirstName,fakelasttName,fakecompany);
        //driver.findElement(By.xpath("//*[@href='http://automationpractice.com/index.php?mylogout=']")).click();

        logoutBtn.click();

        //driver.findElement(By.xpath("//*[@href='http://automationpractice.com/index.php?controller=my-account']")).click();

        loginBtn.click();
        emailLoginField.sendKeys(email);
        //driver.findElement(By.id("email")).sendKeys(email);
        //driver.findElement(By.id("passwd")).sendKeys(Constans.password);
        passwordLoginField.sendKeys(Constans.password);
        //driver.findElement(By.id("SubmitLogin")).click();
        loginAccountBtn.click();

    }

    private void registrerAnUser(String anEmail, String aFirstName, String aLastname,String aCompany ) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,3);

        WebElement sigIng = driver.findElement(By.xpath("//*[@href='http://automationpractice.com/index.php?controller=my-account']"));
        sigIng.click();
        driver.findElement(By.id("email_create")).sendKeys(anEmail);

        WebElement submitCreate = driver.findElement(By.id("SubmitCreate"));
        submitCreate.click();
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("h1"))));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("h1")));

        WebElement emailField = driver.findElement(By.id("email"));
        String populatedEmail = emailField.getAttribute("value");



        //Completar de datos

        Thread.sleep(3000);

        WebElement maleRadiobutton = driver.findElement(By.id("id_gender1"));
        WebElement firstName = driver.findElement(By.id("customer_firstname"));
        WebElement lastName = driver.findElement(By.id("customer_lastname"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement day = driver.findElement(By.id("days"));
        WebElement months = driver.findElement(By.id("months"));
        WebElement years = driver.findElement(By.id("years"));
        WebElement address1 = driver.findElement(By.id("address1"));
        WebElement city = driver.findElement(By.id("city"));
        WebElement id_state = driver.findElement(By.id("id_state"));
        WebElement compañia = driver.findElement(By.id("company"));
        WebElement postcode = driver.findElement(By.id("postcode"));
        WebElement phone_mobile = driver.findElement(By.id("phone_mobile"));
        WebElement submitAccount = driver.findElement(By.id("submitAccount"));




        maleRadiobutton.click();
        firstName.sendKeys(aFirstName);
        lastName.sendKeys(aLastname);
        password.sendKeys(Constans.password);
        day.sendKeys(Constans.BIRTH_DAY);
        months.sendKeys(Constans.BIRTH_MONTH);
        years.sendKeys(Constans.FIRST_YEARS);
        address1.sendKeys(Constans.ADDRESS);
        city.sendKeys(Constans.CITY);
        //Select selectState = new Select(id_state);
        //SelectState.selectByValue("21");
        id_state.sendKeys(Constans.ID_STATE);
        compañia.sendKeys(aCompany);
        postcode.sendKeys(Constans.POST_CODE);
        phone_mobile.sendKeys(Constans.PHONE_MOBILE );

        Assert.assertEquals(driver.findElement(By.id("firstname")).getAttribute("value"),aFirstName);
        Assert.assertEquals(driver.findElement(By.id("lastname")).getAttribute("value"),aLastname);
        submitAccount.click();



    }
}

