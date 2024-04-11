class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char charArr[] = s.toCharArray();

        for(int i=0;i<s.length();i++){
            if(charArr[i] == 32){
                continue;
            }
            for(int j=0;j<n;j++) {
                charArr[i] = (char) (charArr[i] + 1);
                if(charArr[i] == 'z'+1){
                    charArr[i] = 'a';
                }
                else if(charArr[i] == 'Z'+1){
                    charArr[i] = 'A';
                }
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }
}