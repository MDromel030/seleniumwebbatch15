package classtwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selecttest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

        driver.findElement(By.id("name")).sendKeys("Romel");
        driver.findElement(By.id("email")).sendKeys("romel@gmail" +
                ".com");
        driver
                .findElement(By.id("gender")).click();
        driver.findElement(By.id("mobile")).sendKeys("015234789");

        driver.findElement(By.id("dob")).sendKeys("14-04-1999");

        driver.findElement(By.id("subjects")).sendKeys("Sqa");

        driver.findElement(By.id("hobbies")).click();
        Thread.sleep(2000);


        WebElement element = driver.findElement(By.id("picture"));
        element.sendKeys("C:\\Users\\SMART NETWORK\\Downloads\\rml.jpg");



        Select slt = new Select(driver.findElement(By.cssSelector(
                "#state")));

       slt.selectByIndex(1);
       Thread.sleep(2000);
       slt.selectByValue("Rajasthan");
       Thread.sleep(2000);
       slt.selectByVisibleText("Uttar pradesh");
       slt.getOptions().forEach(WebElement::getText);


driver.findElement(By.cssSelector("input[value='Login']")).click();
       driver.quit();


    }
}
