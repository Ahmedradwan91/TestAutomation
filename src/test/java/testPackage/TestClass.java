package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.time.Duration.ofMillis;
import static org.testng.AssertJUnit.assertEquals;

public class TestClass {
    WebDriver driver = new ChromeDriver();

    @Test
    public void test (){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get("https://www.google.com/ncr");
        String title =  driver.getTitle();
        assertEquals("Google", title);
        System.out.println("The title is : " +  title);
        driver.navigate().to("https://duckduckgo.com/");
        WebElement logo = driver.findElement(By.linkText("DuckDuckGo"));
        assert logo.isDisplayed();
        driver.navigate().back();
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Selenium WebDriver");
        search.sendKeys(Keys.RETURN);
    }

}
