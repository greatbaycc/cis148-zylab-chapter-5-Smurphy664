import java.util.Scanner;

public class IntegerStringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userString = scanner.next();
        boolean isInteger = true;

        for (int i = 0; i < userString.length(); i++) {
            if (!Character.isDigit(userString.charAt(i))) {
                isInteger = false;
                break;
            }
        }

        System.out.println(isInteger ? "yes" : "no");
    }
}

