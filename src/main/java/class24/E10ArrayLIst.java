package class24;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;

public class E10ArrayLIst {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("babe");
        words.add("ice");
        words.add("fish");
        words.add("snow");

       // words.removeIf(x->.endsWith("e"));---fix error after class
       words.removeIf((String word)->word.endsWith("e"));

       /* Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String word=iterator.next();
            if(word.endsWith("e")){
                iterator.remove();
            }
        */
        System.out.println(words);
    }
}
