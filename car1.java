public class car1 {
    public void start (){};
    public void stop (){};
    public int drive (int howlong){
        int distance = 0;
        distance = howlong * 60;
        System.out.println("With speed 60mp/h car driven" + distance + "miles.");
        return distance;
    }   
}