public class Solution {
	
	public Solution() {};

	public int solution(int N) {		
		int bG=0;
		while(N%2 == 0) {
			N/=2;
		}
		
		for (int i=0; N>0; N/=2) {
			if(N%2 == 0) {
				i++;
			}
			else {
				if(i>bG) {
					bG=i;
					i=0;
				}
			}
		}

		return bG;
	}
}