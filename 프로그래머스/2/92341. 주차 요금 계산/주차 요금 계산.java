import java.util.*;
import java.time.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        int baseTime = fees[0];
        int baseFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        
        Map<String, Integer> parkingTime = new HashMap<>();
        Map<String, LocalTime> inTime = new HashMap<>();
        
        for (String record : records) {
            String[] parts = record.split(" ");
            LocalTime time = LocalTime.parse(parts[0]);
            String carNumber = parts[1];
            String action = parts[2];
            
            if (action.equals("IN")) {
                inTime.put(carNumber, time);
            } else {
                LocalTime entryTime = inTime.remove(carNumber);
                int parkedMinutes = (int) Duration.between(entryTime, time).toMinutes();
                parkingTime.put(carNumber, parkingTime.getOrDefault(carNumber, 0) + parkedMinutes);
            }
        }
        
        
        LocalTime endTime = LocalTime.of(23, 59);
        for (Map.Entry<String, LocalTime> entry : inTime.entrySet()) {
            String carNumber = entry.getKey();
            LocalTime entryTime = entry.getValue();
            int parkedMinutes = (int) Duration.between(entryTime, endTime).toMinutes();
            parkingTime.put(carNumber, parkingTime.getOrDefault(carNumber, 0) + parkedMinutes);
        }
        
        
        Map<String, Integer> parkingFee = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : parkingTime.entrySet()) {
            String carNumber = entry.getKey();
            int totalTime = entry.getValue();
            int fee = calculateFee(totalTime, baseTime, baseFee, unitTime, unitFee);
            parkingFee.put(carNumber, fee);
        }
        
        
        int[] answer = new int[parkingFee.size()];
        int i = 0;
        for (int fee : parkingFee.values()) {
            answer[i++] = fee;
        }
        
        return answer;
    }
    
    private int calculateFee(int totalTime, int baseTime, int baseFee, int unitTime, int unitFee) {
        if (totalTime <= baseTime) {
            return baseFee;
        } else {
            int extraTime = totalTime - baseTime;
            int extraUnits = (int) Math.ceil((double) extraTime / unitTime);
            return baseFee + extraUnits * unitFee;
        }
    }
}