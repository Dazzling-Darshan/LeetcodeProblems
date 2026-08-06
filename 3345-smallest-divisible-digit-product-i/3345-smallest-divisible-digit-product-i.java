class Solution {
    public int smallestNumber(int n, int t) {


        for(int i=n;i<=100;i++){

            if(check(i,t)) return i;
        }  
        return -1; 
    }
    public boolean check(int num,int t){
        if(num== 100) return (0%t)==0;
        if(num<10) return (num%t)==0;
        if(num >9 && num <100){
            int d1 = num%10;
            num /= 10;
            int d2 = num;
            return ((d1*d2)%t)==0;

        }
        return false;
    }
}