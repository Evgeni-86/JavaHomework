//70. Climbing Stairs
import java.util.*;

public class ClimbingStairs_70 {
    public static void main(String[] args) {
        int climp = 1;
        System.out.println(climbStairs(climp));
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return n;
        }
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
