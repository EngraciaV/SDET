package Class9;

public class E8Arrays {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        char[] arrr = {'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int j = arrr.length - 1; j >= 0; j--) {
            System.out.print(arrr[j] + " ");
        }
    }
}
