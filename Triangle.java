import java.util.*;

// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
    // we just need to check if A[i-2] + A[i-1] > A[i] (important)
        Arrays.sort(A);
        for(int i=2; i< A.length; i++){
            if((long)A[i-2] + (long)A[i-1] > (long)A[i]) {
                // note: using "long" for overflow cases
                return 1; 
            }
        }
        return 0;
    }
}
//each element of array A is an integer within the range [-2,147,483,648..2,147,483,647].
//int
//-2147483648（min）
//2147483647（max）
