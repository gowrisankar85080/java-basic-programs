import java.util.*;
import java.io.*;
public class oddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 1; count < a; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                count++;
            }
        }
        System.out.println(sum);
    }

}

