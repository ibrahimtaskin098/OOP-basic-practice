
package access;

import java.util.logging.Logger;

public class ObjectDemo {
       
       int num;
       float gpa;
       public ObjectDemo(int num, float gpa){
           this.num = num;
           this.gpa = gpa;
       }
    
    
        
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

        
    
    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(23,56f);
        ObjectDemo obj1 = obj;
       if(obj==obj1){
           System.out.println("Object equal obj1");
       }
       if(obj.equals(obj1)){
           System.out.println("obj equal obj1");
       }
       
        System.out.println(obj.getClass());
       
       
       
    }
    
    
}
