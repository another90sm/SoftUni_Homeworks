import java.io.*;

public class Problem2AllCapitals {

    public static void main(String[] args) {

        File capitalLetters = new File("files/capitals.txt");

        try (
                BufferedReader reader = new BufferedReader(
                        new FileReader(capitalLetters))
        ) {
            String textLine;
            String fileContents = "";
            while ((textLine = reader.readLine()) != null) {
                fileContents += textLine.toUpperCase() + "\r\n";
            }

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(capitalLetters));

            writer.write(fileContents);
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
