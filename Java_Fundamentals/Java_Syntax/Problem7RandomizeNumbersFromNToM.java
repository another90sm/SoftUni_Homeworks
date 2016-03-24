import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Problem7RandomizeNumbersFromNToM {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter range in format N - M;");
        System.out.print("Enter N: ");
        int n = input.nextInt();
        System.out.print("Enter M: ");
        int m = input.nextInt();

        List<Integer> numbers = new ArrayList();
        int counter = 0;

        if (n > m) {
            int exchange;
            exchange = n;
            n = m;
            m = exchange;
        }

        while (counter != Math.abs(m - n + 1)) {
            int randomNum = rand.nextInt((m - n) + 1) + n;
            if (!numbers.contains(randomNum)) {
                numbers.add(randomNum);
                counter++;
            }
        }

        for (Integer numb : numbers) {
            System.out.print(numb + " ");
        }
    }
}
