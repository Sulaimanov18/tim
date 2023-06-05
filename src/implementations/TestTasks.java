package implementations;

import interfaces.AllTasks;
import interfaces.forCar;

import java.util.HashMap;

public class TestTasks implements AllTasks, forCar {

    public TestTasks(){

    }

    @Override
    public String reverse(String str) {

        String reverse= "";
        for(int i = str.length()-1; i >=0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
        }


    @Override
    public String[] reversAnArray(String [] str) {
        for (int i = 0; i < str.length; i++) {
            String original = str[i];
            String reversed = "";

            for (int j = original.length() - 1; j >= 0; j--) {
                reversed += original.charAt(j);
            }

            str[i] = reversed;
        }
        for (String arr : str) {
            System.out.println(arr);
        }

        return new String[0];
    }

    @Override
    public HashMap<Character, Integer> countLetters(String str) {

        HashMap<Character, Integer> letterCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            if (!letterCountMap.containsKey(str.charAt(i))){
                letterCountMap.put(str.charAt(i),1 );
            }else {
                int value = letterCountMap.get(str.charAt(i));
                letterCountMap.put(str.charAt(i), value +1);
            }

        }

        return letterCountMap;
    }

    @Override
    public boolean isPalindrome1(String str) {
       int left = 0;
       int right = str.length()-1;
       while (left<right){
           if(str.charAt(left)!=str.charAt(right) ){
               return false;
           }
           left++;
           right--;
       }
        return true;

        }




    @Override
    public String color(String str) {
        return null;
    }

    @Override
    public String mark(String arr) {
        return null;
    }

    @Override
    public int year() {
        return 0;
    }
}




