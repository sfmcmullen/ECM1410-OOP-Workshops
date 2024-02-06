// A Rectangle class
public class Rectangle {

  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

  //getter and setter methods
  public double getWidth() { return width; }
  public void setWidth(double width) { this.width = width; }
  public double getHeight() { return height; }
  public void setHeight(double height) { this.height = height; }
  public double getOriginX() { return originX; }
  public void setOriginX(double originX) { this.originX = originX; }
  public double getoriginY() {return originY; }
  public void setOriginY(double originY) { this.originY = originY; }

  // Return a string representation of this rectangle
  public String toString() {
    return "Rectangle: width=" + width + ", height=" + height + ", originX=" + originX + ", originY=" + originY;
  }

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // method: move the rectangle
  public void move(double dx, double dy) {
	  originX += dx;
	  originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }

  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  //method: zoom the rectangle by single factor
  public void zoom(double factor) {
    width *= factor;
    height *= factor;
  }

  //method: zoom the rectangle by two factors
  public void zoom(double factorX, double factorY) {
    width *= factorX;
    height *= factorY;
  }

  // method: test if two rectangles are overlapping
  public boolean isOverlappedWith(Rectangle r) {
    return (originX < r.originX + r.width) && (originX + width > r.originX) && (originY < r.originY + r.height) && (originY + height > r.originY);
  }

  //method: calculates the ratio between width and height
  public double getRatio() {
    return (height != 0) ? width / height : 0;
  }

  //method: is the rectangle a square?
  public boolean isSquare() {
    if (Math.abs(1.0 - getRatio()) < 1e-10)
      {
        return true;
      }
    return false;
  }

  // 3 overloaded constructors
  public Rectangle() { width = 1.0; height = 1.0; }

  public Rectangle(double width, double height) {
	  this.width = width;
	  this.height = height;
  }

  public Rectangle(double w, double h, double originX, double originY) {
	  this.originX = originX;
    this.originY = originY;
	  width = w;
	  height = h;
  }
}
