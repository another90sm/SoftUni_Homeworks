import java.util.Scanner;
import java.util.regex.*;

public class Problem2CountSubstringOccurrences {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        String inputText = scann.nextLine().toLowerCase();
        String patternString = scann.nextLine().toLowerCase();

        Pattern pat = Pattern.compile(patternString);
        Matcher match = pat.matcher(inputText);

        int counter = 0;

        while (match.find()){
            counter++;
        }

        System.out.println(counter);



    }
}
