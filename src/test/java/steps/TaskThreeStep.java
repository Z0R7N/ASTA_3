package steps;

import org.junit.jupiter.api.Test;

public class TaskThreeStep extends BaseTest{
    @Test
    public void threeTest(){
        main.goTo().chooseTask("Zadanie 3");
        taskThreePage
                .mouseOver("//a[text()[contains(.,'Menu')]]")
                .mouseOver("//a[text()[contains(.,'Formularz')]]")
                .mouseOver("//a[text()[contains(.,'do trybu')]]")
                .inputText("in-name", "Tim")
                .inputText("in-surname", "Andersen")
                .inputText("in-notes", "sdlkf fsdgkll tw;gwwp4 rfw5 jkwjkgsd lfsdjgwq45qjg kj")
                .inputText("in-phone", "54654634")
                .uploadPicture("//input[@id='in-file']", "D:\\CodeProjects\\ASTA_3\\src\\assert\\picTest.png")
                .clickButton("save-btn");
    }
}
