import java.util.Scanner;

public class Problem4CalculateExpression {

    public static void main(String[] args) {
        System.out.println("Please, enter three floating point numbers");

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double averageValue = (a + b + c) / 3;

        double formula1_0 = Math.pow(a, 2) + Math.pow(b, 2);
        double formula1_1 = Math.pow(a, 2) - Math.pow(b, 2);
        double formula1_2 = formula1_0 / formula1_1;
        double root1 = (a + b + c)/ Math.sqrt(c);
        double formula1 = Math.pow(formula1_2, root1);

        double formula2_0 = Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3);
        double root2 = a - b;
        double formula2 = Math.pow(formula2_0, root2);

        double averageValueFormulas = (formula1 + formula2) / 2;
        double averageValuesDifference = Math.abs(averageValueFormulas - averageValue);

        System.out.printf("F1 result: %.2f; F2 result %.2f; Diff: %.2f", formula1, formula2, averageValuesDifference);
    }
}
