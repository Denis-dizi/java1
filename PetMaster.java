public class PetMaster {
    //see with Pet.java
    //p43-Eng/p50-Ru
    public static void main (String[] args) {
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Njam");
        //p44-Eng/p51-Ru !!!
        // myPet.say("Njam Njam "); - not working
        // myPet.say(); - not working
        System.out.println(petReaction);
        myPet.sleep();
    }
}