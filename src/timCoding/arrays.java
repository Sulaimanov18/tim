package timCoding;

import java.util.ArrayList;
import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {

        String [] arr = {"tim", "Lol", "mike"};

        String original = "";
        for (int i = 0; i <arr.length ; i++) {
            original=arr[i];
            String reversed="";

            for (int j = original.length()-1; j >=0 ; j--) {
                reversed+=original.charAt(j);

            }
            arr[i]=reversed;


        }

        System.out.println(Arrays.toString(arr));

    }





        }







