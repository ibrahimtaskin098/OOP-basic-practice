
package abstractdemo;


public class Main {
    public static void main(String[] args) {
        Son obj = new Son(25);
        obj.career();
        
        Parent obj2 = new Son(236);
        obj2.normal();
        Daughter obj1 = new Daughter(26);
        obj1.career();
        
        Parent.hello();
        
       
}
}

