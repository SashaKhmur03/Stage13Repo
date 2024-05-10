import java.util.Scanner;

public class Task2 {
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

        boolean isMirror = true;

        for (int i = 0; i < size / 2; i++) {
            if (vector[i] != vector[size - i - 1]) {
                isMirror = false;
                break;
            }
        }

        if (isMirror) {
            System.out.println("The vector is mirrored.");
        } else {
            System.out.println("The vector is not mirrored.");
        }
    }
}