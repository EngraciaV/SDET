package Class13;

public class task1 {
    public static void main(String[] args) {

        //String str=new String("java");
        String str= "sebastian"; //this is used most
        //only works when the characters are an odd number
        if(!str.isBlank()&& str.length()%2!=0&& str.length()>=3){
            int middleindex= str.length()/2;
            char middleChar=str.charAt(middleindex);
            System.out.println(middleChar);
        }
    }
}
