import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character = scanner.next().charAt(0);
        String input = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == character) {
                count++;
            }
        }

        System.out.println(count);
    }
}


