public class Solution {
    public int solution(int X, int Y, int D) {
        
        int tmp;
    //    X+tmp*D>=Y;
    //    tmp*D>=Y-X;
        tmp=(Y-X)/D;
        if((Y-X)%D==0){
            return tmp;
        }
        else{
            return tmp+1;
        }

    }
}