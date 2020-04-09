
Java Programming for Kids, Parents and Grandparents by Yakov Fain +
    http://myflex.org/books/java4kids/java4kids.htm
Java for kids: a guide for parents of aspiring coders +
    https://www.idtech.com/blog/java-for-kids-a-guide-for-parents-of-new-coders
Java Programming for Kids ?
    https://yfain.github.io/Java4Kids/
Java — Самоучитель +
    http://proglang.su/java/characters
Java Programming Exercises, Practice, Solution +
    https://www.w3resource.com/java-exercises/index.php
w3schools
    https://www.w3schools.com/java/java_methods_param.asp

The Java™ Tutorials
    https://docs.oracle.com/javase/tutorial/index.html
Lesson: Object-Oriented Programming Concepts
    https://docs.oracle.com/javase/tutorial/java/concepts/index.html

2020.03.19
 =====================================================
Install and first steps.

2020.03.24
 =====================================================
New repo on Git.
Install Java
    http://www.oracle.com/technetwork/java/javase/downloads/index.html
Variables on PC (win7)
    Control Panel\All Control Panel Items\System
    Advanced syst set.
New JAVA file
Programm compilaion (p20-Eng/p20-Ru)
javac from JDK
    cd.. - 1 step up
    C:\>cd \Dropbox\_TMP tekushj\Git-K\java1\
    javac HelloWorld.java
Run programm (p21/p21)
    java HelloWorld
Registr important

Eclipse IDE (p23/p23)
    https://www.eclipse.org/
    Eclipse vs Visual Studio Code
    https://www.worldranksolutions.com/microsoft-visual-studio-vs-eclipse/

    Eclipse scrabbook (p37/p) - quickly test any code snippet.

1-st tasks (p33/p38):
    https://www.vogella.com/tutorials/Eclipse/article.html
 -----------------------------------------------------

Java Programming Exercises, Practice, Solution
    https://www.w3resource.com/java-exercises/index.php

Strucutre (p13/)
        Classes - program elements that represent objects from the real world.
        Car - Java class 
        doors, wheels - attributes of this class, similarly to what the real cars have. 
        After that, based on this class you can create another class, for example Ford, which will have all the features of the class Car plus something that only Fords have.

How works (p29/p36)
        public class HelloWorld {   - class
        public static void main(String[] args) {    - method
            System.out.println("Hello World! Que pasa??");  - method called by main. Body of method main.
        }
        }
    -class HelloWorld has only one method main(), which is an entry point of a Java application (program).
    -main is a method, because it has parentheses (круглые скобки) after the word main.
    -Methods can call (use) other methods, for example our method main() calls the method println() to display the text Hello World on the screen.
    - Each method starts with a declaration line called (строка объявления) a method signature:
    public static void main(String[] args) - 
        *public - /Who can access the method/ the method main() could be accessed by any other Java class or JVM itself.
        *static - /Instructions on how to use it/ you don’t have to create an instance (a copy ) of HelloWorld object in memory to use this method.
        *void - /Does the method return any data?/ means that the method main() doesn’t return any data to the calling program, which is Eclipse in this case. But if for example, a method had to perform some calculations, it could have returned a resulting number to its caller.
        *main - name of the method.
        *String[] args. - /The list of arguments – some data that could be given to the method/ In the method main() the String[] args means that this method can receive an array of Strings (массив объектов с типом String) that represent text data. The values that are being passed to a method are called arguments (аргументами или параметрами).
    -программа может состоять из нескольких классов, но только один из них содержит метод main().
    -The body of our method main()has only one line :
        *System.out.println("Hello World");
    -Java class usually have several methods: 
    class Game have methods startGame(), stopGame(), readScore(), and so on.
    -Every command or a method call (вызов метода) must end with a semicolon ;. 
        *println() - method knows how to print data on the system console (command window).
        *System.out - means that the variable "out" is defined inside the class "System" that comes with Java. After you type the word "System" and a dot, Eclipse will show you everything that is available in this class.
        *out.println() - tells us that there is an object represented by a variable "out" and this “something called out” has a method called println(). The dot between a class and a method name means that this method exists inside this class. 
    -Say you have a class PingPongGame that has a method saveScore(). This is how you can call this method for Dave who won three games:
        *PingPongGame.saveScore("Dave", 3);
        *argument (or parametr) - data between parentheses(скобки). These parameters are given to a method for some kind of processing.
    -For example saving data on the disk: The method saveScore() has two arguments –a text string “Dave”, and the number 3.
 -----------------------------------------------------
