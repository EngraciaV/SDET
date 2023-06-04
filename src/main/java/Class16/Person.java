package Class16;

public class Person {
   private String password;

   private static double bankBalance=7832743;

   private void printPassword(){
       System.out.println(password);
   }
   public static void main (String[] args){
       Person Bee = new Person();
       Bee.password = "62387";
       Bee.printPassword();
       System.out.println(Person.bankBalance);
   }
}
