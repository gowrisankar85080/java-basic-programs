import java.io.*;
import java.util.*;
public class Julius{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 11;
        String word = "middle-outz";
        int rotation = 2;
        StringBuilder encryptedWord = new StringBuilder("");
        for(char c : word.toCharArray())
        {
            if(c >= 'a' && c <= 'z')
                encryptedWord.append((char) ('a'+(((c-'a')+rotation)%26)));
            else if(c >= 'A' && c <= 'Z')
                encryptedWord.append((char) ('A'+(((c-'A')+rotation)%26)));
            else
                encryptedWord.append(c);
        }
        System.out.println(encryptedWord);
    }
}