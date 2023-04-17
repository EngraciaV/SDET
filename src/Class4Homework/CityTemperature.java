package Class4Homework;

import java.util.Scanner;

public class CityTemperature {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city");
        String city =scanner.nextLine();
        System.out.println("Enter Fahrenheit");
        double fahrenheit =scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 0.5555555555555556;
        int finalCelsius = (int)celsius;

        System.out.println("The temperature is " + finalCelsius + " the city is " + city);




    }
}
