import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();

        // Check if the input is a single letter
        if (letter.length() != 1 || !Character.isLetter(letter.charAt(0))) {
          System.out.println(letter + " is an invalid input");
        } else {
          // Check if the letter is a vowel
          if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
            System.out.println(letter + " is a vowel");
          } else {
            System.out.println(letter + " is a consonant");
          }
        }
    }
  }
}