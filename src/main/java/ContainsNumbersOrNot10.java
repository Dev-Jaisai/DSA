public class ContainsNumbersOrNot10 {

        public static void main(String[] args) {
            String name = "jaias";
            boolean containsDigit = false;

            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if (Character.isDigit(c)) {
                    containsDigit = true;
                    break;
                }
            }

            System.out.println("String contains digit? " + containsDigit);


            String input = "12345";
            boolean containsOnlyNumbers = input.matches("[0-9]+");
            System.out.println("String contains only numbers? " + containsOnlyNumbers);

        }
    }
