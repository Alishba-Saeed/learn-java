public class App {
    public static void main(String[] args) throws Exception {
        int nums[] = {3, 4, 5, 6}; //This syntax is called an array initializer

        int num[] = new int[4]; // In this num array will be automatically initilized with 0
        for (int i=0; i< num.length;i++) {
            num[i] = i * (num.length + 2);
        }
        for (int i=0; i< num.length;i++) {
            System.out.println(nums[i] +" "+ num[i]);
        }
    }
}
