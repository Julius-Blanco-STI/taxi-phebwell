package main1;
public class Taxi { 
    private String taxi = "null";
    private int x =0;
    private int y =0;
    private int dest_x =0;
    private int dest_y = 0;
    public Taxi (String taxi){
    this.taxi =taxi;
    }
    public String getTaxi(){
    return this.taxi;    
    }
    public void setTaxi (String taxi){
    this.taxi = taxi;
    }
    public int getX(){
    return this.x;
    }
    public int getY(){
    return this.y;
    }
    public int getDest_x(){
    return this.dest_x;
    }
    public int getDest_y(){
    return this.dest_y;
    }
    public void run(String run){
    int run1 = run.length();
    for (int i = 0; i<run1; i++){
    if (run.charAt(i) =='a'){
     x++;
    }
     else if (run.charAt(i) =='i'){
     y++;
      }
    }
    }
    public void book (int dest_x, int dest_y){
    this.dest_x = dest_x;
    this.dest_y = dest_y;
    }
    public boolean reachedDestination(){
    if (x == dest_x &&  y == dest_y){
    return true;
    }
    return false;
}
    public void printCurrentLocation(){
    System.out.println ("Your current location is " +x +"," + y+ "");
    }
}

