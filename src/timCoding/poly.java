package timCoding;

import interfaces.forCar;

public class poly implements forCar {


    @Override
    public String color(String str) {

        System.out.println("green");
return str;
    }

    @Override
    public String mark(String arr) {
        return arr;
    }

    @Override
    public int year() {

        return 1994;


    }
}

class carMercedes {
    public static void main(String[] args) {
        poly car = new poly();
        car.color("green");
        System.out.println(car.mark("mercedes"));
        System.out.println(car.year());

    }
}