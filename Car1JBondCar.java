public class Car1JBondCar extends Car1 {
    //Method overriding (suppresing) (p49/p56):
    int distance = 0;
    public int drive (int howlong){
        distance = howlong * 180;
        System.out.println("With speed 180mp/h James Bonds car driven " + distance + " miles.");
        return distance;
    }  
}