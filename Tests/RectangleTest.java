import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    public static final double DELTA = 1e-6;

    @Test
    public void contains() {
        Point point = new Point(0,2);
        Rectangle rectangle = new Rectangle(point, 10, 2);
        assertEquals(rectangle.contains(new Point(10, 2)), true);
    }

    @Test
    public void area() {
        Point point = new Point(0,2);
        Rectangle rectangle = new Rectangle(point, 10, 2);
        double area = rectangle.area();
        assertEquals(20, area, DELTA);
    }
}