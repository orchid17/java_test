package ua.stqa.pft.sandbox;

public class FirstProgram {


   public static void main(String[] args){

       Point p1 = new Point (1,2);

       Point p2 = new Point (1,3);

       System.out.println("Координаты точки p1: " + p1.x + " и "+ p1.y);
       System.out.println("Координаты точки p2: " + p2.x + " и "+ p2.y);
       System.out.println("Расстояние между точками:  "+ p1.Distance(p2));

       double l = 5;
       System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

       double a = 5;
       double b = 6;
       System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

   }

    //public static double Distance(Point p1, Point p2){
    //    return Math.sqrt(Math.pow((p2.x - p1.x),2)+Math.pow((p2.y - p1.y),2));
    //}



    public  static double area (double len){
        return len * len;
    }

    public static double area (double a, double b){
        return a* b;

    }
}