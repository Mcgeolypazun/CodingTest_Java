import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer;
        List<Integer> arrList = new ArrayList<>();
        String Year_M_D[][] = new String [privacies.length][4];
        String year, month, day, termsValue;
        
        Map<String,String> map = new HashMap<>();
        
        for(int i=0;i<terms.length;i++){
            String a = "";
            String b = "";
            if(terms[i].length() == 3){
                 a = terms[i].substring(0,1).trim();
                 b = terms[i].substring(1,3).trim();
            }
            else if(terms[i].length() == 4){
                 a = terms[i].substring(0,1).trim();
                 b = terms[i].substring(1,4).trim();
            }
            else if(terms[i].length() == 5){//"B 100" 01234
                a = terms[i].substring(0,1).trim();
                b = terms[i].substring(1,5).trim();
            }
        
            map.put(a,b);
        }
        
        
        for(int i=0;i<privacies.length;i++){
            int tmp;
            year       = privacies[i].substring(0,4).replace("."," ").trim();   //년 2019
            month      = privacies[i].substring(5,7).replace("."," ").trim();   //월 02
            day        = privacies[i].substring(8,10).replace("."," ").trim();  //일 10
            termsValue = privacies[i].substring(11,12).replace("."," ").trim(); //약관종류 100
            
            int yearInt = Integer.parseInt(year);
            int monthInt = Integer.parseInt(month);
            int dayInt = Integer.parseInt(day);
            
            tmp = Integer.parseInt(month)+Integer.parseInt(map.get(termsValue));// 2+100 = 102
            monthInt = tmp;
            
            if(monthInt > 12){//102 > 12
                
                yearInt += monthInt/12; // 102/12 = 8 ->2027
                monthInt = monthInt % 12;// 102 % 12 = 6 
                dayInt -= 1; //9
                
            }
            else{
                dayInt -= 1;
            }
            if(monthInt == 0){
                monthInt = 12;
                yearInt -= 1;
            }
            if(dayInt == 0){
                dayInt = 28;
                monthInt -= 1;
            }
            if(monthInt == 0){
                monthInt = 12;
                yearInt -= 1;
            }
            year = String.valueOf(yearInt); // year = 2027
            if(monthInt < 10){//monthInt = 06
                
                month = "0" + String.valueOf(monthInt);
            }
            else{
                month = String.valueOf(monthInt);
                
            }
            if(dayInt < 10){//dayInt = 09;
                day = "0" + String.valueOf(dayInt);
            }
            else{
                day = String.valueOf(dayInt);
            }
            
            String calendar = year + month + day;//2027 + 06 + 09
            System.out.println(calendar + " = calendar");
            int calendarInt = Integer.parseInt(calendar);//20270609
            String todayString = today.replace(".","").trim();
            int todayInt = Integer.parseInt(todayString);//20200210
            
            
            if(calendarInt < todayInt){
                arrList.add(i+1);
            }
        }
        
        answer = new int[arrList.size()];
        for(int i=0;i<arrList.size();i++){
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}