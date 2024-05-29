class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String arr[] = polynomial.split(" ");
        int xCnt = -1;
        int constCnt = 0;
        
        for(String str : arr){
            if(str.contains("x")){
                xCnt = 0;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i].replace("+","");
            if(!arr[i].equals("") && arr[i].contains("x")){
                if(!arr[i].equals("x")){
                    xCnt += Integer.parseInt(arr[i].replace("x",""));
                }
                else{
                    xCnt += 1;
                }
            }
            else if(!arr[i].equals("")){
                constCnt += Integer.parseInt(arr[i]);
            }
        }
        
        if(xCnt > 1){
            answer += String.valueOf(xCnt)+"x";
        }
        else if(xCnt == 1){
            answer += "x";
        }
        
        if(xCnt >= 1 && constCnt != 0){
            answer += " + "+String.valueOf(constCnt);
        }
        else if(xCnt == 0 && constCnt != 0){
            answer += "+ "+String.valueOf(constCnt);
        }
        else if(xCnt == -1 && constCnt != 0){
            answer = String.valueOf(constCnt);
        }
        
        
        return answer;
    }
}