import java.util.Scanner;

public class Problem6ConvertFromBase7ToDecimal {

    public static void main(String[] args) {
        System.out.println("Please, enter an integer base - 7 number, which you want to convert into decimal number:");

        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int a = Integer.valueOf(num, 7);
        System.out.println("The decimal number is: " + a);
    }
}
