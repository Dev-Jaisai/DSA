package Strings;

public class ReverseOnlyVowels {
    public static void main(String[] args) {


        String name = "hello";

        char[] c = name.toCharArray();
        int start=0;
        int end=name.length()-1;

       int n= name.length();
       while (start<end){

           if(!isVowel(c[start])){
               start++;
           } else if (!isVowel(c[end])) {
               end--;
               
           }else{
               char temp=c[start];
               c[start]=c[end];
               c[end]=temp;
               start++;
               end--;
           }
       }

        String reverseString= new String(c);
        System.out.println(reverseString);
    }

    private static boolean isVowel(char c) {
        if(c=='a'||c=='e' || c=='i' || c=='o' || c=='u'){
            return  true;
        }
        return false;
    }
}
