import java.util.*;
class jhonydob{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String res = "";
        if(c.equals("Male")){
            res = a.substring(0,1)+b.substring(0,2)+b.substring(3,5);
        }
        else{
            res = a.substring(0,1)+b.substring(0,2)+(Integer.toString(50+Integer.parseInt(b.substring(3,5))));
        }
    System.out.println(res);
    }
}
/* I: john
   25:07:2001
   female  male
 o:  j2557 j2507 */