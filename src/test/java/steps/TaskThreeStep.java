package steps;

import org.junit.jupiter.api.Test;

import java.io.File;

public class TaskThreeStep extends BaseTest{
    @Test
    public void threeTest(){
        File file = new File("src/main/resources/picTest.png");

        main.goTo().chooseTask("Zadanie 3");
        taskThreePage
                .mouseOver("//a[text()[contains(.,'Menu')]]")
                .mouseOver("//a[text()[contains(.,'Formularz')]]")
                .mouseOver("//a[text()[contains(.,'do trybu')]]")
                .inputText("in-name", "Tim")
                .inputText("in-surname", "Andersen")
                .inputText("in-notes", "Bacon ipsum dolor amet pork ground round cow andouille pastrami spare ribs ham hock bacon drumstick pork loin fatback.")
                .inputText("in-phone", "54654634")
                .uploadPicture("//input[@id='in-file']", file.getAbsolutePath())
                .clickButton("save-btn");
    }
}
