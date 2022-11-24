import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
             ar[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i%2 != 0){
                System.out.print(ar[i]+" ");
            }
            else{
                continue;
            }
        }
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                System.out.print(ar[i]+" ");
            }
            else{
                continue;
            }
        }

        }
}
