import java.util.Scanner;

public class Max {

    public int findMax() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (true) {
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Max test = new Max();
        System.out.println(test.findMax());
    }
}


