package results;

import java.util.Scanner;

public class ExceptionInJ {
    public static void main(String[] args) throws AgeLessThanZeroException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        while (scanner.hasNextInt()){
            int answer = scanner.nextInt();
            if(answer>=18){
                System.out.println("Your age is legal");            }
            else {
                throw new AgeLessThanZeroException();

            }


        }
    }
}
