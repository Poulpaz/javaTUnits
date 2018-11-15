
import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {


    public static final double DELTA = 1e-6;

    @Test
    public void contains() {
        Point point = new Point(1, 1);
        Circle circle = new Circle(2, point);
        assertEquals(circle.contains(new Point(2,1)), true);
    }

    @Test
    public void area() {
        Point point = new Point(0,0);
        Circle circle = new Circle(1, point);
        double area = circle.area();
        assertEquals(Math.PI, area, DELTA);
    }
}