import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stc = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums2){
           while(!stc.empty() && num>stc.peek()){
            map.put(stc.pop(),num);
         }
         stc.add(num);
      }
      int i=0;
      int[] res = new int[nums1.length];
      for(int num : nums1){
           res[i] = map.getOrDefault(num,-1);
           i++;
      }
      return res;
  }
}

