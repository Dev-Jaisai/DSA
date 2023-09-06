public class RemoveWhiteSpacesInString15 {

    public static void main(String[] args) {
        String name = "Hello World   Hi";

        String newName = name.replaceAll("\\s+", " ");

        System.out.println("Original string: \"" + name + "\"");
        System.out.println("String with replaced whitespace: \"" + newName + "\"");
    }
}