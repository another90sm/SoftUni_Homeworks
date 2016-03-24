import java.util.Scanner;

public class Problem11GetFirstOddОrEvenElements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");
        String[] comands = input.nextLine().split(" ");

        int counter = 0;

        switch (comands[2]) {
            case "odd":
                for (int i = 0; i < numbers.length; i++) {
                    if (Integer.parseInt(numbers[i]) % 2 != 0) {
                        System.out.print(numbers[i] + " ");
                        counter++;
                        if (counter == Integer.parseInt(comands[1])) {
                            break;
                        }
                    }
                }
                break;
            case "even":
                for (int i = 0; i < numbers.length; i++) {
                    if (Integer.parseInt(numbers[i]) % 2 == 0) {
                        System.out.print(numbers[i] + " ");
                        counter++;
                        if (counter == Integer.parseInt(comands[1])) {
                            break;
                        }
                    }
                }
                break;
        }
    }
}
