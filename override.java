
class AA{
    void display(){
        System.out.println("hello");
    }
}
class BB extends AA{
    @Override
     void display(){
        System.out.println("hello1");
    }
}
public class override {
   public static void main(String[] args){
   BB obj = new BB();
   obj.display();
   } 
}
