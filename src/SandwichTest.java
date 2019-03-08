import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class SandwichTest {

    String subDefaultText = "Your sub: \n\u0009> Alright... No bread then\n\u0009> Alright... No meat\n\u0009> Alright... No cheese\n\n\u0009[Condiments]\nAlright... no condiments\n\n\u0009[Sauces]\nAlright... no condiments";
    String burgerDefaultText = "Your Burger: \n\u0009> Alright... No bread then\n\u0009> Alright... No meat\n\u0009> Alright... No cheese\n\n\u0009[Condiments]\nAlright... no condiments\n\n\u0009[Sauces]\nAlright... no condiments";
    String burgerDefaultTextWithGrill = "Your Burger: \n\u0009> Alright... No bread then\n\u0009> Alright... No meat\n\u0009> Alright... No cheese\n\u0009> [Extra Grilled]\n\n\u0009[Condiments]\nAlright... no condiments\n\n\u0009[Sauces]\nAlright... no condiments";
    String burgerDefaultWithCheese = "Your Burger: \n\u0009> Sesame Bread\n\u0009> Alright... No meat\n\u0009> American\n\n\u0009[Condiments]\nAlright... no condiments\n\n\u0009[Sauces]\nAlright... no condiments";
    @Test
    void prepareBurger_SendNullValues_ReturnDefaultValues() {
        Sandwich burger = new Hamburger();
        burger.prepareSandwich(null, null, null, null, null, false);
        System.out.println("\n[------- TEST 1 -------]\n\n "+ burger.getDescription());
        assertEquals(burgerDefaultText, burger.getDescription());
    }

    @Test
    void prepareSub_SendNullValues_ReturnDefaultValues() {
        Sandwich sub = new Sub();
        sub.prepareSandwich(null, null, null, null, null, false);
        System.out.println("\n[------- TEST 2 -------]\n\n "+sub.getDescription());
        assertEquals(subDefaultText, sub.getDescription());
    }



    @Test
    void prepareBurger_SelectGrill_ReturnThatItIsGrilled() {
        Sandwich burger = new Hamburger();
        burger.prepareSandwich(null, null, null, null, null, true);
        System.out.println("\n[------- TEST 3 -------]\n\n "+burger.getDescription());
        assertEquals(burgerDefaultTextWithGrill, burger.getDescription());
    }

    @Test
    void prepareBurger_AddSesameBreadAndAmericanCheese_ReturnsSesameAndAmerican() {
        Sandwich burger = new Hamburger();

        burger.prepareSandwich("Sesame Bread", null, "American", null, null, false);
        System.out.println("\n[------- TEST 4 -------]\n\n "+burger.getDescription());
        assertEquals(burgerDefaultWithCheese, burger.getDescription());
    }
}