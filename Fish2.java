public class Fish2 extends Pet {
    //p47/p54-Ru
    // Inheritance (наследование) (p45-Eng/p52-Ru)
    // extends - keyword to inherit attributes from other class:
    // class Fish extends Pet {}
    int currentDepth=0;
    public int dive (int howDeep) {
        currentDepth = currentDepth + howDeep;
        System.out.println("Diving for " + howDeep +" feet");
        System.out.println("I'm at " + currentDepth + " feet below see level");
        return currentDepth;
    }}
//dive() - method has an argument "howDeep".
//howDeep - argument(параметр) tells how deep fish should go.
//currentDepth - class variable will store and update depth every call method "dive".
