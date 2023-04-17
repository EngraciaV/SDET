package Class5;

import java.util.Scanner;

public class E4NestedIf {

    public static void main(String[] args) {

        int money = 20000;
        String day = "Wednesday";
        if (money > 10000) {
            if (day.equals("Sunday")) {
                System.out.println("Lets go shopping");
            } else {
                System.out.println("Lets go on Sunday");
            }
        } else {
            System.out.println("Lets save more");
        }
    }
}
