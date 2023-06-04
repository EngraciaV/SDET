package Class4;


import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {

    Scanner scan= new Scanner(System.in);
    /*
    Scanner is a class(which know how to take input from the keyboard)
    scan is a variable of type scanner just like we create a variable of type String
    new => is a special keyword which created the object
     */

        System.out.println("Please enter your name");
        String name= scan.next();
        System.out.println("You are amazing "+name);
    }
}
