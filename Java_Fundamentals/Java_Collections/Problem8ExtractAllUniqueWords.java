import java.util.*;

public class Problem8ExtractAllUniqueWords {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        String[] input = scann.nextLine().toLowerCase().split("\\P{Alpha}+");
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(input));

        for (String item : uniqueWords) {
            System.out.print(item + " ");
        }
    }
}
