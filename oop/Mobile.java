package oop;

public class Mobile {

   private String os;
   private String model;
   private  float price;


    public Mobile() {
    }
    


    public String getOs() {
        return this.os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Mobile(String os, String model, Float price) {
        this.os = os;
        this.model = model;
        this.price = price;
    }
    
     public float clculPrice(){
        return price;
    }
    
    
}
