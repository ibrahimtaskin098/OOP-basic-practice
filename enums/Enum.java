package enums;


public class Enum {
    public static void main(String[] args) {
       Week week = Week.valueOf("Monday");
      week.days();
}


   
    
} 

interface Days{
    public void days();
}
   enum Week implements Days{
     Monday, Tuesday;
     @Override
     public void days(){
         System.out.println("This is "+this.name());
     }
   }