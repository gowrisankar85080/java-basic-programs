import java.util.*;
class bala{
        String pattern(int n){
        String s="";
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(i+j>=n-1){
                 System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            for(int j=0;j<n;j++){
                if(i>j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                }
    System.out.println();
    }
    return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        bala s=new bala();
        s.pattern(a);
}
}
