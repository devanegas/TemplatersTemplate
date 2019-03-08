import java.util.Scanner;
import java.util.Vector;

public class Sub extends Sandwich {

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    void chooseBread(String bread) {
        description = "Your sub: \n\t> " + bread;
    }

    @Override
    void chooseMeat(String meat) {
       description += "\n\t> " + meat;
    }

    @Override
    void chooseCheese(String cheese) {
        description += "\n\t> " + cheese;
    }

    @Override
    void addCondiments(Vector<String> condiments) {
        description += "\n\n\t[Condiments]\n";
        for(String s : condiments)
            description += "\t\t> " + s;
    }

    @Override
    void addSauce(Vector<String> sauces) {
        description += "\n\n\t[Sauces]\n";
        for(String s : sauces)
            description += "\t\t> " + s;
    }
}
