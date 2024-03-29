package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.Main;
import pages.TaskThreePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public Main main;
    public TaskThreePage taskThreePage;

    @BeforeEach
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        taskThreePage = PageFactory.initElements(driver, TaskThreePage.class);
    }

    @AfterEach
    public void finish() {
        driver.quit();
    }
}
