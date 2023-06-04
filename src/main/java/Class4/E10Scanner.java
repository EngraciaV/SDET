package Class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("PLease Enter your gender");
        char gender= scanner.next().charAt(5);
        System.out.println("you entered "+gender);

    }
}
