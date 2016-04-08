import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem1ExtractEmails {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        String inputText = scann.nextLine();

        Pattern pat = Pattern.compile("([\\w\\.\\-_]+)?\\w+@[\\w-]+(\\.\\w+){1,}");
        Matcher match = pat.matcher(inputText);

        while (match.find()) {
            System.out.println(match.group(0));
        }


    }
}
