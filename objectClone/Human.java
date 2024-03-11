
package objectClone;


public class Human implements Cloneable {
       int age ;
       String name;
       int [] arr;
       public Human (int age, String name,int[] arr){
           this.age= age;
           this.name = name;
          this. arr = arr;
       }
       public Human(Human other){
           this.age= other.age;
           this.name=other.name;
       }
       @Override
       public Object clone() throws CloneNotSupportedException{
           
      Human twin = (Human)super.clone();
          
          twin.arr = new int[twin.arr.length];
          for(int i =0; i<twin.arr.length; i++){
              twin.arr[i] = this.arr[i];
          }
          return twin;
       }
       
}
