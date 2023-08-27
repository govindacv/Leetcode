class Solution {
	public  int diagonalPrime(int[][] nums) {
		Set<Integer> set = new TreeSet();
		int col = nums.length;
		for (int i = 0; i <= nums.length - 1; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i == j || ((i + j) == (nums.length - 1))) {

					System.out.println();
					if (isPrime(nums[i][j])) {

						set.add(nums[i][j]);
					}
				}
			}
		}

		int max = 0;

		for (int k : set) {
			max = k;
		}
		return max;
	}
    public boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        else if (num==2 || num==3)
        {
            return true;
        }
        else if (num%2==0 ||num%3==0)
        {
            return false;
        }
        for(int i=5 ;i<=Math.sqrt(num);i+=2)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
