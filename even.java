import java.util.*;
class even{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b=0;
     int c=0;
     int d =0;
     while(a!=0){
         b = a%10;
         a = a/10;
     if(b%2==0){
         c = c+b;
     }
     else{
         d = d+b;
     }
     }
  
    System.out.println(Math.abs(c-d));
    }
}