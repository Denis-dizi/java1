//practice (p/p58)
public class JamesBondCar extends Car {
    public int drive (int howlong){
        distance = distance + howlong*180;
        System.out.println("Mr Bond have driven for a " + howlong + " hours and passed " + distance + " km.");
        return distance;
}
}