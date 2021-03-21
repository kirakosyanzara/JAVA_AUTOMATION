

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebpageTest {
    @Test
    public void testGoogleHomePage() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.name("q"));
        String expectedName = "epam systems";
        element.sendKeys(expectedName + Keys.ENTER);
        Thread.sleep(3000);
        WebElement companyNameElem = driver.findElement(By.cssSelector("h2[data-attrid='title'] > span"));
        String actualName = companyNameElem.getText().toLowerCase();
        Assert.assertEquals(actualName, expectedName);
        driver.quit();
    }
}






