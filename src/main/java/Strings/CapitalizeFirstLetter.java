package Strings;

public class CapitalizeFirstLetter {

    public static void main(String[] args) {

        String name="Hello wordls how are u?";

        String[] words = name.split(" ");
        for(int i=0;i< words.length;i++){
            char firstChar = words[i].charAt(0);
            String upperCase = String.valueOf(firstChar).toUpperCase();
            String substring = words[i].substring(1);

            System.out.print(upperCase+substring+" ");



        }

    }
}
