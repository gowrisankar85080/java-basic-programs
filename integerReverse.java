import java.util.*;
class integerReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;
        while(a!=0){
            int b = a%10;
             c = c*10+b;
             a = a/10;
        }
        System.out.println(c);

    }
}