// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.ArrayList;
import java.util.List;

class Solution {
	public int solution(int N) {
		int gap = 0;
		String arr [] = Integer.toBinaryString(N).split("");
		
		List<Integer> numList = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("1")) {
				numList.add(i);	

			}
		}

		for(int i=0;i<numList.size()-1;i++) {	
			int count = numList.get(i+1)-(numList.get(i)+1);
			if(count>gap) {
				gap=count;
			}
		}
		
		return gap;
	}
}
