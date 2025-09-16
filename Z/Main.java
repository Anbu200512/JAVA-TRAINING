import java.util.*;
public class Main {
    static int[][] dp;
    static int solve(int[] arr, int i, int j) {
        if (i > j) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        int pickLeft = arr[i] + Math.min(solve(arr, i + 2, j), solve(arr, i + 1, j - 1));
        int pickRight = arr[j] + Math.min(solve(arr, i + 1, j - 1), solve(arr, i, j - 2));
        return dp[i][j] = Math.max(pickLeft, pickRight);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            dp = new int[N][N];
            for (int[] row : dp) Arrays.fill(row, -1);

            System.out.println(solve(arr, 0, N - 1));
        }
        sc.close();
    }
}
