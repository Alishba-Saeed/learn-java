public class Rectangle extends Shape implements Drawable, Moveable {
  private double width, height;

  static {
    System.out.println(Drawable.val);
    System.out.println(Moveable.val);
  }
  Rectangle(double x, double y, double width, double height) {
      super(x, y);
      this.height = height;
      this.width = width;
  }

  double calculateArea() {
      return width * height;
  }

  public void draw() {
      System.out.println("Drawing a rectangle.");
  }

  public void move() {
      System.out.println("Moving the rectangle.");
  }
}
