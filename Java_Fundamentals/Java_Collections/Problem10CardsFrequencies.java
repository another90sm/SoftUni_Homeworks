import java.util.*;


public class Problem10CardsFrequencies {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] elements = scan.nextLine().split("[ ♠♥♦♣]+");

        int elementsCount = elements.length;
        int appearsCount = 1;
        String firstElement;

        List<String> cards = new ArrayList<String>();
        for (int i = 0; i < elements.length; i++) {
            firstElement = elements[i];
            if (cards.contains(firstElement)) {
                continue;
            }
            for (int j = i + 1; j < elements.length; j++) {
                String secondElement = elements[j];
                if (firstElement.contains(secondElement)) {
                    appearsCount++;
                }
            }

            double result =  ((double)appearsCount * 100) /  elementsCount;
            System.out.printf(firstElement + " -> %.2f",result);
            System.out.println("%");
            appearsCount = 1;
            cards.add(firstElement);
        }
    }
}
