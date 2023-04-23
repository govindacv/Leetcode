class Solution {
    public int reverse(int x) 
    {
        long res=0;
        if (x<0)
        {
            int n=-(x);
            while(n>0)
            {
                int rem=n%10;
                 res=res *10+rem;
                 n=n/10;
                 
            }
            res =res *-1;
           

        }
        else
        
        {
             while(x>0)
            {
                int rem=x%10;
                 res=res *10+rem;
                 x=x/10;
            }
           


        }
        if (res >= Integer.MAX_VALUE || res<=Integer.MIN_VALUE)
        {
            return 0;
        }
        else
        {
            return (int)res;
        }
    }
}
