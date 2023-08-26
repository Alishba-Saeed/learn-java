public class App {
    public static void main(String[] args) throws Exception {
         /* New switch statement
          * It allow us the expression version -> , when we use this we don't have to explicitly add break
          * We can use new switch statement to assign values as well which was not possible with the older version
          * we can return value as well with the new switch statement
         */

        String day = "Monday";
        /* It allow us the expression version -> , when we use this we don't have to explicitly add break
        this will return It's the weekday
        */
        switch (day) {
            case "Saturday, Sunday" -> System.out.println("It's the weekend");
            default -> System.out.println("It's the weekday");
        }

        // We can use new switch statement to assign values as well which was not possible with the older version
        int result;
        switch (day) {
            case "Saturday, Sunday" -> result = 0;
            default -> result = 1;
        }
        System.out.println(result);

        // we can return value as well with the new switch statement

        result = switch (day) {
            case "Saturday, Sunday" -> 0;
            default -> 1;
        };
        System.out.println(result);
    }
}
