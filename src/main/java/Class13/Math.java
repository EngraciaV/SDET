package Class13;

public class Math {
    void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    void multiply(int num1,int num2){
        System.out.println(num1*num2);
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.add(77,77);
        math.multiply(5,5);
    }
}
