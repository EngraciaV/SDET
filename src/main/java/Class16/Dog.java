package Class16;

public class Dog {
    String name;
    String color;
    String bread;

    static int age;
    void bark() {
        System.out.println(name + " is barking");
    }

    void printInfo() {
        if (bread.equals("Greman")) {
            System.out.println(name + " " + color + " i can work in NYPD");
        } else {
            System.out.println(name + " can be used as Pet");
        }
    }
    static void printInfo2() {
        if (age < 10) {
            System.out.println("Young dog");
        }else {
            System.out.println("Old dog");
        }
    }
}