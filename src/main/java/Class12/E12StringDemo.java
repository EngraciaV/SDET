package Class12;

public class E12StringDemo {
    public static void main(String[] args) {

        String sentence = "Yup we have another class";
        System.out.println(sentence.substring(4));
        System.out.println(sentence.substring(4,11));
        System.out.println(sentence.substring(12,19));

        int startIndex = sentence.length()-5;
        System.out.println(sentence.substring(startIndex));
    }
}
