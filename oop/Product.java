package oop;

public class Product {

    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;



    public Product() {
        this.name = "cheikh";
        this.description ="yes";
        this.price = 3567;
        this.quantity = 0;
        this.discount = 23;
    }


    public Product(String name, String description, float price, int quantity, float discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }
   
   

    public void displayProduct(){
        System.out.println("Name =" + name);
        System.out.println("Des"  + description);
        System.out.println("price"  + price);
        System.out.println("Qnt"  + quantity);
        System.out.println("dis"  + discount);
    }


    
    
}
