package Homework;

public class Variables {

    public static void main(String[] args) {
        String firstName="Snow";
        String lastName="White";
        String grade="B";
        String city="Brooklyn";
        String state="NY";
        String phoneNumber="456-737-7734";

        System.out.println("My name is "+firstName+ " and my last name is "+lastName);
        System.out.println("I am "+grade+ " student");
        System.out.println("I live in "+city+", "+state);
        System.out.println("and my phone number is "+phoneNumber+".");

        city="Orlando";
        state="FL";
        phoneNumber="384-838-8346";
        grade="A";
        System.out.println("");
        System.out.println("My name is "+firstName+" and I moved to "+city+", "+state+"."+" My phone number is "+phoneNumber+".");
    }
}
