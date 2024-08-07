import java.util.*;
class Solution {
    public long solution(long n) {
        String numStr = Long.toString(n);

        char[] charArray = numStr.toCharArray();

        Arrays.sort(charArray);

        int lt = 0;
        int rt = charArray.length-1;
        while(lt < rt){
            char tmp = charArray[lt];
            charArray[lt] = charArray[rt];
            charArray[rt] = tmp;

            lt++;
            rt--;
        }

        String sortedNumStr = new String(charArray);
        long result = Long.parseLong(sortedNumStr);

        return result;
    }
}