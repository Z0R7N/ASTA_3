package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskThreePage extends BasePage{
    public TaskThreePage(WebDriver driver) {
        super(driver);
    }

    public TaskThreePage mouseOver(String marker){
        cursorOver(By.xpath(marker));
        return this;
    }
    public TaskThreePage inputText(String marker, String text){
        input(By.id(marker), text);
        return this;
    }

    public TaskThreePage uploadPicture(String marker, String filePath){
        upload(By.xpath(marker), filePath);
        return this;
    }

    public TaskThreePage clickButton(String marker){
        click(By.id(marker));
        return this;
    }
}
