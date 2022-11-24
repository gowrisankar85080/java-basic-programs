import java.util.*;
class abhi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a= "MANGO";
        int Abi=0;
        int ram=0;
        for(int i=0;i<a.length();i++){
            char at=a.charAt(i);
            if(at=='A'||at=='E'||at=='I'||at=='O'||at=='U'){
                String b=a.substring(i);
                ram=ram+b.length();
            }
            else{
                String b=a.substring(i);
                Abi=Abi+b.length();
            }
        }
        if(Abi>ram){
            System.out.println("Abhi "+Abi);
        }
        else{
            System.out.println("Ramu "+Abi);
        }
    }
}