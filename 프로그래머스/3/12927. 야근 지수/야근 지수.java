import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Comparator.reverseOrder());

        for (int work : works) {
            pQ.add(work);
        }

        for(int i=0;i<n;i++){
            Integer maxWork = pQ.poll();
            if(maxWork == 0){
                return 0;
            }
            maxWork -= 1;
            pQ.add(maxWork);
        }
        int size = pQ.size();
        for(int i=0;i<size;i++){
            Integer tmp = pQ.poll();
            answer += (long) Math.pow(tmp,2);
        }

        return answer;
    }
}