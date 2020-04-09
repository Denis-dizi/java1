public class FishMaster {
    //see with Fish.java
    public static void main (String[] args) {
        Fish myFish = new Fish();
        myFish.dive(2);
        myFish.dive(97);
        myFish.dive(3);
        myFish.sleep();
        //Method overriding (suppresing) (p49/p56):
        String fishReaction;
        fishReaction = myFish.say("Hello");
        System.out.println(fishReaction);
    }
}
//Метод main() в классе FishMaster создает экземпляр объекта Fish и дважды вызывает его метод dive() с разными параметрами.
//The method main() instantiates the object Fish and calls its method dive() twice with different arguments.
