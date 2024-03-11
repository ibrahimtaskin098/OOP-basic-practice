
package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        
        Shapes  shape = new Shapes();
        Shapes square = new Square();
        Shapes tringle = new Tringle();
        Shapes circle = new Circle();
      
           square.area();
       
    }
}
