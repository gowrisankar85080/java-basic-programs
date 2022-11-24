import java.util.*;
class area{
    
      static int add(int a){
          int sum = a*a;
          return sum;
      }
      static double add(double c){
          double sum = 3.14*c*c;
          return sum;
      }
      static int add(int a,int b){
          int sum = a*b;
          return sum;
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        System.out.println(add(a));
        System.out.println((add(c)));
        System.out.println((add(a, b)));
    }
    }
    
        
    
