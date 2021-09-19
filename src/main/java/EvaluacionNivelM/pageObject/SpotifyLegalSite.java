package EvaluacionNivelM.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class SpotifyLegalSite {

    public WebDriver driver;

    public SpotifyLegalSite(WebDriver remoteDriver) {
        driver = remoteDriver;
    }

    public void legalSite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Imagemaker\\IdeaProjects\\CursoSelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spotify.com/uy/legal/end-user-agreement/");

    }

    public boolean optionsLinks(String links) throws InterruptedException {
        Thread.sleep(3000);

        System.out.println("Titulo --->" + driver.getTitle());
        List<WebElement> p3s = driver.findElements(By.tagName("p"));
        System.out.println(p3s.size());
        boolean optionsFoud = false;
        for (WebElement p : p3s) {
            System.out.println(p.getText());
            if (p.getText().equals(links)) {

                optionsFoud = true;
                Assert.assertTrue(p.getText().contains(links), "No se encontro la opcion" + links);
            }


        }

        return optionsFoud;
    }
}
