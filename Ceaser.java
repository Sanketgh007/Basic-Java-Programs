import java.util.Scanner;

public class Ceaser {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                char encryptedChar = (char) ('A' + (ch - 'A' + shift) % 26);
                result.append(encryptedChar);
            }
            else if (Character.isLowerCase(ch)) {
                char encryptedChar = (char) ('a' + (ch - 'a' + shift) % 26);
                result.append(encryptedChar);
            }
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }
    
    public static String decrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                char decryptedChar = (char) ('A' + (ch - 'A' - shift + 26) % 26);
                result.append(decryptedChar);
            }
            else if (Character.isLowerCase(ch)) {
                char decryptedChar = (char) ('a' + (ch - 'a' - shift + 26) % 26);
                result.append(decryptedChar);
            }
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text to encryptand decrypt: ");
        String text = scanner.nextLine();
        for (int shift = 0; shift < 26; shift++) {
            String encryptedText = encrypt(text, shift);
            System.out.println("Shift: " + shift + ", Encrypted text: " + encryptedText);
            String decryptedText = decrypt(text, shift);
            System.out.println("Shift: " + shift + ",Decrypted text: " + decryptedText);
        }
        scanner.close();
    }
}
