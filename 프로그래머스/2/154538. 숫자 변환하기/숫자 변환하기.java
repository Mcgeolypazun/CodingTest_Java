import java.util.*;
class Solution {
    static Queue<Integer> q = new LinkedList<>();
    static Set<Integer> set = new HashSet<>();
    int BFS(int x,int y,int n) {
        q.offer(x);
        set.add(x);
        int lv = 1;
        
        while(!q.isEmpty()) {
            int size = q.size();
            
            for(int i=0;i<size;i++) {
                int cur = q.poll();
                
                int two = cur * 2;
                int three = cur * 3;
                int nn = cur + n;
                
                if(two > y && three > y && nn > y) return -1;
                if(two == y || three == y || nn == y) return lv;
                
                if(two < y && !set.contains(two)) {
                    set.add(two);
                    q.offer(two);
                }
                
                if(three < y && !set.contains(three)) {
                    set.add(three);
                    q.offer(three);
                }
            
                if(nn < y && !set.contains(nn)) {
                    set.add(nn);
                    q.offer(nn);
                }
            
                
            }
            lv++;
            
            
        }
        
        return -1;
        
    }
    
    public int solution(int x, int y, int n) {
        if(x == y) return 0;
        int answer = BFS(x,y,n);
        
        return answer;
    }
}