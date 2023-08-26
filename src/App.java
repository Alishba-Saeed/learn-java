public class App {
    /*
     * The methods like main and add will have their own stacks
     * main method stack will have variables: a, b, obj, obj1
     *
     * main
     * ----------------
     *| Variable | Value |
     * ----------------
     * |    a     |   2   |
     * |    b     |   3   |
     * |   obj    | Ref variable to heap  |
     * |   obj1   |   Ref variable to heap  |
     * ----------------
     * We will have a similar stacks for both add methods of calculator class
     * Heap will contain two parts, one for Calculator class variable and one for method
     */
    public static void main(String[] args) throws Exception {
        int a = 2;
        int b = 3;
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        System.out.println(obj.add(a, b));
        System.out.println(obj1.add(3, 2));
    }
}
