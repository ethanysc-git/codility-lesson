// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        int diff = Y - X;
        if (diff % D == 0)
            return diff /D; 
        else
            return diff/D + 1;

    }
}
