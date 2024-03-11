
package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;


public class ListExample {

    private static Collection<? extends Integer> ArrayList;
  
    public static void main(String[] args) {
        // Some usecases of arraylist
//   List<Integer> list = new ArrayList<>();
//          list.add(23);
//          list.add(56);
//          list.add(87);
//          System.out.println(list);
//          for(Integer i : list){
//              System.out.println(i);
//          }
        // Some use cases of vector.
//        List<Integer> vector = new Vector<Integer>();
//        
//        vector.add(34);
//        vector.add(87);
//        vector.add(0, 1);
//        
//         System.out.println(vector);
//         for(int i :vector){
//             System.out.println(i);
//         }
//        Some use cases of hashset.
//         Set<Integer> hashSet = new HashSet<Integer>();
//          hashSet.add(34);
//          hashSet.add(87);
//          hashSet.add(34);
//       
//          System.out.println(hashSet);
//          for(Integer i : hashSet){
//              System.out.println(i);
//////          }
//         Map<String,Integer> persons = new LinkedHashMap<>();
//         persons.put("kamal", 45);
//         persons.put("bokul", 76);
//         persons.put("rabbi",34);
//         System.out.println(persons);
//         for(String s : persons.keySet()){
//             System.out.println(s);
//         }
//         System.out.println("");
//         for(Integer i : persons.values()){
//             System.out.println(i);
//         }
//         System.out.println(" ");
//         for(String s : persons.keySet()){
//             System.out.println("Keys:  "+s+ " Values: "+persons.get(s));
//         }

         
    }
   
}


class HashMapExample{
    public static void method(){
      Map<String,Integer> persons = new LinkedHashMap<>();
         persons.put("kamal", 45);
         persons.put("bokul", 76);
         persons.put("rabbi",34);
         System.out.println(persons);
         for(String s : persons.keySet()){
             System.out.println(s);
         }
         System.out.println("");
         for(Integer i : persons.values()){
             System.out.println(i);
         }
         System.out.println(" ");
         for(String s : persons.keySet()){
             System.out.println("Keys:  "+s+ " Values: "+persons.get(s));  
    }
}
}