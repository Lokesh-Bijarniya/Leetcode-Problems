public class BitwiseAndRangeOfNum {
   
        public int rangeBitwiseAnd(int left, int right) {
            int ans = 0;
       while(left != right){
           left = left/2;  //left>>1
           right = right/2; //right>>1
           ans=ans+1;
        }
         return left<<ans;
        }
    
    
}
