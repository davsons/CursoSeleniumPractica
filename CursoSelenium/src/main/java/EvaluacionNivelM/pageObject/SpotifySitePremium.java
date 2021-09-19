package EvaluacionNivelM.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class SpotifySitePremium {

    public WebDriver driver;

    public SpotifySitePremium(WebDriver remoteDriver){
        driver = remoteDriver;
    }

    public void principalsite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Imagemaker\\IdeaProjects\\CursoSelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spotify.com/uy/premium/");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@id='onetrust-close-btn-container']/button")).click();

    }

    public boolean optionsPlan(String options,WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);

        System.out.println("Titulo --->" + driver.getTitle());
        //driver.findElement(By.xpath("//*[@href='https://www.spotify.com/cl/premium/']")).click();
        List<WebElement> h3s = driver.findElements(By.tagName("h3"));
        System.out.println(h3s.size());
        boolean optionsFoud = false;
        for (WebElement h3 : h3s) {
            System.out.println(h3.getText());
            if (h3.getText().equals(options)) {

                optionsFoud = true;
                Assert.assertTrue(h3.getText().contains(options),"No se encontro la opcion" + options);
                System.out.println("se imprime la opcion " + options);
            }

        }
        return optionsFoud;
    }

    public SpotifyRegistrer registrer() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@href='https://www.spotify.com/uy/premium/']")).click();
        SpotifyRegistrer spotifyRegistrer = new SpotifyRegistrer(driver);
        return spotifyRegistrer;
    }
}
