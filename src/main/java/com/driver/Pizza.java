package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private int toppings;
    private String bill;
    boolean  ischeesadded;
    boolean istoppings;
    boolean isbiilCreated;
    boolean istakeAway;




    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg)
        {
            this.price =300;
            this.toppings =70;
        }
        else {
            this.price=400;
            this.toppings=120;
        }
        this.bill ="Base Price Of The Pizza: "+this.price +"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!ischeesadded) {
            this.price += 80;
            this.ischeesadded = true;
        }


    }

    public void addExtraToppings(){
        // your code goes here
        if (!istoppings){
            this.price+=this.toppings;
            this.istoppings= true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!istakeAway)
        {
            this.price+=20;
            this.istakeAway=true;
        }
    }

    public String getBill() {
        // your code goes here
        if (!isbiilCreated) {
            if (ischeesadded) {
                this.bill += "Extra Cheese Added: 80"+"\n";
            }
            if (istoppings) {
                this.bill += "Extra Toppings Added: "+ this.toppings +"\n";
            }
            if (istakeAway) {
                this.bill += "Paperbag Added: "+20+"\n";
            }
            this.bill += "Total Price: "+this.price+"\n";
            return this.bill;
        }
        return "";
    }
}
