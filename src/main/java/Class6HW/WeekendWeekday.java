package Class6HW;

import java.util.Scanner;

public class WeekendWeekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter day");
        int day = scanner.nextInt();
        int i = 7;
        if (day <6 && day > 0){
            System.out.println("It is a weekday");
        }else if (day <= 7 && day > 5){
            System.out.println("It is a weekend");
        }else{
            System.out.println("Invalid day");
        }
    }
}
