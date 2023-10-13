package Pizza;
public class Pizza {
    protected int price;
    private Boolean veg;

    protected int extraCheesePrice=100;

    protected int extraToppingsPrice=150;

    protected int backPackPrice=20;

    protected int basePizzaPrice;

    protected boolean isExtraCheeseAdded=false;
    protected boolean isExtraToppingAdded=false;
    protected boolean isOptedForTakeAway=false;

    public Pizza(Boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;

        }
        basePizzaPrice=this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price+=extraCheesePrice;

    }
    public void addextraToppings(){
        isExtraToppingAdded=true;
        this.price+=extraToppingsPrice;

    }
    public void takeAway(){
        isOptedForTakeAway=true;
        this.price+=backPackPrice;

    }
    public void getBill(){
        String bill="";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra Cheese added: "+extraCheesePrice+"\n";
        }
         if(isExtraToppingAdded){
            bill+="Extra Toppings added: "+extraToppingsPrice+"\n";
        }

         if(isOptedForTakeAway){
            bill+="Take Away: "+backPackPrice+"\n";
        }
        bill+="Bill: "+this.price+"\n";
        System.out.println(bill);

    }
}
