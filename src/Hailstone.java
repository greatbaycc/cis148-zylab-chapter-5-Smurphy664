import java.util.Scanner;

public class Hailstone {

    public void hailstone(int num) {
        int count = 0;
        while (num != 1) {
            System.out.print(num + "\t");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = 3 * num + 1;
            }
        }
        System.out.print(num);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Hailstone labObject = new Hailstone();
        int num;
        num = scnr.nextInt();
        labObject.hailstone(num);
        System.out.println();
    }
}