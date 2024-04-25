class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0;i<n;i++){
            answer[i] = "";
        }
        
        for(int i=0;i<n;i++){
            String tmp1 = Integer.toBinaryString(arr1[i]);
            String tmp2 = Integer.toBinaryString(arr2[i]);
            StringBuilder st1 = new StringBuilder(tmp1);
            StringBuilder st2 = new StringBuilder(tmp2);
            for(int j=0;j<n;j++){
                if(st1.length() < n){
                    st1.insert(0,"0");
                }
                if(st2.length() < n){
                    st2.insert(0,"0");
                }
            }
            
            System.out.println("st1 = "+st1+", st2 = "+st2);
            for(int j=0;j<n;j++){
                if(st1.charAt(j) == '1' || st2.charAt(j) == '1'){
                    answer[i] += "#";
                }else{
                    answer[i] += " ";
                }
            }
            
        }
        
        return answer;
    }
}