import java.util.Scanner;

public class Problem2TriangleArea {

    public static void main(String[] args) {
        System.out.println("Please, enter three points: A, B, and C on triangle and their coordinates x and y.");
        System.out.println("Example: Point A: 5 15\n"
                + "         Point B: 15 20\n"
                + "         Point C: 20 25\n");
        System.out.print("Enter point A coordinates: ");

        Scanner input = new Scanner(System.in);
        String[] splittedA = input.nextLine().split(" ");

        System.out.print("Enter point B coordinates: ");
        String[] splittedB = input.nextLine().split(" ");

        System.out.print("Enter point C coordinates: ");
        String[] splittedC = input.nextLine().split(" ");

        int aX = Integer.parseInt(splittedA[0]);
        int aY = Integer.parseInt(splittedA[1]);

        int bX = Integer.parseInt(splittedB[0]);
        int bY = Integer.parseInt(splittedB[1]);

        int cX = Integer.parseInt(splittedC[0]);
        int cY = Integer.parseInt(splittedC[1]);

        int pointA = aX * (bY - cY);
        int pointB = bX * (cY - aY);
        int pointC = cX * (aY - bY);

        int area = (pointA + pointB + pointC) / 2;

        System.out.println("The area of the triangle is: " + Math.abs(area));
    }
}
