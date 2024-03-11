
package classobjectconstructor;


public class ClassObjectConstructor {
    
    public static void main(String[] arg){
        
      
          Student kunal = new Student();
          final Student random = new Student();
                 Student one = new Student();
            Student two = one;
                 System.out.println(one.name);
                 System.out.println(two.name);
                 one.name = "somthing something";
                 System.out.println(two.name);
                 two.name = "bahu";
                 System.out.println(one.name);
         
                 final int bonus = 2;
                 
                 
                 
                 final Student babul = new Student();
                 babul.name = " name";
               Main obj;
              
           for(double i=0; i< 10; i++){
               obj = new Main("babul");
           }

           
           
           
           
                 
    }
}







class Student{
    
  
   String name;
   int roll;
   float marks;
   Student(){
      this("babul");
   }
   Student(String name, int roll, float marks){
       this.name= name;
       this.roll = 39;
       this.marks = 56.7f;
   }
   Student(String na){
      name = na; 
       
   }
   Student(Student type){
       this. name = type.name;
       this.marks = type.marks;
       this.roll = type.roll;
       
   }
   void method(String g){
       System.out.println(g+"hi"+name);
   }
   
   
  
}


 class Main{
     String name;
    public final  void method(){
      
       System.out.println(" hello");
       
       
   }
    Main (String name){
        this.name = name;
    }
    
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }

            
}
