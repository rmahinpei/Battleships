/*
    Encrypts a message inputted by the user by shifting the alphabet order by one
*/

import java.util.Scanner;
public class encryptor {
    public static String normalizeText(String input) {
        String result = "";
        input = input.toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                result = result + input.charAt(i);
            }
        }
        return result;
    }
    public static String obify(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A' || input.charAt(i) == 'E') {
                result = result + input.charAt(i) + "O" + "B";
            }
            else if (input.charAt(i) == 'O' || input.charAt(i) == 'U') {
                result = result + input.charAt(i) + "O" + "B";
            }
            else if (input.charAt(i) == 'I' || input.charAt(i) == 'Y') {
                result = result + input.charAt(i) + "O" + "B";
            }
            else {
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
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }
    public static String caesarify(String input, int key) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String newAlphabet = shiftAlphabet(key);
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            int j = alphabet.indexOf(input.charAt(i));
            result = result + newAlphabet.charAt(j);
        }
        return result;
    }
    public static String groupify(String input, int parameter) {
        while (input.length() % parameter != 0) {
            input = input + "x";
        }
        String result = "";
        for (int i = 0; i < input.length(); i += parameter) {
            result = result + input.substring(i, i + parameter) + " ";
        }
        return result.trim();
    }
    public static String encryptString(String input, int shift, int size) {
        return groupify(caesarify(obify(normalizeText(input)), shift), size);
    }
    public static void main(String[] args) {
        Scanner answers = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = answers.nextLine();
        System.out.print("Enter the shift amount: ");
        int shift = answers.nextInt();
        System.out.print("Enter the size of coding groups: ");
        int size = answers.nextInt();
        System.out.println(encryptString(input, shift, size));
    }
}
