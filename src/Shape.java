public class Shape {
  private double length;
  private double width;

  {
    double radius = 1.0;
    System.out.println("In initialize block");
  }

  static {
    double radius = 3.14;
    System.out.println("In static block");
  }

  Shape(double length, double width) {
    this.length = length;
    this.width = width;
    System.out.println("In constructor");
  }

  public double area() {

    return length * width;
  }
}
