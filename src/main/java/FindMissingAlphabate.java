public class FindMissingAlphabate {
    public static void main(String[] args) {
        String name = "qwer tyu op asdf gh jl xcv nm";
        int[] copy = new int[26];
        name = name.toLowerCase();
        for (char c : name .toCharArray()) {
            if (Character.isLetter(c)) {
                int itr = c - 'a'; // Convert character to array index
                copy[itr] = 1;
            }
        }
        System.out.print("Missing alphabets are: ");
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] == 0) {
                char missingLetter = (char) (i + 'a'); // Convert index to character
                System.out.print(missingLetter);
            }
        }
    }
}
