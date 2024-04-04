import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] charArr = a.toCharArray();
        
        for(int i=0;i<charArr.length;i++){
            if(charArr[i] >= 65 && charArr[i] <= 90){
                charArr[i] += (char) 32;
            }
            else{
                charArr[i] -= (char) 32;
            }
        }
        
        
        System.out.println(charArr);
    }
}