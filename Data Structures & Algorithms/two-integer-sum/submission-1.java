class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(hashMap.containsKey(complement)){
                result[0] = hashMap.get(complement);
                result[1] = i;
            }

            hashMap.put(nums[i], i);
        }

        return result;
    }
}
