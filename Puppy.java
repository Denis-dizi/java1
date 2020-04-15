public class Puppy {
//http://proglang.su/java/classes-and-objects
    public Puppy(String name){
        // Это конструктор и у него один параметр, name.
        System.out.println("Sending name:" + name ); 
     }
     public static void main(String []args){
        // Создание объекта myPuppy.
        Puppy myPuppy = new Puppy( "Bagett" );
     }
}