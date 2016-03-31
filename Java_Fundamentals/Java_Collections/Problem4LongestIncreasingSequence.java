import java.util.Scanner;

public class Problem4LongestIncreasingSequence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int previous = 0;
        int current = 0;
        int maxLength = 0;
        int currLength = 0;
        int startIndex = 0;
        for (int i = 0; i < input.length; i++) {
            if (i == 0) {
                System.out.print(input[0] + " ");
                currLength++;
                continue;
            }
            previous = numbers[i - 1];
            current = numbers[i];
            if (current > previous) {
                currLength++;
                System.out.print(current + " ");
                if (currLength > maxLength) {
                    maxLength = currLength;
                    startIndex = i - maxLength + 1;
                }
            } else {
                System.out.println();
                System.out.print(current + " ");
                currLength = 1;
            }
        }
        if (maxLength == 1 || maxLength == 0) {
            System.out.print("Longest: " + input[0] + " ");
        } else {
            System.out.println();
            System.out.print("Longest: ");
            for (int i = 0; i < maxLength; i++) {
                System.out.print(input[startIndex++] + " ");
            }
        }
    }
}
