
package properties.inheritancs;


public class Boxprice extends Boxweight {
    double cost;
    Boxprice(){
        super();
        this.cost = -1;
    }
    Boxprice(double h, double l, double w, double weight, double cost ){
        super(h,l,w,weight);
        this.cost = cost;
    }
    Boxprice(Boxprice other){
        super(other);
        this.cost= other.cost;
    }
}
