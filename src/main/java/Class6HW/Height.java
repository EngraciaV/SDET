package Class6HW;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int height = scanner.nextInt();
        int i = 72;
        if (height < 60){
            System.out.println("short");
        }else if (height<= 60 && height >72){
            System.out.println("medium");
        }else {
            System.out.println("tall");
        }
    }
}
