import java.util.Scanner;
import java.util.Vector;

public class Sub extends Sandwich {

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    void chooseBread(String bread) {
        if(bread == null){
            bread = "Alright... No bread then";
        }
            description = "Your sub: \n\t> " + bread;
    }

    @Override
    void chooseMeat(String meat) {
        if(meat == null){
            meat = "Alright... No meat";
        }
        description += "\n\t> " + meat;
    }

    @Override
    void chooseCheese(String cheese) {
        if(cheese == null){
            cheese = "Alright... No cheese";
        }
        description += "\n\t> " + cheese;
    }

    @Override
    void addCondiments(Vector<String> condiments) {
        description += "\n\n\t[Condiments]\n";
        if(condiments == null){
            description += "Alright... no condiments";
        }
        else {
            for (String s : condiments)
                description += "\t\t> " + s;
        }
    }

    @Override
    void addSauce(Vector<String> sauces) {
        description += "\n\n\t[Sauces]\n";
        if(sauces == null){
            description += "Alright... no condiments";
        }
        else {
            for (String s : sauces)
                description += "\t\t> " + s;
        }
    }
}
