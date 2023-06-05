package TimExplain.StaticExplanation;

public class exampleOfStatic {

    static void  name (){
        System.out.println("This is static method");
    }

    public void  age(){
        System.out.println("This is public method");

    }

    public static void main(String[] args) {
        exampleOfStatic.name();         // no need to create object

        // non-static method
        exampleOfStatic method = new exampleOfStatic();
        method.age(); //need to create object

    }
}
