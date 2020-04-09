public class Fish extends Pet {
    //p47/p54-Ru
    // Inheritance (наследование) (p45-Eng/p52-Ru)
    // extends - keyword to inherit attributes from other class:
    // class Fish extends Pet {}
    int currentDepth=0;
    public int dive (int howDeep) {
        currentDepth=currentDepth + howDeep;
            if (currentDepth>100){
                System.out.println("I'm a little fish - not Ihtiandr-dr and "+" can't dive below 100 feet");
                currentDepth=currentDepth - howDeep; 
            }else{
        System.out.println("Diving for " + howDeep +" feet");
        System.out.println("I'm at " + currentDepth + " feet below see level");
            }
        return currentDepth;
    }
    //Method overriding (suppresing) (p49/p56):
    public String say(String something) {
        return "Don't you know fish do not talk?";
    }
}
//dive() - method has an argument "howDeep".
//howDeep - argument(параметр) tells how deep fish should go.
//currentDepth - class variable will store and update depth every call method "dive".
