import java.util.Scanner;

public class Remove_Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stubimport java.util.Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with unwanted spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        String cleanedString = removeUnwantedSpaces(input);
        System.out.println("String with unwanted spaces removed: " + cleanedString);
    }

    public static String removeUnwantedSpaces(String input) {
        // Use regular expression to remove extra spaces
        return input.replaceAll("\\s+", " ").trim();
    }
}




