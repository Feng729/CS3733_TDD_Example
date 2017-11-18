import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by wangyaofeng on 4/6/17.
 */
public class Tests {
    Rectangle rect = new Rectangle(3, 5);
    Rectangle empty = new Rectangle(0,0);
    Rectangle virtual = new Rectangle(-4,-9);
    Rectangle semivirtual = new Rectangle(4,-9);
    Rectangle virtualsemi = new Rectangle(-4,9);

    Circle ball = new Circle(12);
    Circle emptyCircle = new Circle(0);
    Circle virtualCircle = new Circle(-8);

    @Test
    public void testJunit() {
        assertTrue(1 == 1);
        System.out.println("Passed junit");
    }

    @Test
    public void testPerimiter(){
        assertEquals(Rectangle.getPerimeter(rect),16.);
        assertEquals(Rectangle.getPerimeter(empty),0.);
        assertEquals(Rectangle.getPerimeter(virtual),26.);
        assertEquals(Rectangle.getPerimeter(semivirtual),26.);
        assertEquals(Rectangle.getPerimeter(virtualsemi),26.);
    }

    @Test
    public void testArea(){
        assertEquals(Rectangle.getArea(rect),15.);
        assertEquals(Rectangle.getArea(empty),0.);
        assertEquals(Rectangle.getArea(virtual),36.);
    }

    @Test
    public void testPerimeter(){
        assertEquals(Circle.getPerimeter(ball), 24*Math.PI);
        assertEquals(Circle.getPerimeter(emptyCircle), 0.);
        assertEquals(Circle.getPerimeter(virtualCircle), 16*Math.PI);
    }

    @Test
    public void testAreaC(){
        assertEquals(Circle.getArea(ball), 144*Math.PI);
        assertEquals(Circle.getArea(emptyCircle), 0.);
        assertEquals(Circle.getArea(virtualCircle), 64*Math.PI);
    }

    @Test
    public void testBuzz(){
        FizzBuzz three = new FizzBuzz(3);
        FizzBuzz four = new FizzBuzz(4);
        FizzBuzz five = new FizzBuzz(5);
        FizzBuzz fifteen = new FizzBuzz(15);

        assertEquals(three.answer(), "fizz");
        assertEquals(five.answer(), "buzz");
        assertEquals(fifteen.answer(), "fizzbuzz");
        assertEquals(four.answer(), "4");


    }

}