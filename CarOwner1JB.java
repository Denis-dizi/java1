public class CarOwner1JB {
    public static void main (String[] args) {
        Car1JBondCar myCar = new Car1JBondCar();
        myCar.start();
        myCar.stop();
        //gets result + returns "distance":
        // System.out.println (myCar1.drive(2));
        int cargo;
        cargo = myCar.drive(2);
        //returns "distance":
        // System.out.println(cargo);
    }
}