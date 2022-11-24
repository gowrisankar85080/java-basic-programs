import java.util.*;
public class primenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int f = 0;
        for (int n = 1; n <= b; n++) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    f++;
                }
            }
            if (f == 2) {
                System.out.println(n + "prime number");
            }
            f = 0;
        }
    }
}