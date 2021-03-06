import java.util.*;

public class Problem1SortArrayOfNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to enter:");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("Enter the numbers:");
        String[] in = input.nextLine().split(" ");
        Integer[] numbers = new Integer[n];

        for (int i = 0; i < in.length; i++) {
            numbers[i] = Integer.parseInt(in[i]);
        }
        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
