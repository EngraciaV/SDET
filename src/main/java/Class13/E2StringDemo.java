package Class13;

public class E2StringDemo {
    public static void main(String[] args) {

        String str="fkljsdkfisu7843827!@#";
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-z]","#"));
        System.out.println(str.replaceAll("[0-9]","%"));
        System.out.println(str.replaceAll("[e-z-9]","%"));

    }
}
