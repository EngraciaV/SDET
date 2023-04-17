package Class10;

public class Task7 {
    public static void main(String[] args) {

        /*
        from an array of integer elements find the largest number
         */

        int [] numbers = {10,20,50,40,30};
        int largest = numbers[0];


        for (int i = 0; i < 5; i++){
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}
