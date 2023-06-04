package Class6HW;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your current time");
        int time = scanner.nextInt();
        int i = 2400;
        if (time <= 1100 && time >= 0001){
            System.out.println("Morning");
        }else if ( time <= 1500 && time >= 1200){
            System.out.println("Afternoon");
        }else if (time <= 2000 && time >= 1600){
            System.out.println("Evening");
        }else if ( time <= 2400 && time >= 2100){
            System.out.println("Night");
        }
    }
}
