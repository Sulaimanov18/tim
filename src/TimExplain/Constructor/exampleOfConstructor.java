package TimExplain.Constructor;

public class exampleOfConstructor {

    String name;

    public exampleOfConstructor(String surename){
        name = "Tim";
        for(int i =0; i<name.length(); i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        exampleOfConstructor costructor = new exampleOfConstructor("Sul");
        System.out.println(costructor.name);
    }
}
