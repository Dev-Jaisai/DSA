package Strings;

public class CountLowerCaseAndUpperCaseChar {
    public static void main(String[] args) {
        String name="JaisaiSarkate";
        int lowerCase=0;
        int upperCase=0;

        for (int i = 0; i <name.length() ; i++) {
            if (Character.isUpperCase(name.charAt(i))){
                upperCase++;
            }else {
                lowerCase++;
            }
        }
        System.out.println("UppercaseCount "+upperCase+" "+"lowerCase "+lowerCase);
    }
}
