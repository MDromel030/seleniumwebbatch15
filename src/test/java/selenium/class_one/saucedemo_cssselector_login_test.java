package selenium.class_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo_cssselector_login_test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#login-button")).click();
        Thread.sleep(2000);
        String str = driver.findElement(By.cssSelector("a[id" +
                "='item_4_title_link" +
                "'] div[class='inventory_item_name ']")).getText();

        System.out.println("Product Name: " + str);

     String string = driver.findElement(By.cssSelector("a[id" +
             "='item_4_title_link'] " +
             "div[class='inventory_item_name ']")).getAttribute(
                     "class");
        System.out.println("Product Attribute Title: " + string);
    }
}
