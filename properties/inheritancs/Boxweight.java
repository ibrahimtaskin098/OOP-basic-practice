
package properties.inheritancs;


public class Boxweight extends Box{
    double weight;
    Boxweight(){
      
        this.weight = -1;
    }
    Boxweight(double h,double l, double w,double weight){
        super(h,l,w); 
        this.weight= weight;
    
                 
    }
   Boxweight(Boxweight other){
       super(other);
       this.weight = other.weight;
   }
 
    
}






//
//class Boxprice extends Boxweight{
//    String colour;
//    Boxprice(){
//        this.colour = "red";
//    }
//    Boxprice(Boxprice other){
//        super(other);
//        this.colour = other.colour;
//    }
//
// Boxprice(String colour){
//     this.colour = colour;
// }
// Boxprice(String colour, Boxprice other){
//     super(other);
//     this.colour =colour;
// }
// Boxprice(int h, int w, int l, int weight,String colour){
//     super(h,w,l,weight);
//     this.colour = colour;
// }
//Boxprice(String colour, Boxweight other){
//    super(other);
//    this.colour = colour;
//}
//    
//}
//
//
