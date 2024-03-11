
package Staticexample;
 
public class InnerClass {
   
    static class Test{
       String name;

        public Test(String name) {
           this.name = name;
        }
         public String toString(){
             return "aamal "+"babal";
         }
     }
     
     public static void main(String[] args){
        
        Test a = new Test("akash");
         Test b = new Test("babul");
         
          System.out.println(a);
         
         System.out.println(a.name+" "+b.name);
     }
}


