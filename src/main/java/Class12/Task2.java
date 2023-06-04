package Class12;

public class Task2 {
    public static void main(String[] args) {

        String name = "Today is Saturday";
        //print all the indexes

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='a'){
                //system.out.print(i+" ");
                System.out.println(name.charAt(i));
            }
        }
    }
}
