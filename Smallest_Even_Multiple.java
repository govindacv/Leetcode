class Solution {
    public int smallestEvenMultiple(int n) 
    {
        int i=1;
        for(i=1;;i++)
        {
            if (i%n==0 && i%2==0)
            {
                break;
            }
        }
        return i;
        

        
    }
}
