package Class4Homework;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("What is the amount of loan");
        int money = scanner.nextInt();

        if (money<=200000){
            System.out.println("Loan approved");
        }else{
            System.out.println("Loan denied");
        }
    }
}