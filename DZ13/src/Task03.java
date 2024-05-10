import java.util.Scanner;

public class Task03 {
    public static boolean areAllElementsDistinct(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean areAllElementsEqual(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] != vector[0]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = getValidInput(scanner, "Enter the size of the vector: ",
                "Size must be a positive integer.", i -> i > 0);
        int[] vector = new int[size];
        System.out.println("Enter the elements of the vector:");
        for (int i = 0; i < size; i++) {
            vector[i] = getValidInput(scanner, "Element " + (i + 1) + ": ",
                    "Invalid input. Please enter an integer.",
                    null);
        }

        boolean allDistinct = areAllElementsDistinct(vector);
        boolean allEqual = areAllElementsEqual(vector);

        if (allDistinct) {
            System.out.println("All elements in the vector are distinct.");
        } else if (allEqual) {
            System.out.println("All elements in the vector are equal.");
        } else {
            System.out.println("The elements in the vector are neither " +
                    "all distinct nor all equal.");
        }
    }

    private static int getValidInput(Scanner scanner, String prompt,
                                     String errorMessage,
                                     java.util.function.Predicate<Integer>
                                             condition) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (condition == null || condition.test(input)) {
                    return input;
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                System.out.println(errorMessage);
                scanner.next();
            }
        }
    }
}

