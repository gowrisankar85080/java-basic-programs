class gowri{
    boolean prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
 public static void main(String[] args) {
     gowri f = new gowri();
     System.out.println(f.prime(3));
 }
}

