package results;

public class staticVSpublic {

    static void staticMethod(){
        System.out.println("This is my static method.");
    }

    public void PublicMethod(){
        System.out.println("This is my public method ");
    }


    public static void main(String[] args) {

        staticMethod();// no need to create object

        staticVSpublic methods = new staticVSpublic();
        methods.PublicMethod(); // need to create object


    }





    }


