package Class14;

import java.util.Scanner;

public class E2ArrayManipulator {
    /*
    ctreate a method that will take an int array call it sumArr
    and return the sum of all the elements from that array
    create the object of the class and call the method
     */
    /*
    return type int
    name of the method => sumArr
    parameters => (int [] arr)
    body =>
    {
    fo through all the elements of the array add them and return the results
    }
     */

    int sumArr (int [] arr){
        int sum = 0;
        for(int num:arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {

        E2ArrayManipulator obj = new E2ArrayManipulator();
        int [] array = {10, 20, 30};
        int result = obj.sumArr(array);
        System.out.println(result);
    }
}
