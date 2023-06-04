package Class6HW;

import java.util.Scanner;

public class numberValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        int i = 1000;
        if (number <= 10 && number >1){
            System.out.println("number is small");
        }else if (number < 100 && number <= 11){
            System.out.println("number is medium");
        }else if(number >= 101 && number <= 1000){
            System.out.println("number is large");
        }
    }
}
