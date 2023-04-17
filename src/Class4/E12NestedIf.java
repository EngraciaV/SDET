package Class4;

public class E12NestedIf {
    public static void main(String[] args) {
        System.out.println("3");
        if(true){
            System.out.println("1");
            if(false){
                System.out.println("Inside the nested if");
            }
        }
        System.out.println("4");
    }
}
