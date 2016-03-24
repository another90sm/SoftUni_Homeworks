import java.util.Scanner;

public class Problem5ConvertFromDecimalSystemToBase7 {

    public static void main(String[] args) {
        System.out.println("Please, enter an integer decimal number, which you want to convert into base - 7 number:");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("The base - 7 number is: " + Integer.toString(num, 7));
    }
}
