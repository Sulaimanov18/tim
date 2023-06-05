import java.util.HashMap;

public class rewriteCode {

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

    public static void main(String[] args) {

        rewriteCode name = new  rewriteCode();
        System.out.println(name.countLetters("Tim"));
        }
    }





