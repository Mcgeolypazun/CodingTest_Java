class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = "";
        }
        int idx = 0;
        for(int i=0;i<picture.length;i++){
            
            for(int j=0;j<picture[i].length();j++){
                for(int z=0;z<k;z++){
                    answer[i+idx] += picture[i].charAt(j);
                }
            }
            for(int z=1;z<k;z++){
                answer[i+idx+z] = answer[i+idx];
            }
            idx += k-1;
        }
        
        return answer;
    }
}