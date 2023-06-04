package class23;

import java.net.http.WebSocket;
import java.util.ArrayList;

public class E3Collection {
    public static void main(String[] args) {

        ArrayList<String> names =new ArrayList<>();
        names.add("Mateo");
        names.add("Randol");
        names.add("Sofia");
        names.add("Nick");
        names.add("E");
        names.add("E");

        //names.clear();
        names.remove("Nick");
        names.remove(2);
        names.indexOf(names.indexOf("Mateo"));
        System.out.println(names);
        for (int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }


    }
}
