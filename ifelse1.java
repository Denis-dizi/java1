public class ifelse1 {
    public static void main (String[] arg) {
        System.out.print("if/else trying");
        // System.out.drive(7);
    }
    public void start (){
        System.out.println("Started");
    }
    // public static (){
    //     System.out.println("Hungry! Give me nachos!! ASAP!!!");
        // return eat();
    // }   
    int distance=0;
    int howlong=5;
    public int drive (int howlong){
        distance = distance + howlong*60;
        System.out.println("Have driven for a " + howlong + " hours and passed " + distance + " km.");
        return distance;
    }
}