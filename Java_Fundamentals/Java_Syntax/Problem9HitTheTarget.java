import java.util.Scanner;

public class Problem9HitTheTarget {

    public static void main(String[] args) {
        System.out.println("Please, enter target integer:");

        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == target) {
                    System.out.println(i + " + " + j + " = " + target);
                }
            }
        }

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i - j == target) {
                    System.out.println(i + " - " + j + " = " + target);
                }
            }
        }
    }
}
