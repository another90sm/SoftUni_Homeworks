import java.util.Scanner;

public class Problem2SequencesOfEqualStrings {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        String[] strings = scann.nextLine().split("\\s+");

        for (int i = 1; i < strings.length; i++) {

            if (!strings[i].equals(strings[i - 1])) {
                System.out.println(strings[i - 1]);
                if (i == strings.length - 1) {
                    System.out.println(strings[i]);
                }
            } else if (strings[i].equals(strings[i - 1])) {
                System.out.print(strings[i - 1] + " ");
                if (i == strings.length - 1) {
                    System.out.println(strings[i]);
                }
            }
        }
    }
}
