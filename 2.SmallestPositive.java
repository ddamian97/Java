// you can also use imports, for example:
// import java.util.*;

// you can write to  for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.HashSet;

class Solution {
	
	public Solution(int c) {};

    public int solution(int[] A) {
        int min = 1;
        
        //creaating new hashset
        HashSet<Integer> hs = new HashSet<Integer>();

        //adding elements form array to hashset
        for (int i = 0 ; i < A.length; i++) {
            hs.add(A[i]);                     
        }
        
        //looking for min in hashset
         while (hs.contains(min)) {
                min++;
            }

        return min;
    }
}