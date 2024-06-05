import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer;
        String[] idx = new String[]{"code","date","maximum","remain"};
        int compareIdx = 0;
        int standard = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> st = new ArrayList<>();
        
        for(int i=0;i<idx.length;i++){
            if(ext.equals(idx[i])){
                compareIdx = i;
            }
            if(sort_by.equals(idx[i])){
                standard = i;
            }
        }
        
        for(int i=0;i<data.length;i++){
            if(val_ext > data[i][compareIdx]){
                list.add(i);
                st.add(data[i][standard]);
            }
        }
        Collections.sort(st);
        answer = new int[list.size()][4];
        int k = 0;
        for(int i=0;i<st.size();i++){
            int tmp = st.get(i);
            for(int j=0;j<list.size();j++){
                if(tmp == data[list.get(j)][standard]){
                    answer[i] = data[list.get(j)];
                }
            }
        }
        
        
        
        
        return answer;
    }
}