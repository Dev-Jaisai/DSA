package Strings;

public class CompareTwoStrings {

    public static void main(String[] args) {

        String s1="Jaisai";
        String s2="Jaisai";

        boolean isEqual=false;

        for (int i = 0; i<s1.length() ; i++) {
            if (s1.charAt(i)!=s2.charAt(i)){
                isEqual=false;
                break;
            }
            else {
               isEqual=true;
            }
        }
        if (isEqual){
            System.out.println("equals");
        }else {
            System.out.println("Not Equal");
        }
    }
}
