import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 1;
        String str1Low = str1.toLowerCase();
        String str2Low = str2.toLowerCase();
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        int cnt = 0;
        int uni = 0;
        
        for(int i=1;i<str1Low.length();i++){
            String s1 = String.valueOf(str1Low.charAt(i-1)).replaceAll("[^a-z]","");
            String s2 = String.valueOf(str1Low.charAt(i)).replaceAll("[^a-z]","");
            
            if(s1.length() == 0 || s2.length() == 0) continue;
            
            list.add(s1+s2);
            
        }
        
        for(int i=1;i<str2Low.length();i++){
            String s3 = String.valueOf(str2Low.charAt(i-1)).replaceAll("[^a-z]","");
            String s4 = String.valueOf(str2Low.charAt(i)).replaceAll("[^a-z]","");
            
            if(s3.length() == 0 || s4.length() == 0) continue;
            
            list2.add(s3+s4);
            
        }
        System.out.println(list);
        System.out.println(list2);
        
        if(list.size() == 0 && list2.size() == 0) return 65536;
        
        uni = list.size() + list2.size();
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list.get(i).equals(list2.get(j))){
                    cnt++;
                    uni--;
                    list2.remove(j);
                    break;
                }
                
            }
        }
        
        answer = (int)((double)cnt/(double)uni * 65536);
        
        return answer;
    }
}