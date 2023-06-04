package class24;

import java.util.ArrayList;

public class task03 {
    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Apple Juice");
        drinks.add("coffe");
        drinks.add("tea");
        drinks.add("hot chocolate");
        drinks.add("milk");

        drinks.replaceAll(a -> a.contains("a") || a.contains("e")? "water" :a);
        System.out.println(drinks);
            }
        }

