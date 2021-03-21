import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumWebDriverTest {
    @Test
    public void testDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='nav-item' and normalize-space()='Downloads']")).click();
        String stableVersion = "3.141.59";
        WebElement actualElement = driver.findElement(By.xpath("//a[normalize-space()='3.141.59']"));
        String actualName = actualElement.getText();
        WebElement searchElement = driver.findElement(By.xpath("//input[@name='search']"));
        String searchName = "selenium webdriver";
        searchElement.sendKeys(searchName + Keys.ENTER);
        Thread.sleep(3000);
        WebElement actualLinkName = driver.findElement(By.xpath("//div[@class='gsc-thumbnail-inside']//b[contains(text(),'Selenium WebDriver')]"));
        String linkName = actualLinkName.getText().toLowerCase();
        Assert.assertEquals(linkName, searchName);
        driver.quit();
    }
}
