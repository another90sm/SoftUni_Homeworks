import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6StartsAndEndsWithCapitalLetter {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        String inputText = scann.nextLine();

        Pattern pat = Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]\\b");
        Matcher match = pat.matcher(inputText);

        while (match.find()) {
            System.out.print(match.group() + " ");
        }
    }
}
