package Strings;

public class ReverseString {

    public static void main(String[] args) {


        String name="jaisai sarkate Hello";

        String[] s = name.split(" ");
            for (int i=s.length-1;i>=0;i--){
                System.out.print(s[i]+" ");
            }
        }
    }

