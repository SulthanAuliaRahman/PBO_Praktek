import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();
        word = word.toUpperCase();

        // count frequency of each letter in string
        for (int i = 0; i < word.length(); i++)
            try {
                // convert to all upper case
                counts[word.charAt(i) - 'A']++;
            } catch (Exception e) {
                System.out.print("\"" + word.charAt(i));
                System.out.println("\": Not A letter " + e);
            }
        // print frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++)
            if (counts[i] != 0)
                System.out.println((char) (i + 'A') + ": " + counts[i]);

    }
}