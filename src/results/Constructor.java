package results;

public class Constructor {
    String cars;
    int yearOfCar ;
    String models;

    public  Constructor(String car, String model, int year ){
        cars = car;
        yearOfCar=year;
        models=model;
    }

    public static void main(String[] args) {
        Constructor myCar = new Constructor( "BMW", "M5", 2021);
        System.out.println("My car is "+myCar.cars+ "\nmodel is " + myCar.models + " \nyear is " + myCar.yearOfCar);

    }
    }



