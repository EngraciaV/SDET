package Class13;

public class ArrayUtil {
    public static void main(String[] args) {

        /*
        write the logic to search if the number is present in the
        array or not
         */

        int[] arr= {22,1,5,77,57};
        int number = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number ){
                System.out.println("Yes");}
        }
    }
}
