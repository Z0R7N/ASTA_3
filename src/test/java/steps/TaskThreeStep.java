package steps;

import org.junit.jupiter.api.Test;

public class TaskThreeStep extends BaseTest{
    @Test
    public void threeTest(){
        main.goTo().chooseTask("Zadanie 3");
    }
}
