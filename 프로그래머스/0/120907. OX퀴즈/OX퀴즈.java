class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0;i<quiz.length;i++){
            answer[i] = "X";
        }
        
        for(int i=0;i<quiz.length;i++){
            String[] a = quiz[i].split(" ");
            
            if(a[1].equals("-")){
                int c1 = Integer.parseInt(a[0]) - Integer.parseInt(a[2]);
                if(c1 == Integer.parseInt(a[4])){
                    answer[i] = "O";
                }
            }
            else {
                int c1 = Integer.parseInt(a[0]) + Integer.parseInt(a[2]);
                if(c1 == Integer.parseInt(a[4])){
                    answer[i] = "O";
                }
            }
        }
            
        
        
        return answer;
    }
}