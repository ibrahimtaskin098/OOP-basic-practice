package genericArrayList;

import java.util.Arrays;



public class CustomGenericArrayList<T> {

    private static Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    private boolean isFull;

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public boolean isFull() {
   return data.length == size;
    }

    public void resize() {
         
            Object [] temp = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
  public T remove(){
     T removed = (T) (data[--size]);
     return removed;
  }
    public T get(int index){
        return  (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + ", isFull=" + isFull + '}';
    }

    
     
    public static void main(String[] args) {
//        ArrayList obj = new ArrayList();
//       CustomArrayList list = new CustomArrayList();
//       list.add(10);
//       list.add(40);
//       list.add(56);
//        for(int i=0 ; i< 14; i++){
//            list.add(i);
//        }
//        System.out.println(list);
            CustomGenericArrayList<Integer> list = new CustomGenericArrayList<Integer>();
                   for(int i = 0 ; i< 15 ; i++){
                       list.add(i *2);
                   }
                   System.out.println(list);
                   
                   
    }

}
