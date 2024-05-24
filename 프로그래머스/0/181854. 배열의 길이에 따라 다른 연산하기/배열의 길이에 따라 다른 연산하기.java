class Solution {
    public int[] solution(int[] arr, int n) {
        int num;
        if(arr.length % 2 == 0){
            num = 1;
        }
        else{
            num = 0;
        }
        
        for(int i=num;i<arr.length;i+=2){
            arr[i] += n;
        }
        
        return arr;
    }
}