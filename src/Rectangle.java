/**
 * Created by wangyaofeng on 4/6/17.
 */
public class Rectangle {
    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public static double getPerimeter(Rectangle r){
        return Math.abs(r.length + r.length) + Math.abs(r.width + r.width);
    }
    public static double getArea(Rectangle r){
        return Math.abs(r.length * r.width);
    }

}
