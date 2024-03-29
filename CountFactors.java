// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {

        // main idea:
        // check from 1 to "sqrt_of_N" 
        // then, taking its pair into consideration
        // ---> numFactor = numFactor * 2;
        
        int sqrtN = (int) Math.sqrt(N); 
        int numFactor =0; // number of factors
        
        // check if i is a factor or not (by using N % i ==0)
        for(int i=1; i <= sqrtN; i++){
            if(N % i ==0){   
                numFactor++;
            }
        }
        
        numFactor = numFactor * 2; // add its pair
        
        // be careful: check if "sqrtN * sqrtN == N"
        if( sqrtN * sqrtN == N){   
            numFactor = numFactor -1; // minus one: avoid double counting
        }

        return numFactor;
    }
}
