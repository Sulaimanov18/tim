package implementations;

public class pracice {
    public static void main(String[] args) {

        String [] str = {"tim", "Loli"};
        for (int i = 0; i <str.length ; i++) {
            String original = str[i];
            String reversed = "";
            for (int j = original.length()-1; j >=0 ; j--) {
                reversed+=original.charAt(j);

            }
            str[i] = reversed;
        }
        for (String arr: str
             ) {
            System.out.println(arr);

        }
    }
}
