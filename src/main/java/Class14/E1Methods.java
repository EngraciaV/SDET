package Class14;

public class E1Methods {

    void printWord(String word) {
        System.out.println(word);
    }

    /*
    void => return type of the method void means this
    method does not return any data

    other examples of return types can be string int boolean
    Dog Cat etc.

    printWord => it's the name of the method
    (String word) => parameter/input---you can pass all data types
    { System.out.println(word);} => body of the method you can write
    if else conditions loops
     */

    public static void main(String[] args) {
        // we are creating an obj of the E1Methods class
        // in java all the classes can be treated as data types
        //new E1Method() => creating the object of the E1Methods class
        String name;
        E1Methods obj = new E1Methods();
        // we are calling the printWord() method on obj object and passing "java" as
        // argument or input
        obj.printWord("Java");
    }
}
