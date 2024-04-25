class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        int max = 0;
        
        int maxLen = -1;
        for(int cur : citations){
            if(maxLen < cur){
                maxLen = cur;
            }
        }
        
        for(int i=1;i<=maxLen;i++){
            int upCnt = 0;
            int downCnt = 0;
            for(int j=0;j<citations.length;j++){
                if(i >= citations[j]){
                    downCnt++;
                }
                if(i <= citations[j]){
                    upCnt++;
                }
            }
            
            if(i <= upCnt && i >= downCnt){
                if(max < i){
                    max = i;
                }
                
            }
            
        }
        
        return max;
    }
}