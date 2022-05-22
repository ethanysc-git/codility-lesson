// you can also use imports, for example:
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors; 
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int result = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i+1) {
                return result;
            }
        }
        result = 1;
        return result;
    }
}
