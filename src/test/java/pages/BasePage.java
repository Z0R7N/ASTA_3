package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    // Wait wrapper method
    public void waitVisibiluty(By element) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }

    // Click method
    public void click(By element) {
        waitVisibiluty(element);
        driver.findElement(element).click();
    }

    // Mouse over the element
    public void cursorOver(By element){
        waitVisibiluty(element);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(element);
        action.moveToElement(we).click().build().perform();
    }

    // Input text in field
    public void input(By element, String text){
        waitVisibiluty(element);
        WebElement we = driver.findElement(element);
        we.clear();
        we.sendKeys(text);
    }

    // Upload file
    public void upload(By element, String filePath){
        driver.findElement(element).sendKeys(filePath);
    }
}
