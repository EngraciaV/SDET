package class24;

import java.util.ArrayList;

public class task02 {
    public static void main(String[] args) {

        //create an arraylist and print only words that do not end with "e"

        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("babe");
        words.add("ice");
        words.add("fish");
        words.add("snow");

        for (int i = 0; i < words.size(); i++) {
            String name=words.get(i);
            if (words.get(i).endsWith("e")) {
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);
    }
}
