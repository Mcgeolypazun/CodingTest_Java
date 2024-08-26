import java.util.*;
class Solution {
    long findNum(long num) {
    // num을 2진수 문자열로 변환합니다.
    String str = Long.toBinaryString(num);
    
    // 모든 비트가 '1'인 경우를 위한 플래그
    boolean allOnes = true;
    
    // 가장 오른쪽의 '0' 비트를 찾고, '1'로 바꾸는 작업을 수행합니다.
    for(int i = str.length() - 1; i >= 0; i--) {
        if(str.charAt(i) == '0') {
            allOnes = false; // '0'을 발견했으므로 allOnes는 false
            break;
        }
    }

    if (allOnes) {
        // 모든 비트가 '1'인 경우 처리, 가장 왼쪽에 '10'을 추가
        str = "10" + str.substring(1); // 가장 왼쪽에 "10"을 추가
    } else {
        // 그렇지 않은 경우, 가장 오른쪽의 '01'을 '10'으로 바꿉니다.
        int zeroIndex = str.lastIndexOf('0'); // 가장 오른쪽 '0'의 인덱스를 찾음
        int oneIndex = str.indexOf('1', zeroIndex); // 그 다음의 '1'을 찾음
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(zeroIndex, '1'); // '0'을 '1'로 변경
        sb.setCharAt(oneIndex, '0'); // '1'을 '0'으로 변경
        str = sb.toString();
    }

    // 2진수 문자열을 다시 long 형으로 변환하여 반환합니다.
    return Long.parseLong(str, 2);
}




    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i=0;i<numbers.length;i++) {
            long num = numbers[i];
            
            if(num % 2 == 0) {
                answer[i] = num + 1;
            }
            else {
                answer[i] = findNum(num); 
            } 
        }

        return answer;
    }
}