import java.util.Scanner;

public class Problem10CharacterMultiplier {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(characterMultiplier(input.nextLine(), input.nextLine()));

    }

    public static long characterMultiplier(String first, String second) {
        long sum = 0;

        if (first.length() > second.length()) {

            for (int i = 0; i < first.length(); i++) {
                if (i < second.length()) {
                    sum += first.charAt(i) * second.charAt(i);
                } else {
                    sum += first.charAt(i);
                }
            }
        } else {

            for (int i = 0; i < second.length(); i++) {
                if (i < first.length()) {
                    sum += first.charAt(i) * second.charAt(i);
                } else {
                    sum += second.charAt(i);
                }
            }
        }
        return sum;
    }
}

