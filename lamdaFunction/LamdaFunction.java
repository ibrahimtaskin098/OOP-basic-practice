
package lamdaFunction;

import java.util.ArrayList;
import java.util.function.Consumer;


public class LamdaFunction {
          public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
              for(int i = 0; i<5 ;i++){
                  list.add(i);
              }
              // process normal to printing the items;
//            list.forEach((items) -> System.out.println(items * 2));
//              process with use consumer to printing the items
//             Consumer<Integer> fun = (items) -> System.out.println(items*2);
//            list.forEach(fun);
//             Operation sum = (a,b)->a+b;
//             Operation mul = (a,b) -> a*b;
//             Operation sub = (a,b) -> a-b;
//             LamdaFunction obj = new LamdaFunction();
//              System.out.println(obj.operate(5, 3, sub));
//              System.out.println(obj.operate(5, 3, mul));
//              System.out.println(obj.operate(5, 3, sum));
//             
             // some examples of lemda expressions.
            
         
//              MyAdd   Addition = (int a, int b) -> a+b;
//             Function = (int a) -> a*2;
//             
//              Conditional function = (int a, int a) -> {
//                  if(b==0) return 0;
//                 return a/b;
//              }
//                String = (String s) -> s.length();
//                Array = (int[] array) -> array.length;
//              
//              A objB = new B();
//              objB.method();
//            MyLemda   Greetings = () -> System.out.println("Hello!");
//              MyLemda objMyLemda = new MyLemdaClass();
//               Greetings.lemda();
//               objMyLemda.lemda();
//                C objC = new C() {
//            @Override
//            public void methodC() {
//                System.out.println("Hi!");
//            }
//        };
//           Thread obj = new Thread(new Runnable(){
//           
//              @Override
//              public void run(){
//                  System.out.println("Lemda is also entered in the thread.");
//              } 
//           });
//   
       Thread obj1 = new Thread(()-> System.out.println("Lemda is also entered in the thread"));
   obj1.run();
//The main method is finished in this line.
    }
         
          public static void showMethod(Test l){
               System.out.println(l.getLength("hello world"));
          }
          interface Test{
      int  getLength(String s);
          }
          
          
     private int operate(int a, int b, Operation op){
         return op.operation(a, b);
     }     
     //The class which  hold the min method is finished in here.
}
interface  Operation{
   int operation(int a , int b);
}


interface MyLemda{
    void lemda();
}

class MyLemdaClass implements MyLemda{
    @Override
    public void lemda(){
        System.out.println("Hello!");
    }
}

interface MyAdd{
     int method(int a , int b);   
}



interface A{
    void method();
}
class B implements A{
    @Override
  public void method(){
        System.out.println("Hi");
    }
}

interface C{
    void methodC();
} 
