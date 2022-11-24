// You are using Java
import java.util.*;
class grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int grade = sc.nextInt();
            if(grade>=38){
                if(grade%5 >= 3){
                    grade+= 5-(grade%5);
                }
            }
        System.out.println(grade);
        }
    }
}
/* input: 4
          73    75
          67    67
          38    40
          33    33 */