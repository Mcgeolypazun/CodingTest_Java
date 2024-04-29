import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] strNumbers = new String[numbers.length];

        for(int i=0;i<strNumbers.length;i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1,String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        for(int i=0;i<strNumbers.length;i++){
            if(strNumbers[0].equals("0")) return "0";
            answer.append(strNumbers[i]);
        }

        return answer.toString();
    }
}