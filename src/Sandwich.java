import java.util.Vector;

public abstract class Sandwich {

    public String description = "Sandwich does not exist yet!";

    public abstract String getDescription();

    final void prepareSandwich(String bread, String meat, String cheese, Vector<String> condiments, Vector<String> sauces, boolean extraGrill){
        chooseBread(bread);
        chooseMeat(meat);
        chooseCheese(cheese);
        if(extraGrill)
            tenSecondGrill();
        addCondiments(condiments);
        addSauce(sauces);


    }

    abstract void chooseBread(String bread);
    abstract void chooseMeat(String meat);
    abstract void chooseCheese(String cheese);
    void tenSecondGrill(){;}
    abstract void addCondiments(Vector<String> condiments);
    abstract void addSauce(Vector<String> sauces);

}
