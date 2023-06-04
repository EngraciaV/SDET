package class24;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Joe");
        names.add("Sami");
        names.add("Thiago");
        names.add("Sue");
        names.add("Snow");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Thiago"));
        System.out.println(names.size());
    }
}