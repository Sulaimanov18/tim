package timCoding;

import java.util.Scanner;

public class EverOrOdd {

    public  String everOrOdd(int number){
        if(number%2 == 0)
            return "even";
        return "odd";


}



    public static void main(String[] args) {

        EverOrOdd ever= new EverOrOdd();

        System.out.println(ever.everOrOdd(3));
    }




}

