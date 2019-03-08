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
                burger.prepareSandwich(getBurgerBread(), "Burger Patty", getCheese(), getCondiments(), getSauces(), extraGrill());
                System.out.println(burger.getDescription());
                break;
            }
            case 2:{
                Sandwich sub = new Sub();
                sub.prepareSandwich(getSubBread(), getSubMeat(), getCheese(), getCondiments(), getSauces(), false );
                System.out.println(sub.getDescription());
                break;
            }
        }
    }

    public static boolean extraGrill() {
        System.out.printf(
                "Want it grilled?\n\t" +
                        "1. Yes\n\t" +
                        "2. No\n\n" +
                        "[Your choice] :");

        Scanner cin = new Scanner(System.in);
        int choice = cin.nextInt();
        switch (choice){
            case 1:{
                return true;
            }
            case 2:
                return false;
            default: return false;
        }
    }

    public static String getSubBread(){
        System.out.printf(
                "Choose Bread:\n\t" +
                        "1. Italian Herbs and Cheese\n\t" +
                        "2. White Bread\n\n" +
                        "[Your choice] :");

        Scanner cin = new Scanner(System.in);
        int choice = cin.nextInt();
        switch (choice){
            case 1:{
                return "Italian Herbs and Cheese";
            }
            case 2:
                return "White Bread";
                default: return "White Bread";
        }

    }

    public static String getBurgerBread(){
        System.out.printf(
                "Choose Bread:\n\t" +
                        "1. Sesame Bread\n\t" +
                        "2. Artisan Bread\n\n" +
                        "[Your choice] :");

        Scanner cin = new Scanner(System.in);
        int choice = cin.nextInt();
        switch (choice){
            case 1:{
                return "Sesame Bread";
            }
            case 2:
                return "Artisan Bread";
            default: return "Artisan Bread";
        }
    }


    public static String getSubMeat(){
        System.out.printf(
                "Choose Meat:\n\t" +
                        "1. Ham\n\t" +
                        "2. Turkey\n\n" +
                        "[Your choice] :");

        Scanner cin = new Scanner(System.in);
        int choice = cin.nextInt();
        switch (choice){
            case 1:{
                return "Ham";
            }
            case 2:
                return "Turkey";
            default: return "No meat";
        }

    }

    public static String getCheese(){
        System.out.printf(
                "Choose Cheese:\n\t" +
                        "1. American\n\t" +
                        "2. Pepper Jack\n\t" +
                        "3. Cheddar\n\n" +
                        "[Your choice] :");

        Scanner cin = new Scanner(System.in);
        int choice = cin.nextInt();
        switch (choice){
            case 1:{
                return "American";
            }
            case 2:
                return "Pepper Jack";
            case 3:
                return "Cheddar";
            default: return "No cheese";
        }

    }

    public static Vector<String> getCondiments(){
        int lettuce =0,tomato =0, onion=0, pepper=0, pineapple=0, pickle=0;
        Vector<String> condiments = new Vector<>();

        while(true) {
            System.out.printf(
                    "Choose condiments: [Press 0 when you're done]\n\t" +
                            "1. Lettuce\n\t" +
                            "2. Tomatoes\n\t" +
                            "3. Onions\n\t" +
                            "4. Peppers\n\t" +
                            "5. Pineapple\n\t" +
                            "6. Pickles\n\n" +
                            "[Your choice] :");


            Scanner cin = new Scanner(System.in);
            int choice = cin.nextInt();
            switch (choice) {
                case 1: {
                    lettuce++;
                    break;
                }
                case 2:
                    tomato++;
                    break;
                case 3:
                    onion++;
                    break;
                case 4:
                    pepper++;
                    break;
                case 5:
                    pineapple++;
                    break;
                case 6:
                    pickle++;
                    break;

                case 0: {
                    if(lettuce == 0 && tomato == 0 && onion ==0 && pepper == 0 && pickle ==0 && pineapple ==0)
                        condiments.add("No condiments");
                    else {
                        if(lettuce > 0)
                            condiments.add(lettuce + "x Lettuce");
                        if(tomato > 0)
                            condiments.add(tomato + "x Tomato");
                        if(onion > 0)
                            condiments.add(onion + "x Onion");
                        if(pepper > 0)
                            condiments.add(pepper + "x Pepper");
                        if(pineapple > 0)
                            condiments.add(pineapple + "x Pineapple");
                        if(pickle > 0)
                        condiments.add(pickle + "x Pickle");
                    }
                    return condiments;
                }
            }
        }

    }


    public static Vector<String> getSauces(){
        int ketchup =0,mayo =0, mustard=0, chipotle=0, bbq=0;
        Vector<String> sauces = new Vector<>();

        while(true) {
            System.out.printf(
                    "Choose condiments: [Press 0 when you're done]\n\t" +
                            "1. Ketchup\n\t" +
                            "2. Mayonnaise\n\t" +
                            "3. Mustard\n\t" +
                            "4. Chipotle\n\t" +
                            "5. BBQ Sauce\n\t" +
                            "[Your choice] :");


            Scanner cin = new Scanner(System.in);
            int choice = cin.nextInt();
            switch (choice) {
                case 1: {
                    ketchup++;
                    break;
                }
                case 2:
                    mayo++;
                    break;
                case 3:
                    mustard++;
                    break;
                case 4:
                    chipotle++;
                    break;
                case 5:
                    bbq++;
                    break;

                case 0: {
                    if(ketchup == 0 && mayo == 0 && mustard ==0 && chipotle == 0 && bbq ==0)
                        sauces.add("No sauces");
                    else {
                        if(ketchup > 0)
                            sauces.add(ketchup + " servings of Ketchup");
                        if(mayo > 0)
                            sauces.add(mayo + " servings of Mayonnaise");
                        if(mustard > 0)
                            sauces.add(mustard + " servings of Mustard");
                        if(chipotle > 0)
                         sauces.add(chipotle + " servings of Chipotle");
                        if(bbq > 0)
                            sauces.add(bbq + " servings of BBQ");
                    }
                    return sauces;
                }
            }
        }

    }
}
