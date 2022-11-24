import java.util.*;
class Pattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
            if(i<=j){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
            }
    System.out.println();
    }
}
}
