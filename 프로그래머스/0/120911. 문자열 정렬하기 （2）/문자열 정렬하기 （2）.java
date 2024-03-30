class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=65 && arr[i]<=90){
                arr[i] = (char)(32 + arr[i]);
            }
        }
        
        for(int i=0;i<arr.length-1;i++){
            int idx = i;
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[idx]) idx = j;
            }
            char tmp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = tmp;
        }
        
        answer = String.valueOf(arr);
        return answer;
    }
}