import java.util.*;

public class UnicodeOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Character: ");

        char ch = scanner.next().charAt(0);

        System.out.println("Unicode value of char :" + ch + " is " + (int)ch);

        scanner.close();
    }
}
