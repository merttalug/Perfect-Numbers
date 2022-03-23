# Perfect Numbers
 A program that finds whether a positive number entered by users is a perfect number.

## What are the Perfect Numbers ?
A perfect number is a number whose sum of positive integer factors (divisors without a remainder) excluding itself is equal to itself.

![img](https://wikimedia.org/api/rest_v1/media/math/render/svg/54ba0eb88722c61bf7d3b5f43693e9d70e588b89)

## Code BLock

```
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


```
