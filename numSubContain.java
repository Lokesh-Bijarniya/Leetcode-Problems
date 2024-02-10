class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int start=0, counter=0, ans=0;
       for(int end=0; end<s.length(); end++){
           if(map.getOrDefault(s.charAt(end),0) == 0){
                 counter++;
           }
           map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
           while(counter == 3){
               char beg = s.charAt(start);
               ans += s.length()-end;
               map.put(beg,map.get(beg)-1);
               if(map.get(beg)==0){
                   counter--;
               }
               start++;
           }
       }
       return ans;
    }
}

