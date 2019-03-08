import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        System.out.printf(
                "Choose sandwich:\n\t" +
                        "1. Burger\n\t" +
                        "2. Sub\n\n" +
                        "[Your choice] :");

        Scanner cin = new Scanner(System.in);
        int choice = cin.nextInt();
        switch (choice){
            case 1:{
                Sandwich burger = new Hamburger();
                Vector<String> condiments = new Vector<>();
                condiments.addAll(Arrays.asList(new String[]{"Salt", "Pepper", "Oregano"}));
                Vector<String> sauces = new Vector<>();
                sauces.addAll(Arrays.asList(new String[]{"Ketchup", "Siracha", "Chipotle"}));
                burger.prepareSandwich("Sesame Bum", "Burger Patty", "American", condiments, sauces, true);
                System.out.println(burger.getDescription());
                break;
            }
            case 2:{
                Sandwich sub = new Sub();
                Vector<String> condiments = new Vector<>();
                condiments.addAll(Arrays.asList(new String[]{"Salt", "Pepper", "Oregano"}));
                Vector<String> sauces = new Vector<>();
                sauces.addAll(Arrays.asList(new String[]{"Ketchup", "Siracha", "Chipotle"}));
                sub.prepareSandwich("Italian Herbs and Cheese", "Ham", "American", condiments, sauces, false);
                System.out.println(sub.getDescription());
                break;
            }
        }
    }


    //TODO: Create a menu

}
