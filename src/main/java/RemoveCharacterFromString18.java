import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveCharacterFromString18 {
    public static void main(String[] args) {
        String name = "jaisai";
        char charToRemove = 'a';

        String newName = Arrays.stream(name.split(""))
                .filter(ch -> ch.charAt(0) != charToRemove)
                .collect(Collectors.joining());

        System.out.println("Original string: " + name);
        System.out.println("String with '" + charToRemove + "' removed: " + newName);
    }
}

