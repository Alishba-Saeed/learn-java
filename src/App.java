public class App {
    public static void main(String[] args) throws Exception {
        /* Older switch statement before java 12 */
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("Hello world!");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
