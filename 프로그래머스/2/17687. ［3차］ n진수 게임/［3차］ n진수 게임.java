class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder result = new StringBuilder();
        int num = t * m;
        int curNum = 0;
        int loop = 0;
        while(loop != num){
            String changeableNum = Integer.toString(curNum++,n);
            for(int i=0;i<changeableNum.length();i++){
                if(loop % m == p-1){
                    result.append(changeableNum.toUpperCase().charAt(i));
                }
                loop++;
                if(loop == num) break;
            }
        }

        return result.toString();
    }
}