import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;

public class Problem1FilterArray {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        String[] input = scann.nextLine().split("\\s+");

        ArrayList<String> filteredStrings = (ArrayList) Arrays.stream(input).filter(str -> str.length() > 3).collect(Collectors.toList());

        if (filteredStrings.isEmpty()) {
            System.out.println("(empty)");
        } else {
            for (String string : filteredStrings) {
                System.out.print(string + " ");
            }
        }
    }
}
