import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int len = people.length;
        Arrays.sort(people);
        int front = 0;
        int back = len - 1;
        int sum = 0;
        
        while (front <= back) { 
            
            if (people[front] + people[back] <= limit) {
                front++; 
            }
            
            back--; 
            answer++;
        }
        
        
        return answer;
    }
}