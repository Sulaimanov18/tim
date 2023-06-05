package results;

public class OverloadingAndOverriding {


    String name;
    int age;
    String race;

    public OverloadingAndOverriding(String username, int userAge, String userRace){
        name = username;
        age=userAge;
        race=userRace;



    }

    public static void main(String[] args) {
        OverloadingAndOverriding constructor= new OverloadingAndOverriding("Tim",25,"Asian");
        System.out.println(constructor.name+" "+ constructor.age+" "+constructor.race+"");

    }

    }


