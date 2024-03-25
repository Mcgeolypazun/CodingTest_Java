class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int arrInt = Integer.parseInt(arr[i]);
            if(min > arrInt){
                min = arrInt;
            }
            if(max < arrInt){
                max = arrInt;
            }
        }
        answer = String.valueOf(min+" "+max);
        
        return answer;
    }
}