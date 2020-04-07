public class Fish extends Pet {
    int currentDepth=0;
    public int dive (int howDeep) {
        currentDepth=currentDepth + howDeep;
        System.out.println("Diving for " + howDeep +" feet");
        System.out.println("I'm at " + currentDepth + " feet below see level");
        return currentDepth;
    }
}
//dive() - method has an argiment "howDeep".
//howDeep - argument tells how deep fish should go.
//currentDepth - class variable will store and update depth every call method "dive".
