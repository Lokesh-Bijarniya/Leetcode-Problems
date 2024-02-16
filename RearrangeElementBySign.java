
    class Solution {
        public int[] rearrangeArray(int[] nums) {
            int[] arr = new int[nums.length];
            int posInd = 0, negInd = 1;
            for(int i=0; i<nums.length; i++){
                if(nums[i]>0){
                    arr[posInd] = nums[i];
                    posInd+=2;
                }
                else{
                    arr[negInd] = nums[i];
                    negInd+=2;
                }
            }return arr;
        }
    }

