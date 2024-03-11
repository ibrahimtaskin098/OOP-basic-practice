package genericArrayList.Comparator;


public class Student implements Comparable<Student>  {
    public int roll;
    public double marks;
    
    public Student(int roll, double marks){
         this.roll = roll;
         this.marks = marks;
     }

    @Override
    public String toString() {
        return "Student{" + "roll=" + roll + ", marks=" + marks + '}';
    }

     
    @Override
    public int compareTo(Student o) {
        
        System.out.println("In compare to method");
// this statement sort it ascending order.
       int diff =+(int) (this.marks - o.marks);

//       int diff =-(int) (this.marks - o.marks);
//       this statement sort it sorting descending order
        return diff;
    }
    
}
