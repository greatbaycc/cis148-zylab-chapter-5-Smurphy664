import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String output = input.replaceAll(" ", "");

        System.out.println(output);
    }
}


