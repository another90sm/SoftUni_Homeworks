import java.util.Scanner;

public class Problem1RectangleArea {
    public static void main(String[] args) {
        System.out.println("Please , enter a and b to calculate the rectangle area.");

        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        String[] splittedInput = in.split(" ");
        int a = Integer.parseInt(splittedInput[0]);
        int b = Integer.parseInt(splittedInput[1]);
        System.out.printf("The area of the rectangle is: %s\n", (a * b));
    }
}
