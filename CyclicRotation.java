// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int arrLength = A.length;
        int newIndex = 0;
        int[] rotatedArr = new int[arrLength];
        for(int i=0;i<A.length;i++) {
            newIndex = (i+K)%arrLength;
            rotatedArr[newIndex] = A[i];
		}
        return rotatedArr;
    }
}
