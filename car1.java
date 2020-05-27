public class Car1 {
    public void start (){
        System.out.println("The car is started.");
    };
    public void stop (){
        System.out.println("The car is stoped.");
    };
    int distance = 0;
    public int drive (int howlong){
        distance = howlong * 60;
        System.out.println("With speed 60mp/h car driven " + distance + " miles.");
        return distance;
    }   
}