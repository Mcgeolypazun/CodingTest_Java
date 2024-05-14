class Solution {
    public int solution(int chicken) {
        int coupon = 0;
        
        for(int i=10;i<=chicken+coupon;i+=10){
            coupon++;
        }
        
        return coupon;
    }
}