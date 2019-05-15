
public class Solution {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		System.out.println(s.solution(23));
		System.out.println(s.solution(112323));
		System.out.println(s.solution(54623));
		System.out.println(s.solution(3));
		System.out.println(s.solution(12));
		System.out.println(s.solution(99122533));
		
	}
	
	public int solution(int x) {
		if(x<0) {
			return -1;
		}
		
		if(x<10) {
			return 0;
		}
		
		int tmp = x;
		String tmp1 = Integer.toString(tmp);
		char [] first = (tmp1.toCharArray());
		String nn = tmp1.substring(0, 1);
	//	System.out.println((first));
		for(int i=1; i<tmp1.length(); i++) {
			nn += 0;
		}
		
		return Integer.parseInt(nn);
		
	}

}
