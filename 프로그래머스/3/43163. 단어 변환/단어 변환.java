import java.util.*;
class Solution {
    static int min = Integer.MAX_VALUE;
    Queue<ArrayList<Integer>> q = new LinkedList<>();
    
    public void DFS(String begin, String target, String[] words,int cnt,String[] copy){
        if(min < cnt) return ;
        if(begin.equals(target)){
            cnt--;
            if(min > cnt){
                min = cnt;
            }
            return ;
        }
        
        for(int i=0;i<copy.length;i++){
            String[] copyWords = Arrays.copyOf(copy,copy.length);
            copyWords[i] = "-";
            if(copy[i].equals("-")) continue;
            String word = copy[i];
            int wordCnt = 0;
            
            for(int j=0;j<word.length();j++){
                char cWord = word.charAt(j);
                char cBegin = begin.charAt(j);
                
                if(cWord == cBegin) wordCnt++;
                
                if(wordCnt == word.length()-1){
                    DFS(word,target,words,cnt+1,copyWords);
                }
            }
        }
        
//         for(int i=0;i<copy.length;i++){
//             if(copy[i].equals("-")) continue;
//             for(int j=i+1;j<copy.length;j++){
//                 String copyWords[] = Arrays.copyOf(copy,copy.length);
//                 copyWords[j] = "-";
//                 String word = copy[j];
//                 int cntWord = 0;
//                 for(int k=0;k<word.length();k++){
//                     char cWord = word.charAt(k);
//                     char cBegin = begin.charAt(k);
                    
//                     if(cWord == cBegin) cntWord++;
                    
//                     if(cntWord == word.length()-1){
//                         DFS(word,target,words,cnt+1,copyWords);
//                     }
//                 }
//             }
//             for(int j=0;j<i;j++){
//                 String copyWords[] = Arrays.copyOf(copy,copy.length);
//                 copyWords[j] = "-";
//                 String word = copy[j];
//                 int cntWord = 0;
//                 for(int k=0;k<word.length();k++){
//                     char cWord = word.charAt(k);
//                     char cBegin = begin.charAt(k);
                    
//                     if(cWord == cBegin) cntWord++;
                    
//                     if(cntWord == word.length()-1){
//                         DFS(word,target,words,cnt+1,copyWords);
//                     }
//                 }
//             }
//         }
        
        
    }
    
    public int solution(String begin, String target, String[] words) {
        DFS(begin,target,words,1,words);
        if(min == Integer.MAX_VALUE) return 0;
        return min;
    }
}