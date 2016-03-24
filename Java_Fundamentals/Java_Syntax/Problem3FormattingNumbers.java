import java.util.Scanner;

public class Problem3FormattingNumbers {

    public static void main(String[] args) {
        System.out.println("Please, enter integer number a and floating point numbers b and c:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double b = input.nextDouble();
        double c = input.nextDouble();

        String binary = Integer.toString(a,2);
        int a1 = Integer.parseInt(binary);
        String formatted = String.format("%010d", a1);

        System.out.printf("|%-10x|%s|%10.2f|%-10.3f|", a, formatted, b, c);
    }
}
