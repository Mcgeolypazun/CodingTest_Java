class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = Integer.toBinaryString(n);
        int aCnt = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == '1'){
                aCnt++;
            }
        }
        
        while(true){
            n++;
            String tmp = Integer.toBinaryString(n);
            int tmpCnt = 0;
            for(int i=0;i<tmp.length();i++){
                if(tmp.charAt(i) == '1'){
                    tmpCnt++;
                }
            }
            
            if(aCnt == tmpCnt){
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}