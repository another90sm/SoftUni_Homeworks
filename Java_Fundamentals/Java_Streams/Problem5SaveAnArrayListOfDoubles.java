import java.io.*;
import java.util.*;

public class Problem5SaveAnArrayListOfDoubles {

    public static void main(String[] args) {

        File doubles = new File("files/doubles.list");

        List<Double> doublesList = new ArrayList<Double>();
        doublesList.add(3.14);
        doublesList.add(0.2);
        doublesList.add(1528.0254);
        doublesList.add(0.500);
        doublesList.add(1.1136);

        try (
                ObjectOutputStream outputStream = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(doubles)))
        ) {
            outputStream.writeObject(doublesList);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (
                ObjectInputStream inputStream = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream(doubles)))
        ) {
            System.out.println(inputStream.readObject());

        } catch (IOException | ClassNotFoundException ioe) {
            ioe.printStackTrace();
        }
    }
}

