public class App {
    public static void main(String[] args) throws Exception {
        StringBuffer buffer = new StringBuffer("");
        System.out.println(buffer.capacity());
        System.out.println(buffer.hashCode());
        buffer.append("Alishba");
        System.out.println(buffer);
        buffer.ensureCapacity(20);
        System.out.println(buffer.capacity());
        System.out.println(buffer.hashCode());
    }
}
