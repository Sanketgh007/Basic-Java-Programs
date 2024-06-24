import java.util.Scanner;

public class Rvswcp {

    public static void main(String[] args) {
        String arr[] = new String[100];
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the String");
        s = sc.nextLine(); // Use nextLine() to read the entire line
        arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
