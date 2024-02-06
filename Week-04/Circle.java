public class Circle {
    // 3 instance attributes
    private double radius;
    private double originX = 0.0;
    private double originY = 0.0;

    //getter and setter methods
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    public double getOriginX() { return originX; }
    public void setOriginX(double originX) { this.originX = originX; }
    public double getoriginY() {return originY; }
    public void setOriginY(double originY) { this.originY = originY; }

    // Return a string representation of this circle
    public String toString() {
        return "Circle: radius=" + radius + ", originX=" + originX + ", originY=" + originY;
    }

    // 3 overloaded constructors
    public Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, double originX, double originY) {
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;
    }

    //method: get the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //method: get the circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    //method: move the circle
    public void move(double dx, double dy) {
        originX += dx;
        originY += dy;
    }

    //method: zoom the circle by a single factor
    public void zoom(double factor) {
        radius *= factor;
    }

    //method: test if two circles are overlapping
    public boolean isOverlappedWith(Circle c) {
        // use the distance formula to calculate the distance between the two circles' centers
        return Math.sqrt(Math.pow(originX - c.originX, 2) + Math.pow(originY - c.originY, 2)) < radius + c.radius;
    }
}
