package timCoding;

public class CoffeeMashine {
    public static void main(String[] args) {
        System.out.println("Welcome to coffee machine");
        int moneyAmount = 6;
        int [] prices = {7, 5, 6};
        boolean canBuyAnything = false;
        String [] coffee = {"capuccino", "latte", "espresso" };
        for (int i = 0; i < 3; i=i+1) {
            if(moneyAmount>=prices[i]){
                System.out.println("you can buy "+coffee[i]);
                canBuyAnything = true;
            }
        }
        if(canBuyAnything==false){
            System.out.println("you need more money");
        }

    }
}
