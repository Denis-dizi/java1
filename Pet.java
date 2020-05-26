/*p40-Eng/p46-Ru
class;
declare variables fur class attributes;
does method should take arguments and return a value?;
*/
public class Pet {
    int age;
    float weighr;
    float height;
    String color;

    public void sleep (){
        // public - method can be called from any Java class;
        // void - it doesn't return any data
        // () - method doesn't hav any arguments (doesn't need any data from outside)
        // static - you don’t have to create an instance (a copy ) of object in memory to use this method.
        System.out.println(
            "Good night, see you tomorrow.");
    }
    public void eat (){
        System.out.println(
            "Hungry! Give me nachos!! ASAP!!!");
    }
    public String say(String aWord){
        // p43/p49 !!!!
        String petResponse = "OK. " +aWord;
           return petResponse;
    }
}