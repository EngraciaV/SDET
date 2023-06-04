package Class13;

public class E3StringDemo {
    public static void main(String[] args) {

        String str = "jndfefhJJHD>FD    7673643&%#^";

        System.out.println(str.replaceAll("[^a-z]","O"));
        //^ means not
        //don't replace lower case letters from a-z and numbers from 0-9
        System.out.println(str.replaceAll("[^a-z0-9]","o"));
        System.out.println(str.replaceAll("[^#]","o"));
        System.out.println(str.replaceAll("[Dn3]","o"));
        System.out.println(str.replaceAll("[A-Z]","\\$"));
        System.out.println(str.replaceAll(" ","\\$"));


    }
}

