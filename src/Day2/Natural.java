package Day2;
import java.util.Scanner;
public class Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive natural number N: ");
        int N = scanner.nextInt();

        System.out.println("Possible consecutive number combinations whose sum is " + N + ":");

        // Iterate through consecutive numbers to find combinations
        for (int i = 1; i <= N / 2 + 1; i++) {
            int sum = 0;
            int j = i;

            // Keep adding consecutive numbers until the sum is greater than or equal to N
            while (sum < N) {
                sum += j;
                j++;

                // If the sum is equal to N, print the combination
                if (sum == N) {
                    printCombination(i, j - 1);
                    break;
                }
            }
        }

        scanner.close();
    }

    // Helper method to print consecutive number combinations
    private static void printCombination(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

	}


