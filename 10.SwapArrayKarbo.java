
public class Solution {

	public static void main(String[] args) {
		
		int[] A = new int[] {1, 2, 3, 4, 5, 6};
					//		 1, 6, 2, 5, 3, 4
		int[] B = new int[] {1, 2, 3, 4, 5, 6, 7};
					//		 1, 7, 2, 6, 3, 5, 4
		Solution s = new Solution();
	//	s.solution(A);
	//	s.solution(B);
		
		String c = "12345";
		char[]cha = new char[c.length()];
		int []C = new int[5];
		
		for(int i=0; i<c.length(); i++) {
			int tmp = Integer.parseInt(c.substring(i, i+1));
			C[i]=tmp;
		//	System.out.println(tmp);
		}
		for(int i=0; i<C.length; i++) {
			System.out.println(C[i]);
		}
		String d = "1, 2, 3, 4, 5,";
		System.out.println(d);
		d = d.replace(",", "");
		d = d.replace(" ", "");
		System.out.println(d);
		
		

		
	}
	
	public int[] solution(int[]A) {
		
		
		int[]B = new int[A.length];
		int[]C = new int[A.length];
		int first=0;
		int last=A.length;
		for(int i=0; i<A.length; i++) {
			B[i]=A[first];
			B[i+1]=A[last-1];
			i++;
			first++;
			last--;
			for(int b: B) {
				System.out.println(b);
			}
			System.out.println();
			
		}
		return B;
	}

}
