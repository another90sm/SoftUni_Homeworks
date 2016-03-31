import java.io.*;

public class Problem3CountCharacterTypes {

    public static void main(String[] args) {

        File words = new File("files/words.txt");
        File countChars = new File("files/count-chars.txt");

        try (
                BufferedReader reader = new BufferedReader(
                        new FileReader("files/words.txt"));
                BufferedWriter writer = new BufferedWriter(
                        new FileWriter("files/count-chars.txt"))
        ) {
            int punctuation = 0;
            int vowels = 0;
            int whitespaces = 0;

            String textLine;
            String fileContents = "";
            while ((textLine = reader.readLine()) != null) {
                fileContents += textLine;
            }

            char[] symbols = fileContents.toCharArray();
            int totalSymbols = symbols.length;

            for (int i = 0; i < symbols.length; i++) {
                switch (symbols[i]) {
                    case ' ':
                        whitespaces++;
                        break;
                    case '.':
                    case ',':
                    case '!':
                    case '?':
                        punctuation++;
                        break;
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                        vowels++;
                        break;

                }
            }

            writer.write(String.format("Vowels: %s%n", vowels));
            writer.write(String.format("Consonants: %s%n", totalSymbols - (vowels + punctuation + whitespaces)));
            writer.write(String.format("Punctuation: %s%n", punctuation));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
