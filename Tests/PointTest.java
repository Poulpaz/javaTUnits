import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    public static final double DELTA = 1e-6;

    @Test
    public void move() {
        Point point = new Point(1, 1);
        Point pointSec = point.move(2, 2);
        assertEquals(pointSec, new Point(3,3));
    }

    @Test
    public void distance() {
        Point point = new Point(1, 1);
        Point pointSec = new Point(0, 1);
        double distance = point.distance(pointSec);
        assertEquals(1.0, distance, DELTA);
    }

    @Test
    public void equals() {

    }
}