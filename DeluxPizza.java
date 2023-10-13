package Pizza;

public class DeluxPizza extends Pizza {
    private boolean hasSpecialSauce;
    private int specialSaucePrice=45;
    public DeluxPizza(Boolean veg, boolean hasSpecialSauce) {
        super(veg);
        this.addExtraCheese();
        this.hasSpecialSauce = hasSpecialSauce;
    }

    // Additional method specific to DeluxPizza
    public void addSpecialSauce() {
        hasSpecialSauce = true;
        // Add logic specific to special sauce
    }

    // Override the takeAway method to customize behavior
    @Override
    public void takeAway() {
        super.takeAway(); // Call the takeAway method from the base class
    }

    // Override getBill method to include the special sauce cost
    
    @Override
    public void getBill() {
    String bill = "";
    System.out.println("Pizza: " + basePizzaPrice);

    if (isExtraCheeseAdded) {
        bill += "Extra Cheese added: " + extraCheesePrice + "\n";
    }
    if (isExtraToppingAdded) {
        bill += "Extra Toppings added: " + extraToppingsPrice + "\n";
    }
    if (isOptedForTakeAway) {
        bill += "Take Away: " + backPackPrice + "\n";
    }

    if (hasSpecialSauce) {
        bill += "Special Sauce added: " + specialSaucePrice + "\n";
        this.price += specialSaucePrice;
    }

    bill += "Bill: " + this.price + "\n";
    System.out.println(bill);
}

}
