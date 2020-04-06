public class PetMaster {
    //see with Pet.java
    public static void main (String[] args) {
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Njam");
        // myPet.say("Njam Njam "); - not working
        // myPet.say(); - not working
        System.out.println(petReaction);
        myPet.sleep();
    }
}