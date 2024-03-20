class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        int count = 0;
        
        
        
        for(int i=0;i<is_prefix.length();i++){
            if(arr.length < is_prefix.length()){
                break;
            }
            if(is_prefix.charAt(i) == arr[i]){
                count++;
            }else{
                count = 0;
                break;
            }
        }
        if(count > 0){
            answer = 1;
        }
        
        return answer;
    }
}