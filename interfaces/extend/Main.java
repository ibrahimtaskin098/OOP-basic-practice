
package interfaces.extend;


public class Main implements B{

  @Override
 public  void fun(){
       System.out.println("It is just a fun. ");
   }
  @Override
  public void greet(){
       System.out.println("It is just a method.");
   }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        obj.greet();
        B.method1();
    }
}