import java.util.Scanner;

public class Problem3LargestSequenceOfEqualStrings {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        String[] strings = scann.nextLine().split("\\s+");
        int maxLength = 0;
        int currentLength = 1;
        int position = 0;

        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i].equals(strings[i + 1])) {
                currentLength++;
                if (currentLength > 2) {
                    position = i;
                }
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                if (i + 1 == strings.length - 1) {
                    currentLength++;
                }
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }

        if (maxLength == 0) {
            System.out.println(strings[0]);
        } else {
            for (int i = 0; i < maxLength; i++) {
                System.out.print(strings[position] + " ");
            }
        }
    }
}
