import java.util.HashMap;

public class Solution {

	public Solution() {
		System.out.println("Solution");
	}
	
	public int solution(int []A) {
		HashMap <Integer, Integer> map = new HashMap<>();
		
		for (int i=0; i<A.length; i++) {
			if(map.containsKey(A[i])) {
				map.remove(A[i]);
			}
			else {
				map.put(A[i], 1);
			}
		}
		
		for(int key: map.keySet()) {
			return key;
		}
		
		return -1;
	}
	
	
	public int solution2(int [] A) {
		for(int i=0; i<A.length; i++) {
	//becouse I override value of second number of my pair by -1, I'm checking positive
			if(A[i]>0) {
				for(int j=i+1; j<A.length; j++) {
					if(A[j]==A[i]) {
						A[j]=-1;
						break;
					}
					if(j==A.length-1) {
						return A[i];
					}
				}
			}

		}
		return 0;
	}
}