
package interfaces;


public class Main {
    
    public static void main(String[] args) {
     Car car = new Car();
     CDPlayer cdplayer = new CDPlayer();
     NiceCar nicecar = new NiceCar();
     nicecar.start();
     nicecar.musicStart();
     nicecar.upgradeEngine();
     nicecar.start();
     
//         cdplayer.start();
//         cdplayer.stop();
//      car.breake();
//      car.acc();
//      car.start();
//      car.stop();
    }
   
}
