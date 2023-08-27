public class App {
    public static void main(String[] args) throws Exception {
        String org = "Alishba";
        String copy = "Alishba";
        System.out.println("Org and copy are same: "+ (org == copy)); //true
        String newOrg = new String("Alishba");
        System.out.println("newOrg is different: "+ (newOrg == org)); //false
    }
}
