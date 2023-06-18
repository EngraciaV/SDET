package class26;

import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> countries=new TreeMap<>();
        countries.put("China","Beijing");
        countries.put("Honduras","Tegucigalpa");
        countries.put("El Salvador","San Salvaldor");
        countries.put("Hawaii","Honolulu");

        for (String s : countries.keySet()) {
            System.out.println(s);
        }
        for(String v:countries.values()){
            System.out.println(v);
        }
        for(var e:countries.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }


    }
}
