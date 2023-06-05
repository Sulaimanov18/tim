package timCoding;

import java.util.Arrays;

public class freee {
    public static void main(String[] args) {
        String name = "Hello world";
        System.out.println(name.substring(0, name.indexOf(" ")));
        System.out.println(name.substring(name.indexOf(" "),name.length()).trim());


    }
}
