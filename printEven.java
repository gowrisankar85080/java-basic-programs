import java.util.*;
public class printEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count=0;
        for(int i=2;count<a;i++){
            if(i%2==0){
                System.out.println(i);
                count++;
            }
        }
    }
}
