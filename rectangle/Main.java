
package rectangle;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       
        System.out.println(" Input the size of the rectangles:");
        Rectangle [] rectangles = new Rectangle[input.nextInt()];
        for(int i = 0; i<rectangles.length; i++){
            System.out.println("Are you interasting to input the rectangle's height and width value. Please input (y/n) ");
              String str = input.next().toLowerCase();
            char choise = str.charAt(0);
            if(choise == 'y'){
                System.out.println("Set the Values of rectengle's height.");
                rectangles[i].setHeight(input.nextDouble());
             
               rectangles[i] = new Rectangle(input.nextDouble(),input.nextDouble());
                  System.out.println("Set the Values of rectengle's width.");
                rectangles[i].setWidth(input.nextDouble());
             
            }else{
             
              rectangles [i] = new Rectangle();
        }
        }
         input.close();
         System.out.println(" ");
         System.out.println("The rectanglea  are below:");
        for (int i =0; i<rectangles.length; i++){
            System.out.println("Rectangle "+(i+1)+" width "+rectangles [i].getWidth()+" height "+rectangles[i].getHeight());
            System.out.println("Rectangle "+(i+1)+" Area "+rectangles [i].getArea()+" Perimeter "+rectangles[i].getPerimeter());
            System.out.println(" ");
        }
       
    }
}
