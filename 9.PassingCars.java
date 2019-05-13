
public class Solution {

	public static void main(String[] args) {

		int[]A = new int[] {0, 1, 0, 1, 1};
		Solution s = new Solution();
		System.out.println(s.solution(A));
		
	}
	
	public int solution(int []A) {
		
		int count = 0;
        int tmp = 0;
        
        for(int car: A){
            if(car==0){
                tmp+=1;
            }
            if(tmp>0){
                if(car==1){
                    count+=tmp;
                    if(count>1000000000){
                        return -1;
                    }
                }
            }
        }
        return count;
		    
		
		
	}

}
