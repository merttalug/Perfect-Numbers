import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, num, total = 0;

        do {
            System.out.println("Please enter a positive number : ");
            num = input.nextInt();
        }
        while (num <= 0);

        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if (total == num) System.out.println(num + " is a Perfect Number.");
        else System.out.println(num + " is not a Perfect Number.");

    }
}
