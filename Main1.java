
package main1;
public class Main1 {
    public static void main(String[] args) {
    Taxi x = new Taxi ("WEL123");
    x.run("I will go to Makati");
    x.printCurrentLocation();
    //x: 10 , y: 10
    x.book(10,10);
    x.run ("I am leaving on a jetplane");
    x.reachedDestination();
    System.out.println("Your Plate number is " + x.getTaxi());
    System.out.println(x.reachedDestination());
    }
}