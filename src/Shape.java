abstract public class Shape {
  double length, width;

  Shape(double length, double width) {
    this.length = length;
    this.width = width;
  }

  abstract double calculateArea();

  void displayCoordinates() {
    System.out.println("Coordinates: (" + length + ", " + width + ")");
  }
}
