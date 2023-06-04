package Class22;

public class Animaltester {
    public static void main(String[] args) {
        Animals[] animals={new Dog(),new Cat()};
        for(Animals animal:animals){
            animal.speak();
            animal.eat();
            animal.sleep();
        }
    }
}
