package timCoding;

public class isPalindrome {
    public static void main(String[] args) {
//        String name = "mom";
//        String reversed = new StringBuilder(name).reverse().toString();
//        if(name.equalsIgnoreCase(reversed)){
//            System.out.println("palindrome");
//        }else {
//            System.out.println("is not palindrome");
//        }


        String name = "molom";
        if (isPalindrome(name.toLowerCase())) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }

        int number = 15;
        System.out.println(isOddOrEven(number));


    }

        public static boolean isPalindrome(String str) {
                int left = 0;
                int right = str.length()-1;
                while (right>left){
                    if (str.charAt(left)!=str.charAt(right)){
                        System.out.println(str + " is not palindrome");
                        return false;
                    }
                    left++;
                    right--;
                }
                return true;

        }

        public static String  isOddOrEven(int num){
            if(num%2 == 0)
                return "even";
            return "odd";
        }
        }










