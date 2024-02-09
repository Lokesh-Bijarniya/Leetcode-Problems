import java.util.*;
class SetMisMatch1 {
    public static int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
   HashSet<Integer> set = new HashSet<>();
for(int i=0; i<nums.length; i++){
    if(set.contains(nums[i])){
       arr[0] = nums[i];
    }
  set.add(nums[i]);
    
}

for(int i=1; i<=nums.length; i++){
    if(!set.contains(i)){
        arr[1] = i;
        break;
      }
     } return arr;
}

   public static void main(String[] args) {
    int[] nums = {2,3,5,3,1};
    System.out.println(findErrorNums(nums));
   }
}