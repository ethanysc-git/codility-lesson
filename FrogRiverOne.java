// you can also use imports, for example:
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors; 
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int result = -1;
        Set<Integer> set = new HashSet<Integer> (); 
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if (set.size() == X) {
                result = i;
                break;
            }
        }
        return result;
    }
}
