 import java.util.*;



class Solution {
    public int solution(int[] A) {
//    	it works inly if i had array with missing integer
        HashMap <Integer, Integer> hs = new HashMap<>();
        long l = A.length +1;
        long n = (l*(l+1))/2;

        long sum = 0L;
        
        for(int i: A){
            sum+=i;
        }
        
        int f = (int)(n-sum);
        
        return f;
        
    }
}