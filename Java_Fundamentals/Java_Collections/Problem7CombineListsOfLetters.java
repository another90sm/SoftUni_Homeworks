import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem7CombineListsOfLetters {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        String[] temp = scann.nextLine().split("\\s+");
        ArrayList<String> firstList = new ArrayList<String>(Arrays.asList(temp));

        temp = scann.nextLine().split("\\s+");
        List<String> secondList = new ArrayList<String>(Arrays.asList(temp));

        for (String item : secondList) {
            if (!firstList.contains(item)) {
                firstList.add(item);
            }
        }

        for (String element : firstList) {
            System.out.print(element + " ");
        }
    }
}
