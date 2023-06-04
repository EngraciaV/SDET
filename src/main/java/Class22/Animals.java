package Class22;

import Class22.Animals;

public abstract class Animals {

     abstract void speak();
     abstract void eat();
     abstract void sleep();
}

class Dog extends Animals {
    @Override
     void speak(){
        System.out.println("woof woof");
    }
    @Override
     void eat(){
        System.out.println("slurp slurp");
    }
    @Override
     void sleep(){
        System.out.println("sleeping");
    }
}

class Cat extends Animals{
    @Override
     void speak(){
        System.out.println("meow");
    }
     void eat(){
        System.out.println("munch");
    }
    @Override
     void sleep(){
        System.out.println("Prrrr");
    }
}

class Horse extends Animals{
    @Override
     void speak(){
        System.out.println("neigh");
    }
    @Override
     void eat(){
        System.out.println("chomp");
    }
    @Override
     void sleep(){
        System.out.println("oooo");
    }
}