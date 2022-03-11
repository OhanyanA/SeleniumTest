import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("edit-search-block-form--2")).sendKeys("selenium");
        driver.findElement(new By.ByCssSelector("div.input-group button")).click();
        String at = driver.getTitle();
        String et = "Selenium Easy";
        Assert.assertTrue(at.contains(et), "Check title");
        driver.close();

        if (at.equalsIgnoreCase(et))
        {
            System.out.println("Test succesfuly");
        }
        else
        {
            System.out.println("Test failure");
        }
    }
}
