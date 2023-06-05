package results;

public class Dog {

    public static void main(String[] args) {
        String [] arr={"enod" , "ekin", "aloc"};
        for (int i = 0; i <arr.length ; i++) {
            String original = arr[i];
            String reversed = "";
            for (int j = original.length()-1; j <=0 ; j--) {
                reversed+=original.charAt(j);

            }
            arr[i]=reversed;

        }
        for (String str: arr
        ) {
            System.out.println(str);
        }



    }
}