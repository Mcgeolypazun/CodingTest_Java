class Solution {
    
    
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        int pieces = 6;
        int people = n;
        while(true){
            if(people == pieces){
                return cnt;
            }
            else if(people > pieces){
                cnt++;
                pieces = pieces + 6;
            }
            else{
                people = people + n;
            }
        }
        
    }
}