class Solution {
    public boolean isPalindrome(int x) 
    {
        if (x<0)
        {
            return false;
        }
        else if (x<=9)
        {
            return true;

        }
        else
        {
            int temp=x;
            int res=0;
            while(temp!=0)
            {
                int rem=temp%10;
                res=res*10+rem;
                temp=temp/10;

            }
            if(res==x)
            {

                return true;
            }
            return false;
        }


        


        
    }
}
