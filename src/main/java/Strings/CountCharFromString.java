package Strings;

public class CountCharFromString {
    public static void main(String[] args) {
        String str = "jaisaij";

        for (int i = 0; i < str.length() ; i++) {
            int count=0;
            char charAt = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (charAt==str.charAt(j)){
                    count++;
                }

            }

            System.out.println(charAt+" "+ count);
        }

    }
}

