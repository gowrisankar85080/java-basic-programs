import java.util.*;
class evenUppercase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for(int i=0;i<a.length();i++){
            if(i%2==0){
                result = result+(a.charAt(i)+"").toUpperCase();
            }
            else{
                result = result+(a.charAt(i)+"");
            }
        }
        System.out.println(result);
    }
}
