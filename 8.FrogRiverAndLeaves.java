import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		int[]A = new int[8];
		A[0] = 1;
		A[1] = 3;
		A[2] = 1;
		A[3] = 4;
		A[4] = 2;
		A[5] = 3;
		A[6] = 5;
		A[7] = 4;
		
		
		int[]B = new int[] {1,2};
		int[]C = new int[] {1,2, 3};
		int[]D = new int[] {4,1,2, 3, 1, 1, 4, 5};

		System.out.println(s.solution(5, A));
		System.out.println();
		System.out.println(s.solution(2, B));
		System.out.println();
		System.out.println(s.solution(3, C));
		System.out.println();
		System.out.println(s.solution(5, D));
		System.out.println();
		System.out.println(s.solution(4, B));
		System.out.println();

	}
	
	public int solution(int X, int[]A) {
		Set <Integer> s1 = new HashSet<Integer>();
		int count=-1;
		for(int i=0; i<A.length; i++) {
			if(A[i]<=X) {
				s1.add(A[i]);
			}
			if(s1.size()==X) {
				count=i;
				break;
			}
			System.out.println(s1);
		}
		return count;		
	}
}
