package ua.stqa.pft.sandbox;

import org.testng.annotations.Test;

/**
 * Created by Оля on 24.12.2016.
 */
public class SquareTests {

    @Test
    public void testArea(){
        Square s = new Square(5);
        assert s.area() == 25;
    }
}
