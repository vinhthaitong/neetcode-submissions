class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prefix = 1, postfix = 1;
        res[0] = prefix;

        for(int i = 0; i < nums.length - 1; i++){
            res[i + 1] = prefix * nums[i];
            prefix = res[i + 1];
        }

        for(int i = nums.length - 1; i >= 0; i--){
            res[i] = postfix * res[i];
            postfix = nums[i] * postfix;
        }

        return res;
    }
}  
