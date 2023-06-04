package Class13;

public class task2 {
    public static void main(String[] args) {

        /*
        create a string how many alphabets are in the string
         */

        String random = "jhf874857vbjdhf&^#%@jfsssss";
        System.out.println(random.replaceAll("[^a-zA-Z]",""));
        System.out.println(random);
        System.out.println(random.length());
    }
}
