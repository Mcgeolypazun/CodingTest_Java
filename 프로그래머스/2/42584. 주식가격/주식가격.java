import java.util.*;

class Order implements Comparable<Order>{
    public int val;
    public int idx;
    
    public Order(int val,int idx){
        this.val = val;
        this.idx = idx;
    }
    
    @Override
    public int compareTo(Order o){
        return o.val - this.val;
    }
}

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        PriorityQueue<Order> pQ = new PriorityQueue<>();
        pQ.add(new Order(prices[0],0));
        
        for(int i=1;i<prices.length;i++){
            while(!pQ.isEmpty() && pQ.peek().val > prices[i]){
                int idx = pQ.poll().idx;
                answer[idx] = i - idx;
            }
            pQ.add(new Order(prices[i],i));
        }
        
        for(Order o : pQ){
            answer[o.idx++] = prices.length - o.idx;
        }
        
        return answer;
    }
}