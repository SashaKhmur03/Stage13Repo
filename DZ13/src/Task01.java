import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the vector: ");
        int size = scanner.nextInt();

        while (size <= 0) {
            System.out.print("Invalid size." +
                    " Please enter a positive integer: ");
            size = scanner.nextInt();
        }

        int[] vector = new int[size];
        System.out.println("Enter the elements of the vector:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 1; i < size; i++) {
            if (vector[i] < vector[i - 1]) {
                isAscending = false;
            }
            if (vector[i] > vector[i - 1]) {
                isDescending = false;
            }
        }

        if (isAscending) {
            System.out.println("The vector is ordered in ascending order.");
        } else if (isDescending) {
            System.out.println("The vector is ordered in descending order.");
        } else {
            System.out.println("The vector is not ordered.");
        }
    }
}

