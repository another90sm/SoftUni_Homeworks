import java.io.*;

public class Problem4CopyJpgFile {

    public static void main(String[] args) {

        File copyOfPic = new File("files/my-copied-picture.jpg");
        File code = new File("files/code.jpg");

        try (
                BufferedInputStream inputStream = new BufferedInputStream(
                        new FileInputStream(code));
                BufferedOutputStream outputStream = new BufferedOutputStream(
                        new FileOutputStream(copyOfPic))
        ) {
            int nRead;
            byte[] buffer = new byte[1024];
            while ((nRead = inputStream.read(buffer, 0, buffer.length)) != -1) {
                outputStream.write(buffer, 0, buffer.length);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
