class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=65 && arr[i]<=90){
                arr[i] = (char)(32 + arr[i]);
            }
        }
        
        for(int i=0;i<arr.length;i++){
            int idx = i;
            int min = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(min > arr[j]){
                    idx = j;
                    min = arr[j];
                }
            }
            char tmp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = tmp;
        }
        
        answer = String.valueOf(arr);
        return answer;
    }
}