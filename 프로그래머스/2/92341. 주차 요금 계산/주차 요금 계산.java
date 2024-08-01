import java.util.*;
import java.time.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int basicHour = fees[0];
        int basicFee = fees[1];
        int overTime = fees[2];
        int overFee = fees[3];
        
        Map<String, Integer> carHours = new TreeMap<>();
        Map<String, LocalTime> enterCar = new HashMap<>();
        
        for (String record : records) {
            String[] parts = record.split(" ");
            LocalTime time = LocalTime.parse(parts[0]);
            String carNum = parts[1];
            String inOut = parts[2];
            
            if (inOut.equals("IN")) {
                enterCar.put(carNum, time);
            } else {
                LocalTime inTime = enterCar.remove(carNum);
                int minutes = (int) Duration.between(inTime, time).toMinutes();
                carHours.put(carNum, carHours.getOrDefault(carNum, 0) + minutes);
            }
        }
        
        // 처리되지 않은 IN 기록을 23:59 출차로 간주
        LocalTime endOfDay = LocalTime.of(23, 59);
        for (String carNum : enterCar.keySet()) {
            LocalTime inTime = enterCar.get(carNum);
            int minutes = (int) Duration.between(inTime, endOfDay).toMinutes();
            carHours.put(carNum, carHours.getOrDefault(carNum, 0) + minutes);
        }
        
        // 요금 계산
        int[] answer = new int[carHours.size()];
        int index = 0;
        for (int totalTime : carHours.values()) {
            if (totalTime <= basicHour) {
                answer[index++] = basicFee;
            } else {
                int overMinutes = totalTime - basicHour;
                int overUnits = (int) Math.ceil(overMinutes / (double) overTime);
                answer[index++] = basicFee + overUnits * overFee;
            }
        }
        
        return answer;
    }
}
