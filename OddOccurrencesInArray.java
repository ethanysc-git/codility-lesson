// you can also use imports, for example:
import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int goal = 0;

        java.util.Arrays.sort(A);
        for (int i = 0; i < A.length -2; i++) {
            if (A[i] != A[i + 1]) {
                goal = A[i];
                break;
            }
            i++;
        }

        if (goal == 0) {
            goal =  A[A.length - 1];
        }

        return goal;
    }
}
