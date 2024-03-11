package Staticexample;

public class StaticBlock {

    static int a = 5;
    static int b;

    static {
        System.out.println(" Static block run first");
        b = a + 5;
    }

   

    public static void main(String[] arg) {
           StaticBlock obj = new StaticBlock();
          System.out.println(StaticBlock.a+" "+StaticBlock.b);
          System.out.println(obj.b);
                 StaticBlock obj1 = new StaticBlock();
                 System.out.println(obj1.b
                 );
    }
}
