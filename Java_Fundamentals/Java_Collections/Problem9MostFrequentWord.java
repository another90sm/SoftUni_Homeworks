import java.util.*;

public class Problem9MostFrequentWord {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        String[] input = scann.nextLine().toLowerCase().split("\\P{Alpha}+");
        Map<String, Integer> wordCounter = new TreeMap<String, Integer>();

        int maxCounter = 1;
        int counter = 1;

        for (int i = 0; i < input.length; i++) {
            if (wordCounter.containsKey(input[i])){
                continue;
            }
            for (int j = 0; j < input.length; j++) {
                if (j == i) {
                    continue;
                } else if (input[i].equals(input[j])) {
                    counter++;
                }
            }
            if (counter >= maxCounter) {
                maxCounter = counter;
                wordCounter.put(input[i], maxCounter);
            }
            counter = 1;
        }

        for (Map.Entry<String, Integer> item : wordCounter.entrySet()) {
            System.out.printf("%s -> %s%n",item.getKey(), item.getValue());
        }
    }
}


