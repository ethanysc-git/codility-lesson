// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


class Solution {
 
	public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
	    int aLength = A.length;
	    // array to store counters
        int [] counters = new int[N];
        int maxCount = 0;
        int minCount = 0;
 
        for (int i = 0; i < aLength; i++) {
        	if (A[i] == N + 1) {
        		minCount = maxCount;
        	}
        	else {
        		// if the variable is less than what it should be, we update it
        		if (counters[A[i]-1] < minCount) {
        			counters[A[i]-1] = minCount;
        		}
        		// after the variable is updated, then we increment it
        		counters[A[i]-1] += 1;
        		// finally, we update max count if needed
        		if (maxCount < counters[A[i]-1]) {
        			maxCount = counters[A[i]-1];
        		}
        	}
 
        }
 
        // make sure that every variable in counter has at least the minimum value in it
        for (int i = 0; i < N; i++){
            if (counters[i] < minCount) {
        		counters[i] = minCount;
        	}
        }
 
        return counters;
    }
}
