package ua.stqa.pft.sandbox;

/**
 * Created by Оля on 19.12.2016.
 */
public class Point {

    public double x;
    public double y;

    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double Distance(Point p2){
        return Math.sqrt(Math.pow((p2.x - this.x),2)+Math.pow((p2.y - this.y),2));
    }
}
