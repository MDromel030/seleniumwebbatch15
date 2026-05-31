package selenium.class_one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chromebrowser {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        //driver.manage().window().maximize();

        System.out.println("Title:"+driver.getTitle());
        System.out.println("Current url:"+driver.getCurrentUrl());
        //driver.quit();





    }
}
