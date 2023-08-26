public class App {
    public static void main(String[] args) throws Exception {

        /* TYPE CONVERSION AND CASTING */
        byte b = 127;
        int a = 257;
        // a = b; // When the types are automatically converted, it is called as conversion
        b = (byte)a; //When we explicitly ask to convert into a specific data type, it is called as casting
        /*
         * because when we are going through the big data type to a smaller data type like going from int to byte;
         * it takes modulus of the big data type value with the allowed range of small data type. In this case,
         * it will be a%128 = 1 so b will have 1 in it now.
         */
        System.out.println("a: "+a); //257
        System.out.println("b: "+b); //1
        float x = 5.6f;
        int y = (int)x;
        //System.out.println("x: "+x); //5.6
        //System.out.println("y: "+y); //5

    }
}
