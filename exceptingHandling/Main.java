
package exceptingHandling;
 




public class Main {
    public static void main(String[] args) {
        int a= 5;
        int b = 0;
        try{
//           divide(a,b);
           String name = "kunal";
           if(name.equals("kunal"))
               throw new MyException("My name is kunal");
          
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
          
        }
        catch(Exception e){
            System.out.println("Normal exception");
        }
       finally{
            System.out.println("It will always execute.");
        }
    }
            
      static int divide(int a , int b)throws ArithmeticException{
          if (b==0){
              throw new ArithmeticException("Please do not divide by zero");
          }
          return a/b;
      }                      
}
