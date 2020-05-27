public class CarOwner1 {
    public static void main (String[] args) {
        Car1 myCar1 = new Car1();
        myCar1.start();
        myCar1.stop();
        //gets result + returns "distance":
        // System.out.println (myCar1.drive(2));
        int cargo;
        cargo = myCar1.drive(2);
        //returns "distance":
        // System.out.println(cargo);
    }
}