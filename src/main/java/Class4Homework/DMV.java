package Class4Homework;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Age");
        int age =scanner.nextInt();

        if (age>=18){
            System.out.println("License approved");
        }else {
            System.out.println("Get your learners permit");
        }
    }
}
