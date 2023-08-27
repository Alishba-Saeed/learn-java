public class App {
    public static void main(String[] args) throws Exception {
        int nums[][] = new int[3][4];
        for(int n[]:nums) {
            for(int m:n) {
                m =(int)(Math.random()*100);
                System.out.print(m+ " ");
            }
            System.out.println();
        }
    }
}
