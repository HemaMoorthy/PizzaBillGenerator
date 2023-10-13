package Pizza;
public class Main{
    public static void main(String[] args) {
        // Pizza basePizza=new Pizza(true);
        // basePizza.addExtraCheese();
        // basePizza.addextraToppings();
        // basePizza.takeAway();
        // basePizza.getBill();

        DeluxPizza dp=new DeluxPizza(true,true);
        dp.addSpecialSauce();
        dp.takeAway();
        dp.getBill();
    }
    
}