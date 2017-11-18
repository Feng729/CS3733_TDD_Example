/**
 * Created by wangyaofeng on 4/6/17.
 */
public class Circle {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    static double getPerimeter(Circle c){
        return 2*Math.abs(c.radius)*Math.PI;
    }

    static double getArea(Circle c){
        return Math.abs(c.radius * c.radius * Math.PI);
    }
}
