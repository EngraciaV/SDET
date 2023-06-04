package Class4;

public class E4ElseIf {
    public static void main(String[] args) {
        String fruit = "strawberry";

        if(fruit.equals("orange")){
            System.out.println("You have to $12");
        }else if(fruit.equals("Banana")){
            System.out.println("You have to pay $5");
        }else if(fruit.equals("Apple")){
            System.out.println("You have to pay $4");
        }else {
            System.out.println("This fruit is not available");
        }
    }
}
