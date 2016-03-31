import java.io.*;

public class Problem1SumLines {
    public static void main(String[] args) {
        File lines = new File("files/lines.txt");

        try (BufferedReader bfr = new BufferedReader(
                new FileReader(lines)
        )) {

            String line;
            while ((line = bfr.readLine()) != null) {
                char[] charsInLine = line.toCharArray();
                int sum = 0;
                for (char chars : charsInLine) {
                    sum += chars;
                }
                System.out.println(sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
