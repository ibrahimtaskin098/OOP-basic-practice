
package properties.polymorphism;


public class PrintObject {
    
    
     int num;
    public static void main(String[] args) {
       
        PrintObject obj = new PrintObject();
          System.out.println(obj);      
    }

    @Override
    public String toString() {
        return "PrintObject{" + "num=" + num + '}';
    }

   
   
}
