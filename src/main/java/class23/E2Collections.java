package class23;

import java.util.ArrayList;

public class E2Collections {
    public static void main(String[] args) {

        ArrayList<String> names =new ArrayList<>();
        names.add("Mateo");
        names.add("Randol");
        names.add("Sofia");
        names.add("Nick");
        names.add("E");
        names.add("E");
        System.out.println(names);
        //ArrayList can contain duplicates within the array
        System.out.println(names.size());
        System.out.println(names.contains("asleep"));
        System.out.println(names.get(0));
        names.remove("Sofia");
        System.out.println(names);

    }
}
