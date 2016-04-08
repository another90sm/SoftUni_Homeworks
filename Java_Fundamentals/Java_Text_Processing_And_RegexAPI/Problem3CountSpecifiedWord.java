import java.util.Scanner;

public class Problem3CountSpecifiedWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("[\\W\\d]+");
        String word = scan.nextLine();
        int counter = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i].equalsIgnoreCase(word)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
