package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean addCheese;
    boolean addToppings;
    boolean addBag;
    boolean billCreated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price += 300;
        }
        else{
            this.price += 400;
        }
        this.bill = "";
        this.addCheese = false;
        this.addToppings = false;
        this.addBag = false;
        this.billCreated = false;

        bill += "Base Price Of The Pizza: " + this.price +"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!addCheese){
            this.price += 80;
            addCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!addToppings && isVeg){
            this.price += 70;
            addToppings=true;
        }
        if(!addToppings){
            this.price += 120;
            addToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!addBag){
            addBag=true;
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        if(this.billCreated) return "";

        if(addCheese) bill += "Extra Cheese Added: "+80+"\n";

        if(addToppings && isVeg) bill += "Extra Toppings Added: "+70+"\n";
        else if(addToppings) bill += "Extra Toppings Added: "+120+"\n";

        if(addBag) bill += "Paperbag Added: "+20+"\n";

        bill += "Total Price: " + getPrice()+"\n" ;
        this.billCreated = true;

        return this.bill;
    }
}
