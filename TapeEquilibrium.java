// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
public int solution(int[] A) {
    // write your code in Java SE 8
    // int idx = 0;
    int sumLeft = A[0];
    int sumRight = 0;
    for (int i = 1; i < A.length; i++) {
        sumRight += A[i];
    }
    int difMin = Math.abs(sumRight - sumLeft);
    int tempDif = 0;
    for (int i = 1; i < A.length - 1; i++) {
        sumLeft += A[i];
        sumRight -= A[i];
        tempDif = Math.abs(sumRight - sumLeft);
        if (tempDif < difMin) {
            difMin = tempDif;
            // idx = i+1;
        }
    }
    return difMin;
	//P < N, so at least one element should be left in the right part
}
}
