public class Solution {
	
	public int solution(int []A) {
		int sum=Math.abs(Sum(A));
		int l=Math.abs(A[0]);
		int r=Math.abs(sum-l);
		int difference = Math.abs(r-l);
		
		for(int i= 1; i<A.length; i++) {
			l+=Math.abs(A[i]);
			r-=Math.abs(A[i]);
			
			int nDifference = Math.abs(r-l);
			
			if(nDifference<difference) {
				difference=nDifference;
				
			}
		}
		return difference;
	}

	private int Sum(int[] a) {
		int s=0;
		for(int i=0; i<a.length; i++) {
			s+=a[i];
		}
		
		return s;
	}
	
	
}