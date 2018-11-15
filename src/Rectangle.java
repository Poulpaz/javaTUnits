import java.util.Objects;

public final class Rectangle implements Shape {

    private Point topLeftCorner;
    private int width;
    private int height;

    public Rectangle(Point topLeftCorner, int width, int height) {
        this.topLeftCorner = topLeftCorner;
        this.width = width;
        this.height = height;
    }

    public Point getTopLeftCorner() {
        return topLeftCorner;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width &&
                height == rectangle.height &&
                Objects.equals(topLeftCorner, rectangle.topLeftCorner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeftCorner, width, height);
    }

    @Override
    public boolean contains(Point point) {
        if((topLeftCorner.getX() + width) >= point.getX() && (topLeftCorner.getY() - height) <= point.getY() && point.getX() >= topLeftCorner.getX() && point.getY() <= topLeftCorner.getY()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double area() {
        return width * height;
    }
}
