public class WapToFindDuplicatesFromArray {
    public static void main(String[] args) {

            String str = "Hello world hello Java world";

            String[] words = str.split(" ");

            for (String word : words) {
                int count = 0;
                    for (String currentWord : words) {
                    if (word.equals(currentWord)) {

                        count++;
                    }

                }
           System.out.println(word + ": " + count);
            }
        }
    }
