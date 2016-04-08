import java.util.Arrays;
import java.util.Scanner;

public class Problem2SortArrayWithStreamAPI {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        String[] numbers = scann.nextLine().split("\\s+");
        String command = scann.nextLine().toLowerCase();

        switch (command) {
            case "ascending":
                Arrays.stream(numbers)
                        .mapToInt(Integer::parseInt)
                        .boxed()
                        .sorted()
                        .forEach(p -> System.out.print(p + " "));
                break;
            case "descending":
                Arrays.stream(numbers)
                        .mapToInt(Integer::parseInt)                //This will also work "p -> Integer.parseInt(p)"
                        .boxed()
                        .sorted((firstNum, secondNum) ->secondNum.compareTo(firstNum))
                        .forEach(p -> System.out.print(p + " "));
                break;
        }
    }
}
