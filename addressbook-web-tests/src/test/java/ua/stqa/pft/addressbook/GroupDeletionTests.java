package ua.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testsGroupDeletion() {
        gotoGroupPage();
        selectGroup();
        deleteGroup();
        returnToGroupPage();
    }


}
