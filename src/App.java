public class App {
    public static void main(String[] args) throws Exception {
        GenericClass<Integer> intClass = new GenericClass<Integer>(5);
        System.out.println(intClass.data());
        intClass.show();

        GenericClass<String> strClass = new GenericClass<String>("hello");
        System.out.println(strClass.data());
        strClass.show();
    }
}
