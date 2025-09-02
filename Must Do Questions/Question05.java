//Print the Fibonacci sequence up to N terms.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (N): ");
        int n = sc.nextInt();
        
        int first = 0, second = 1;
        System.out.println("Fibonacci sequence up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // compute next number
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
