import java.util.Scanner;

public class Problem6CountSpecifiedWord {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        String[] input = scann.nextLine().split("\\P{Alpha}+");
        String word = scann.nextLine();
        int counter = 0;

        for (int i = 0; i <input.length ; i++) {
            if (input[i].equalsIgnoreCase(word)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
