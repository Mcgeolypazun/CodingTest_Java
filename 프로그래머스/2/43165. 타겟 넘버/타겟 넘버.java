class Solution {
    //static int count = 0;
    static int answer = 0;
    
    void DFS(int[] numbers,int target,int sum,int count){
        //System.out.println("sum = "+sum+", count = "+count);
        if(numbers.length == count){
            
            if(sum == target){
                answer++;
            }
            return ;
        }
        sum += numbers[count];
        count++;
        DFS(numbers,target,sum,count);
        count--;
        sum -= numbers[count];
        sum -= numbers[count];
        count++;
        DFS(numbers,target,sum,count);
        count--;
    }
    
    public int solution(int[] numbers, int target) {
        
        int count = 0;
        int sum = 0;
        DFS(numbers,target,sum,count);
        
        
        return answer;
    }
}