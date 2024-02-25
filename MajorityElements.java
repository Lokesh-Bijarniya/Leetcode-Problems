class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int res = 0;
        int n = nums.length/2;
        for(int i : map.keySet()){
            if(map.get(i)>n){
                res=i;
            }
        }
        return res;
    }
}