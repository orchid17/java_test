package ua.stqa.pft.addressbook;

import org.testng.annotations.Test;


public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("Test group", "Test group", "Test Group"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
