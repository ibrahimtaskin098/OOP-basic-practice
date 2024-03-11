
package objectClone;

import java.util.Arrays;


public class Main {
    public static void main(String[] args)throws CloneNotSupportedException {
            Human kunal = new Human(34,"kunal",new int[] {1,2,3,4,5,6});
            Human twin = new Human(34,"kunal",new int[] {1,2,3,4,5,6});
//            Human twin = new Human(kunal);
            System.out.println(kunal.age+" "+kunal.name+" "+Arrays.toString(kunal.arr));
//           Human twin = (Human)kunal.clone();
           System.out.println(twin.age+" "+twin.name+" "+Arrays.toString(twin.arr));
         kunal.arr[0] = 100;
             System.out.println(kunal.age+" "+kunal.name+" "+Arrays.toString(kunal.arr));
              System.out.println(twin.age+" "+twin.name+" "+Arrays.toString(twin.arr));
    }
}
