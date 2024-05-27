import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Set<String> set = new HashSet<>();
        Map<String,Integer> map = new HashMap<>();

        for (int k = 0; k < want.length; k++) {
            set.add(want[k]);
            map.put(want[k], number[k]);
        }

        for(int i=0;i<=discount.length-10;i++){
            int cnt = 0;
            Map<String,Integer> copymap = new HashMap<>(map);

            for(int j=i;j<i+10;j++){
                if(!set.contains(discount[j])) break;
                else if(copymap.get(discount[j]) == null ||copymap.get(discount[j]) <= 0) break;
                copymap.put(discount[j], copymap.get(discount[j]) - 1);
                cnt++;
            }
            if(cnt == 10) answer++;
        }



        return answer;
    }
    
    
}