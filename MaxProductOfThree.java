// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
		//IMPORTANT ACTION
        Arrays.sort(A);
        int pqrR = A[A.length-1]*A[A.length-2]*A[A.length-3];
        int pqrL = A[0]*A[1]*A[A.length-1];
        result = pqrR;
        if(pqrL > result){
            result = pqrL;
        }
        return result;
    }
}
