package Class5;

import java.util.Scanner;

public class E2If {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Is time for break true/false");
        /*
        boolean isBreak=>we are creating a variable of type boolean
        and calling is isBreak
        input=> is also a variable of type scanner
        bextBoolean()=> this is a method that helps us take boolean type data
        from the keyboard
        = => equal to sign will store that value inside the isBreak variable
         */
        boolean isBreak = scanner.nextBoolean();
        /*
        if(isBreak)
         */
        if(isBreak){ // true/false
            System.out.println("Let's have a break");
        }else{
            System.out.println("Lets continue the class");
        }
    }
}
