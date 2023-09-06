package Strings;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {
        String name = "xjjjxyyxxjjkk";
        String res = "";
        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            if (i == name.length() - 1 || currentChar != name.charAt(i + 1)) {
                res += currentChar;
            }
        }
        System.out.println(res);
    }
}

