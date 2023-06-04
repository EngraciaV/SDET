package class23;

import java.util.ArrayList;

public class E1Colllections {
    public static void main(String[] args) {
        String name="Vero";
        String name1="Rajbeer";
        //if its more than two you should create an array
        String[] names ={"Lizzy", "Maria","Steve"};
        int size=2;
        String [] name2 =new String[size];
        name2[0]="semir";
        //arrays need to know size beforehand....array list does not need to know the number beforehand
        ArrayList<String > arrayList= new ArrayList<>();
        arrayList.add("Sam");
        arrayList.add("Dean");
        arrayList.add("Fiona");
        arrayList.add("Snow");
        arrayList.add("Belle");
        arrayList.add("Zayn");
        System.out.println(arrayList);
    }
}
