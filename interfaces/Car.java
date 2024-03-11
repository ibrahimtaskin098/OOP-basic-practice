
package interfaces;


public class Car implements Engine, Break{
    @Override
    public void start(){
            System.out.println("Engine start like a normal car.");
            
    }
    @Override
    public void stop(){
            System.out.println("Engine stop like a normal car.");
            
    }
    @Override
    public void acc(){
            System.out.println("Engine accelerate like a normal car.");
            
    }
    @Override
    public void breake(){
            System.out.println("I break like a normal car.");
            
    }
   
}
