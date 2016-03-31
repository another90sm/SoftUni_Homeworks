import java.util.Scanner;

public class Problem5CountAllWords {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        String[] input = scann.nextLine().split("\\P{Alpha}+");
        System.out.println(input.length);
    }
}
