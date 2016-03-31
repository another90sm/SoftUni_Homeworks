import java.util.Scanner;

public class Problem12RecursiveFactorial {

    public static int factorial(int n) {
        int value = 0;
        if (n == 0) {
            value = 1;
        } else {
            value = n * factorial(n - 1);
        }
        return value;
    }

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();
        System.out.println(factorial(n));
    }
}
