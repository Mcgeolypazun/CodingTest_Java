class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        StringBuilder str = new StringBuilder(A);
        int cnt = 0;
        if(str.toString().equals(B)) return 0;
        
        for(int i=0;i<str.length();i++){
            System.out.println(str);
            char c = str.charAt(str.length()-1);
            str.deleteCharAt(str.length()-1);
            str.insert(0,c);
            
            cnt++;
            System.out.println(str+" "+cnt);
            if(str.toString().equals(B)){
                answer = cnt;
                break;
            }
        }
        
        
        return answer;
    }
}