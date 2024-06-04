import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int maxHealth = health;
        Set<Integer> set = new TreeSet<>();
        int timeMax = Integer.MIN_VALUE;
        for(int i=0;i<attacks.length;i++){
            if(attacks[i][0] > timeMax){
                timeMax = attacks[i][0];
            }
            set.add(attacks[i][0]);
        }
        
        
        int HealTime = 1;
        int attackIdx = 0;
        for(int time=1;time<=timeMax;time++){
            if(set.contains(time)){
                health -= attacks[attackIdx][1];
                attackIdx++;
                HealTime = 1;
                if(health <= 0) return -1;
            }
            else{
                if(HealTime != bandage[0]){
                    health += bandage[1];
                    HealTime++;
                }else{
                    health += bandage[1] + bandage[2];
                    HealTime = 1;
                }
                
                if(health > maxHealth){
                    health = maxHealth;
                }
            }
        }
        
        if(health <= 0) return -1;
        
        answer = health;
        
        return answer;
    }
}