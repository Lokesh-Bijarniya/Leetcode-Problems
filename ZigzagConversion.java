public class ZigzagConversion {
    
        public String convert(String s, int numRows) {
            if(numRows == 1 || s.length()<=1){
                return s;
            }
            int n = s.length();
            String[] arr = new String[numRows];
            for (int i = 0; i < numRows; i++) {
                arr[i] = "";
            }
            int r = 0;
            boolean goDown = true;
            for(int i=0; i<n; i++){
                 arr[r]+=s.charAt(i);
                 if(goDown){ r++; }
                 else{ r--;}
                 if(r == numRows-1 || r==0){
                     goDown = !goDown;
                 }
                }
                String ans = "";
                for(String str : arr){
                    ans+=str;
                }
             return ans;
            }
        }
