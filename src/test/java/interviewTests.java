import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class interviewTests {
    /**
     * Write a Java code snippet to navigate to a specific URL in Selenium - http://www.google.com.
     * Write a Java code snippet to locate an element using XPath or CSS selector in Selenium.
     * Write a Java code snippet to perform a login action on a web page using Selenium.
     * Write a Java code snippet to perform a search and click on 3rd option.
     */

    @Test
    public static void navigateTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
//        WebElement search = driver.findElement(By.cssSelector(".gLFyf"));
        WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
        search.sendKeys("example");
        search.sendKeys(Keys.RETURN);


        List<WebElement> searchElements = driver.findElements(By.xpath("//a"));
//        searchElements.get(2).click();
        Actions actions = new Actions(driver);
//        actions.contextClick(searchElements.get(2)).click().perform();

       actions.click(searchElements.get(2));
//        body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.RNmpXc

        Thread.sleep(3000);
        driver.close();
    }
}
