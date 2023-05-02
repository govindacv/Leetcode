class Solution {
    public int subtractProductAndSum(int n) 
    {
        int sumod=0,pod=1;
        while(n>0)
          
        {
            int rem=n%10;
            sumod= sumod+rem;
            pod=pod*rem;
            n=n/10;
        }
        return pod-sumod;

    }
}
