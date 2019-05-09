
public class Solution {
	

	public static void main(String[] args) {

		int[]A = new int[] {1, 2, 3, 4};
		int[]B = new int[] {4, 1, 2, 3};
		int[]C = new int[] {4, 1, 3};
		int[]D = new int[] {4, 4, 4};
		int[]E = new int[] {1, 1, 1, 7};
		int[]F = new int[] {-1, -2, -3, -4};

		Solution so = new Solution();
		
		System.out.println(so.solution(A));
		System.out.println(so.solution(B));
		System.out.println(so.solution(C));
		System.out.println(so.solution(D));
		System.out.println(so.solution(E));
		System.out.println(so.solution(F));
		
	}
	
	public int solution(int []A) {
		
		
		int[]B = new int[A.length+1];
		
		for(int i=0; i<A.length; i++) {
			if(A[i]<1 || A[i]>A.length) {
				return 0;
			}
			if(B[A[i]]==1) {
				return 0;
			}
			else {
				B[A[i]]=1;
			}
		}
		return 1;
		
		
	}

}
