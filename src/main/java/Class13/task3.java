package Class13;

public class task3 {
    public static void main(String[] args) {

        String a = "Is it Saturday? Is it raining? Do we hava Java Class today?" ;

        System.out.println(a.replaceAll("[^a-zA-Z]",""));
        String[] aArry=a.split("[.?!]");
        System.out.println(aArry.length);
    }
}
