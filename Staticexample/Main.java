
package Staticexample;

public class Main {
    public static void main(String[] args){
       Human kunal = new Human(22,"kunal",20000,false);

       Human babul = new Human(33,"babul",30000,true);
       Human arpit = new Human(35,"arpit",30000,true);
        System.out.println(Human.population);
       System.out.println(Human.population);
        System.out.println(Human.population);
      Main funn = new Main();
      funn.fun2();
     
       
    }
    
    
    static void fun(){

        
        
        Main obj = new Main();
        obj.greeting();
    }
    
    void fun2(){
        greeting();
    }
    
    void greeting(){
        fun();
        System.out.println(" Hello world");
    }
}
