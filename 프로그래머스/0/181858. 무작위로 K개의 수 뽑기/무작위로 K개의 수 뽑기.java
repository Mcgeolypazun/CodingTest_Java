import java.util.concurrent.CopyOnWriteArrayList;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer;
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(list.isEmpty()) list.add(arr[i]);
            else if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
            if(list.size() == k) break;
        }
        
        if(list.size() < k){
            answer = new int[k];
            for(int i=0;i<list.size();i++){
                answer[i] = list.get(i);
            }
            for(int i=list.size();i<k;i++){
                answer[i] = -1;
            }
        }
        else{
            answer = new int[list.size()];
            for(int i=0;i<list.size();i++){
                answer[i] = list.get(i);
            }
        }
        
        
        return answer;
    }
}