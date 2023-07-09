package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample {
    @Test
    public void FirstProgram() throws InterruptedException {
        System.out.println("Program Started!!!");
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary(firefoxBinary);
        options.setHeadless(true);  // <-- headless set here
        WebDriver driver = new FirefoxDriver(options);
       // WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Program End!!!");
    }

}
