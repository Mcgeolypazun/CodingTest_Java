class Solution {
    public String solution(String my_string) {
        String answer = "";
        char arr[] = my_string.toCharArray();
        
        for(int i=0;i<my_string.length();i++){
            if(arr[i] == 'a'){
                arr[i] = '0';
            }
            if(arr[i] == 'i'){
                arr[i] = '0';
            }
            if(arr[i] == 'o'){
                arr[i] = '0';
            }
            if(arr[i] == 'u'){
                arr[i] = '0';
            }
            if(arr[i] == 'e'){
                arr[i] = '0';
            }
        }
        answer = String.valueOf(arr).replace("0","");
        
        return answer;
    }
}