Classes and Objects (p34/p40 Chapter 3)
object-oriented style - programmers start with deciding which objects have to be included in the program and which Java classes will represent them.
    Class--> Method-->Class's object
         --> Atribute
        -Classes in Java may have methods and attributes.
        Methods define actions that a class can perform.
        Attributes describe the class.
        (Классы Java могут иметь и методы и атрибуты.
        Методы определяют, что класс может сделать.
        Атрибуты – это характеристики класса.)

    *VideoGame - class
    *start the game, stop it, save the score, and so on. - This class may have several methods, which can tell what objects of this class can do.
    *price, screen color, number of remote - This class also may have some attributes or properties.

    to create an instance of an object (p36/p42) - to create a copy of this object in the computer’s memory according to the definition of its class (создать экземпляр объекта).

Data types
    *variables (p36/p42):
    String - stores text, such as "Hello". String values are surrounded by double quotes
    int - stores integers (whole numbers), without decimals, such as 123 or -123
    float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    boolean - stores values with two states: true or false
    https://www.w3schools.com/java/java_variables.asp

    *variables (p37/p43) - have to be declared first, after this is you can use them. Variables represent attributes of a class, method arguments or could be used inside the method for a short-time storage of some data.
    int x;
    int y; 
    x=5;
    y=x+2;

    int y=5;
    y++;

    int myScore=5;
    myScore=myScore+1;

    myScore=myScore*2; is the same as myScore*=2;

    int myScore=10;
    myScore--;
    myScore=myScore*2;
    myScore=myScore/3;
    System.out.printIn("My score is" + myScore);
    My Score is 6 - answer
    concatenation (p38/p) - Creation of a String from pieces: glued from two pieces: the text “My score is ” and the value of the variable myScore.

primitive data types (p39/45)
    Four data types for storing integer(целые) values – byte, short, int, and long.
    Two data types for values with a decimal point – float and double.
    One data type for storing a single character – char.
    (for text - string)
    One logical data type called boolean that allows only two values: true or false.

variable initialization: (p39/45)
    char grade = 'A';
    int chairs = 12;
    boolean playSound = false;
    double nationalIncome = 23863494965745.78;
    float gamePrice = 12.50f;
    long totalCars =4637283648392l;
        In the last two lines f means float and l means long.
        
    final - const. usually name final variables using capital letters:
        final String STATE_CAPITAL="Washington";

    bit - is the smallest piece of data that can be stored in memory. It can hold either 1 or 0.
    byte - consists or eight bits.

    2020.04.07
 =====================================================
 *Inheritance (наследование) (p45-Eng/p52-Ru)
 extends - keyword to inherit attributes from other class:
 class Fish extends Pet {}

 *Method overriding (suppresing) (p49/p56)
 declare in a subclass a method with exactly the same signature as in its superclass, the method of the subclass will be used instead of the method of the superclass.
 If a method signature (заголовок метода) includes the keyword "final", such method can not be overridden, for example: 
 final public void sleep(){…} - can not be overridden

    2020.04.09
 =====================================================
 *Comments (p52/p59)
 // xxxx
 /* xxxx */
 /** xxxx */ - only fur most important comments. "javadoc" extracts to separete "help" file.

*If/Else (p53/p60)