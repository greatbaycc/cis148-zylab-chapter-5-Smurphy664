import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("q")) {
                break;
            }

            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println(reversed);
        }
    }
}


