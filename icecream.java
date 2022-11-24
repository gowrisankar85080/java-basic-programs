// You are using Java
import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int q = 0; q < n; q++){
            int C = sc.nextInt();
            int P = sc.nextInt();
            int [] a = new int[P+1];
            for(int i = 1; i <= P;i++)
            a[i] = sc.nextInt();
            for(int i = 1; i <= P; i++){
                for(int j = i+1; j <= P; j++){
                    if(a[i]+a[j] == C){
                        System.out.println(i + " " + j);
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}


 