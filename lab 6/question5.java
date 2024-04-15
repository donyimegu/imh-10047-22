import java.util.*;
class PrintNumber{
    
    PrintNumber(Integer n,Float f,Double h){
       System.out.println("Wrapper Class Printing");
        System.out.println("Integer "+n);
        System.out.println("Float "+f);
        System.out.println("Double "+h);
    }    
    
       
    
}
public class q5 {
    public static void main(String[] args) {
        int n;
        double h;
        float f;
        
        
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        h=sc.nextDouble();
        f=sc.nextFloat();
        Integer num=new Integer(n);
        Float k= new Float(h);
        Double y=new Double(f);
        PrintNumber obj1=new PrintNumber(num,k,y);
        
        
    }
}
