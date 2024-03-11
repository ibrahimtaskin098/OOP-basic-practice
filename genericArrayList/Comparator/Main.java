package genericArrayList.Comparator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//         Student kunal = new Student(12, 89.85);
//     Student rahul = new Student(6, 86.56);
//  
//     if (kunal.compareTo(rahul)>0){
//         System.out.println(kunal.compareTo(rahul) );
//          System.out.println("Kunal gets greater marks than rahul");
//            
//}            else{
//           System.out.println("Rahul gets greater marks than kunal. ");
//}
        Student kunal = new Student(12, 79.67);
        Student rahul = new Student(17, 89.67);
        Student arpit = new Student(32, 69.67);
        Student karan = new Student(19, 97.67);

        Student[] array = {kunal, rahul, arpit, karan};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }

}
