package Class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= scanner.next();

        if(name.equals("John")){
            System.out.println("Mac User");
        }else if(name.equals("Adrian")){
            System.out.println("Ice Prince");
        }else if(name.equals("Teddy")){
            System.out.println("Bear");
        }
    }
}
