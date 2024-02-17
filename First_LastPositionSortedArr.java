class First_LastPositionSortedArr {
    public int[] searchRange(int[] nums, int target) {
        int left = findLeftmost(nums, target);
        int right = findRightmost(nums, target);
        
        return new int[]{left, right};
    }
    
    private int findLeftmost(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            
            if (nums[mid] == target) {
                index = mid;
            }
        }
        
        return index;
    }
    
    private int findRightmost(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            
            if (nums[mid] == target) {
                index = mid;
            }
        }
        
        return index;
    }
}

//Tc :- o(log(n))
//Sc :- o(1)