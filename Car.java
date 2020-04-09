public class Car {
    //practice (p50/p57)
    public void start (){
        System.out.println(
            "Started");
    }
    public void stop (){
        System.out.println(
            "Stoped");
    }
    int distance=0;
    public int drive (int howlong){
        distance = distance + howlong*60;
        System.out.println("Have driven for a " + howlong + " hours and passed " + distance + " km.");
        return distance;
    }
}