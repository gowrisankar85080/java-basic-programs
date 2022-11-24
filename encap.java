
class data{
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        this.age = a;
    }
}


public class encap{
    public static void main(String[] args){
        data obj = new data();
        obj.setAge(5);
        System.out.println(obj.getAge());
    } 
}
