class Parents{
    void showParent(){
        System.out.println("Hi i am parent ");
    }    
}  
class Child extends Parents{
    void showChild(){
        System.out.println("Hi i am Child");
    }
}    
public class Q1 {
    public static void main(String[] args) {
        Child  t=new Child();
        t.showChild();
        t.showParent();
    }
    
}
