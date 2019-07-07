class TwoSum {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer,Integer> sub=new HashMap<>();
     for(int i=0;i<nums.length;++i){
         if(sub.containsKey(target-nums[i])){
             return new int[]{sub.get(target-nums[i]),i};
         }
         sub.put(nums[i],i);
     }
        throw new IllegalArgumentException("No two sum solution");
    }
}