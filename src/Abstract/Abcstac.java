package Abstract;

public class Abcstac {
    public static void main(String[] args) {
/*


           Abstract class                           Interface class
     doesn't support multiple inheritance       support multiple inheritance
     contain Contructors                        doesn't contain Constructor
     no any restrictions in abstract class      can't have method as private or protected, final, static

 */

        Cat cat = new Cat();
        cat.makeNoise();
        cat.poop();
        System.out.println(cat.play);
    }
}