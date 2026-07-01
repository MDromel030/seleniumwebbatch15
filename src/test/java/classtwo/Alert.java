package classtwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint" +
                ".com/selenium/practice/alerts.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("button[onclick" +
                "='showAlert()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button[onclick='myDesk()']")).click();
        String str = driver.switchTo().alert().getText();
        System.out.println(str);
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(2000);



       driver.findElement(By.cssSelector("button[onclick='myPromp()" +
               "']")).click();
       Thread.sleep(2000);

       driver.switchTo().alert().sendKeys("Selenium Webdriver");
       Thread.sleep(2000);
       driver.switchTo().alert().accept();
        System.out.println("Selenium Webdriver has been accepted");
        Thread.sleep(2000);









    }
}
