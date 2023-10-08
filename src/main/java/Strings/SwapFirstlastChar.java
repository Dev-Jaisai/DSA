package Strings;

public class SwapFirstlastChar {
    public static void main(String[] args) {
        String name="Jaisai";
        String newName="";
        int length = name.length();
        char firstChar=name.charAt(0);
        char lastChar=name.charAt(length-1);
        String middleName=name.substring(1,length-1);
        String newString =lastChar+middleName+firstChar;
        System.out.println(newString);
    }
}
//vikas;
//manav

//output--->vinas