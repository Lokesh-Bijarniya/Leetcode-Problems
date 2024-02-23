public class TwoJudge {
   
        public int findJudge(int n, int[][] trust) {
            int inDegree[] = new int[n+1];
            int outDegree[] = new int[n+1];
            for(int a[] : trust){
               outDegree[a[0]]++;
               inDegree[a[1]]++;
            }
            for(int i=1; i<=n; i++){
                if(inDegree[i] == n-1 && outDegree[i] == 0){
                    return i;
                }
            }
          return -1;  
        }
    } 

