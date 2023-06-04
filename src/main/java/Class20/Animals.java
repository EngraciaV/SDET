package Class20;

public class Animals {
    public class Animal {
        //we have to create 3 animal classes Dog,Cat,horse, create 5 methods in each class
        //if u want u can create some fields and constructors as well.
        String color;
        String breed;
        int age;

        public Animal(String color, String breed, int age) {
            this.color = color;
            this.breed = breed;
            this.age = age;
        }

        void bark() {
            System.out.println("Bark");
        }

        void sleep() {
            System.out.println("zzzzZZZ");
        }

        void run() {
            System.out.println(" run ");
        }

    }

    class Dog extends Animal {
        public Dog(String color, String breed, int age) {
            super(color, breed, age);
        }

    }

    class Cat extends Animal {
        public Cat(String color, String breed, int age) {
            super(color, breed, age);
        }
    }

    class horse extends Animal {
        public horse(String color, String breed, int age) {
            super(color, breed, age);
        }
    }
}
