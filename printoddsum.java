import java.util.*;
class printoddsum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        int count =0;
        for(int i =1;count<a;i++){
            if(i%2 !=0){
            System.out.println(i);
            sum=sum+i;
           
            count++;
            }
            }
             System.out.println("sum of first 100 odd numbers: "+sum);
        }
    }