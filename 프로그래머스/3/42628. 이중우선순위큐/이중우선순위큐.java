import java.util.*;

class Comp implements Comparator<Integer>{
    
    @Override
    public int compare(Integer a,Integer b){
        return b - a;
    }
}

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comp());
        
        for(int i=0;i<operations.length;i++){
            int cur = 0;
            if(operations[i].charAt(0) == 'I'){
                cur = Integer.parseInt(operations[i].replaceAll("[^-0-9]",""));
                minHeap.add(cur);
                maxHeap.add(cur);
            }
            else if(!minHeap.isEmpty() && operations[i].equals("D 1")){
                
                if(!maxHeap.isEmpty()){
                    int min = maxHeap.poll();
                    minHeap.remove(min);
                }
            }
            else if(!maxHeap.isEmpty() && operations[i].equals("D -1")){
                if(!minHeap.isEmpty()) {
                    int max = minHeap.poll();
                    maxHeap.remove(max); 
                }
            }
        }
        
        if(!minHeap.isEmpty()){
            answer[1] = minHeap.peek();
        }
        if(!maxHeap.isEmpty()){
            answer[0] = maxHeap.peek();
        }
        
        return answer;
    }
}