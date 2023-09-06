package Strings;

public class CountNumberOfWords {

    public static void main(String[] args) {

        String name="jaisai sarkate";
        int count=1;
        char[] words = name.toCharArray();
        for (int i = 0; i < words.length ; i++) {
            if(words[i]==' '&&words[i+1]!=' '){
                count++;
            }

        }
        System.out.println(count);
    }
}
