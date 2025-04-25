import java.util.Scanner;

public class Inverse_An_Array {
    public static void invert(int[] original, int[] inverted, int index) {
        if (index == original.length) return;

        inverted[original[index]] = index;

        invert(original, inverted, index + 1); // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N
        System.out.print("Enter the size of the array (N): ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        int[] inverted = new int[N];
        boolean[] seen = new boolean[N]; // to check for duplicates

        System.out.print("Enter " + N + " elements (permutation of 0 to " + (N - 1) + "):");

        // Input with validation
        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();

            if (value < 0 || value >= N) {
                System.out.println("Error: Value " + value + " is out of range (0 to " + (N - 1) + ").");
                return;
            }

            if (seen[value]) {
                System.out.println("Error: Duplicate value " + value + " found.");
                return;
            }

            arr[i] = value;
            seen[value] = true;
        }

        // Call recursive function
        invert(arr, inverted, 0);

        // Print inverted array
        System.out.println("Inverted array:");
        for (int i = 0; i < N; i++) {
            System.out.print(inverted[i] + " ");
        }
    }
}
