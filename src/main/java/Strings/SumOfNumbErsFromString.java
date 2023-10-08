package Strings;

public class SumOfNumbErsFromString {
    public static void main(String[] args) {
        String name="jai5sai sarkate5";

        int sum=0;
        for (int i = 0; i <name.length() ; i++) {
            char c=name.charAt(i);
            if (Character.isDigit(c)){
                int currentNumber = Character.getNumericValue(c);
                sum+=currentNumber;
            }
        }
        System.out.println(sum);

        System.out.println( name.chars().filter(Character::isDigit).map(Character::getNumericValue).sum());
    }
}
