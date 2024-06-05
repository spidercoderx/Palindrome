import java.util.Scanner;

public class LargeDifferences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();  // Number of test cases
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();  // Length of the array
            int K = scanner.nextInt();  // Maximum possible value in the array

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            int initialSum = 0;
            for (int i = 0; i < N - 1; i++) {
                initialSum += Math.abs(A[i] - A[i + 1]);
            }

            int maxSum = initialSum;

            for (int i = 0; i < N; i++) {
                if (i > 0) {
                    maxSum = Math.max(maxSum, initialSum - Math.abs(A[i] - A[i - 1]) + Math.abs(1 - A[i - 1]));
                    maxSum = Math.max(maxSum, initialSum - Math.abs(A[i] - A[i - 1]) + Math.abs(K - A[i - 1]));
                }
                if (i < N - 1) {
                    maxSum = Math.max(maxSum, initialSum - Math.abs(A[i] - A[i + 1]) + Math.abs(1 - A[i + 1]));
                    maxSum = Math.max(maxSum, initialSum - Math.abs(A[i] - A[i + 1]) + Math.abs(K - A[i + 1]));
                }
            }

            System.out.println(maxSum);
        }

        scanner.close();
    }
}
