
package genericArrayList.Comparator;


public class GenericInterfaceMain implements GenericInterface<Integer> {


    @Override
    public void display(Integer value) {
        System.out.println(" This is the type of using generic in the interface."+value);
    }
       
    public static void main(String[] args) {
        GenericInterfaceMain obj = new GenericInterfaceMain();
       obj.display(6);
        
    }
}
