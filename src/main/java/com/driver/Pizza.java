package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;

    boolean addCheese;
    boolean addToppings;
    boolean addBag;
    boolean billCreated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price += 300;
            this.toppings = 70;
        }
        else{
            this.price += 400;
            this.toppings = 120;
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
        if(!addToppings){
            this.price += this.toppings;
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
        if(!this.billCreated) {
            if(addCheese) bill += "Extra Cheese Added: "+80+"\n";

            if(addToppings) bill += "Extra Toppings Added: "+this.toppings+"\n";

            if(addBag) bill += "Paperbag Added: "+20+"\n";

            bill += "Total Price: " + getPrice()+"\n" ;
            this.billCreated = true;

            return this.bill;
        }
        return "";
    }
}
