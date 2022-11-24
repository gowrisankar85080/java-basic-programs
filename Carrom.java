import java.util.*;
class Carrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean flag=true;
        if(a<0&&a>9){
            System.out.println("Invalid Input");
            flag=false;
        }
        if(flag){
            char c=sc.next().charAt(0);
            if(c=='y'){
                System.out.println(a+5);
            }
        }
        else if(flag){
            char c=sc.next().charAt(0);
            if(c=='n'){
                System.out.println(a);
            }
        }
        }
    }

