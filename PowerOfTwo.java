class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        } else{
            while(n%2 == 0){
                n = n/2;
            } return n == 1;
        }
    }
}

//Tc :- o(log2(n));
//Sc :- o(1);
