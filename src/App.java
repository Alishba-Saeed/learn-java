public class App {
    public static void main(String[] args) throws Exception {
        Rectangle r = new Rectangle(1, 2, 3, 4);
        System.out.println("Area: "+r.calculateArea());
        r.move();
        r.draw();
    }
}
