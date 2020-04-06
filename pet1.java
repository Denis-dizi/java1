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