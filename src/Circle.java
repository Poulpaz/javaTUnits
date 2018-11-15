import java.util.Objects;

public final class Circle implements Shape {

    private int radius;
    private Point point;

    public Circle(int radius, Point point) {
        this.radius = radius;
        this.point = point;
    }

    public int getRadius() {
        return radius;
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius &&
                Objects.equals(point, circle.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, point);
    }

    @Override
    public boolean contains(Point point) {
        if (Math.pow((point.getX() - this.point.getX()), 2) + Math.pow((point.getY() - this.point.getY()), 2) < Math.pow(radius, 2)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double area() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
