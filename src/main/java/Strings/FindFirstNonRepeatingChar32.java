package Strings;

public class FindFirstNonRepeatingChar32 {
    public static void main(String[] args) {

        String name="jaisai";
        char[] words = name.toCharArray();
       char FindFirstNonRepeatingChar='\0';
        for (int i = 0; i < words.length; i++) {

            int count=1;
            for (int j = i+1; j < words.length ; j++) {
                if (words[i]==words[j]){
                    count++;
                }

            }
            if (count==1){
                FindFirstNonRepeatingChar=words[i];
                break;
            }
        }


        System.out.println(FindFirstNonRepeatingChar);
    }
}
