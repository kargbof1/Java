class TwoSumJava {
    public int[] twoSum(int [] nums,int target)
    {
        
        
        //add the last and the first ++
        Map<Integers,Integers> complements = new HashMap<>(); //Create a hashmap
        //loop through all the elements in the array
       for (int i = 0; i <nums.length;i++){
        //as we iterate to the next number check to see if it is not already on the map table 
        Integer complementIndex =complements.get(nums[i]); 
         if(complementIndex != null)
         {
            //this is when we find a match we show the index and the number
            return new int[]{i,complementIndex};
         }
         complements.put(target - num[i],i);

       }
       return nums;

    }
    
}
