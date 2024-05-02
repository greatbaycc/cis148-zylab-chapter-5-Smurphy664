import java.util.Scanner;

public class VariedInputData {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int count = 0;

        while (true) {
            int num = scnr.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
            max = Math.max(max, num);
            count++;
        }

        double average = (double) sum / count;
        System.out.println((int) average + " " + max);
    }
}


