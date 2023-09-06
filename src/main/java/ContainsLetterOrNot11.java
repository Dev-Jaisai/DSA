public class ContainsLetterOrNot11 {

        public static void main(String[] args) {
            String input = "HelloWorld";
            boolean containsOnlyLetters = true;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (!Character.isLetter(c)) {
                    containsOnlyLetters = false;
                    break;
                }
            }

            System.out.println("Contains only letters? " + containsOnlyLetters);
        }
    }


