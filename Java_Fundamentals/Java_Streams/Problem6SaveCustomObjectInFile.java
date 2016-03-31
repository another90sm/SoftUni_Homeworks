import java.io.*;

public class Problem6SaveCustomObjectInFile {

    public static void main(String[] args) {

        File courseFile = new File("files/course.save");
        Course course = new Course("Java Fundamentals", 188);

        try (
                ObjectOutputStream outputStream = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(courseFile)))
        ) {
            outputStream.writeObject(course);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (
                ObjectInputStream inputStream = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream(courseFile)))
        ) {
            System.out.println(inputStream.readObject());

        } catch (IOException | ClassNotFoundException ioe) {
            ioe.printStackTrace();
        }
    }
}
