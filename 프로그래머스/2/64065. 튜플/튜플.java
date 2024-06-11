import java.util.*;

class CompareValue implements Comparator<Map.Entry<Integer,Integer>>{
    
    @Override
    public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
        return e2.getValue().compareTo(e1.getValue());
    }
}

class Solution {
    public int[] solution(String s) {
        String str = s.replaceAll("[/{/}/,]"," ");
        str = str.replaceAll("[ ]+"," ").trim();
        String[] strArr = str.split(" ");
        Map<Integer,Integer> map = new HashMap<>();
        
        
        for(int i=0;i<strArr.length;i++){
            map.put(Integer.parseInt(strArr[i]), map.getOrDefault(Integer.parseInt(strArr[i]),0)+1);
        }
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new CompareValue());
        int answer[] = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i).getKey();
        }
        
        return answer;
    }
}