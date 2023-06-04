package Class5;

public class E6LogicalOperators {

    public static void main(String[] args) {

        //System.out.println(true ||true||false);
        int age = 40;
        char gender='f';
        String name="Mary";

        if (age < 18 || age > 60) {
            System.out.println("You will get a discount");

        } else {
            System.out.println("You will not get a discount");
        }
        if (gender=='f' || age>60 ||name != "Mary"){
            System.out.println("You will get a discount");
        }
    }
}
