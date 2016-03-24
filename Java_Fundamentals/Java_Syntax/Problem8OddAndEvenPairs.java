import java.util.Scanner;

public class Problem8OddAndEvenPairs {

    public static void main(String[] args) {
        System.out.println("Enter an even lenght integer number set:");

        Scanner input = new Scanner(System.in);
        String in = input.nextLine();

        String[] splited = in.split(" ");

        if (splited.length % 2 != 0) {
            System.out.println("Invalid length");
            System.exit(0);
        }

        for (int i = 0; i < splited.length; i += 2) {
            if ((Integer.parseInt(splited[i]) % 2 == 0) & (Integer.parseInt(splited[i + 1]) % 2 == 0)) {
                System.out.printf("%s, %s -> both are even%n", splited[i], splited[i + 1]);
            } else if ((Integer.parseInt(splited[i]) % 2 != 0) & (Integer.parseInt(splited[i + 1]) % 2 != 0)) {
                System.out.printf("%s, %s -> both are odd%n", splited[i], splited[i + 1]);
            } else {
                System.out.printf("%s, %s -> different%n", splited[i], splited[i + 1]);
            }
        }
    }
}
