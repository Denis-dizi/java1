/*p40-Eng/p46-Ru
class;
declare variables fur class attributes;
does method should take arguments and return a value?;
*/
public class pet1 {
    int age;
    float weighr;
    float height;
    String color;

    public void sleep (){
        // public - method can be called from any Java class;
        // void - it doesn't return any data
        // () - method doesn't hav any arguments (doesn't need any data from outside)
        System.out.println(
            "Good night, see you tomorrow");
    }
    public void eat (){
        System.out.println(
            "Hungry! Give me nachos!! ASAP!!!");
    }
    public String say(String aWord){
        String petResponse = "OK" +aWord;
            return petResponse;
    }
}