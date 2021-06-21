import java.util.Scanner;
public class decryptor {
    public static String ungroupify(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                if (Character.isUpperCase(input.charAt(i)))
                    result = result + input.charAt(i);
            }
        }
        return result;
    }
    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for (; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if (result.length() < 26) {
            for (currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }
    public static String decryptString(String input, int shift) {
        shift *= -1;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String newAlphabet = shiftAlphabet(shift);
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            int j = alphabet.indexOf(input.charAt(i));
            result = result + newAlphabet.charAt(j);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner answers = new Scanner(System.in);
        System.out.print("Enter string to decrypt: ");
        String input = answers.nextLine();
        System.out.print("Enter the shift amount: ");
        int shift = answers.nextInt();
        System.out.println(decryptString(ungroupify(input), shift));
    }
}
