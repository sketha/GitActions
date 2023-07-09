package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
    @Test
    public void FirstProgram() throws InterruptedException {
        System.out.println("Program Started!!!");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Program End!!!");
    }

}
