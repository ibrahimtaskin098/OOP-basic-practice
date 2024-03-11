
package properties.inheritancs;


public class Box {
  private   double l;
    double h;
    double w;
    

    static void greeting(){
        System.out.println(" hey I am in box class. Greeting!");
    }

    public double getL() {
        return l;
    }
    
    Box(){
        super();
      this.h = -1;
      this.l = -1;
      this.w = -1;
    }
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
        
    }
    Box( double h , double l, double w){
        System.out.println(" box class constructor");
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box (Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }
    
    public void information(){
        System.out.println("Running the box");
    }
}
