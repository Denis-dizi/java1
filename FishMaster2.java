public class FishMaster2 {
    //see with Fish2.java
    public static void main (String[] args) {
        Fish2 myFish = new Fish2();
        myFish.dive(2);
        myFish.dive(3);
        myFish.sleep();
        myFish.eat();
        System.out.println(myFish.say("You!"));
        // or:
        String fishSay;
        fishSay = myFish.say("Bu!");
        System.out.println(fishSay);
    }
}
//Метод main() в классе FishMaster создает экземпляр объекта Fish и дважды вызывает его метод dive() с разными параметрами.
//The method main() instantiates the object Fish and calls its method dive() twice with different arguments.
