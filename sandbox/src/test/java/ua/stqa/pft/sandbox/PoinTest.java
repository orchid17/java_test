package ua.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Оля on 25.12.2016.
 */
public class PoinTest {

    @Test
    public void testArea1(){
        Point p1 = new Point (1,2);
        Point p2 = new Point (1,3);
        Point p3 = new Point (1,2);
        Point p4 = new Point (1,4);

        Assert.assertEquals(p1.Distance(p2),1.0);
        Assert.assertEquals(p3.Distance(p4),2.0);
    }

}
