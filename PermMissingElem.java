// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        int size = A.length;
        int count = 1;

        Arrays.sort(A);

        for (int i = 0; i < size; i++) {
            if (A[i] != count)
                return count;
            count++;
        }
        return count;
    }
}
