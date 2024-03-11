
package abstractdemo;

public abstract class Parent {
    int age;
    public Parent(int age){
        this.age = age;
    }
    
    
    public static void hello(){
        System.out.println("Hey");
    }
       void normal(){
           System.out.println(" Nomal");
       }   
    public abstract void career();
    public abstract void partner();

    
}
