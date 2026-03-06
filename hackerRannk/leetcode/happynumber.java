class Solution {
    public static  int sqr(int n)
{
    int res=0,rem=0;
    while (n>0) {
        rem=n%10;
        res+=(rem*rem);
        n=n/10;
    }
return res ;
}
    public boolean isHappy(int n) {
int slow=n;
int fast=n;
        do{
            slow=sqr(slow);
            fast=sqr(sqr(fast));
        }while(slow!=fast);
        return slow==1;
    }
}