package Staticexample;

import access.A;

public class Singleton {

    int a = 10;

    private Singleton() {
      
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
   
}

class Single {

    public static void main(String[] args) {
    
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        A a = new A(10, "kunal");
        a.getNum();
       

    }
}
