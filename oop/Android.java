package oop;

public class Android  extends Mobile{
    String name;




    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Android() {
    }
   
    

    public Android(String os, String model, Float price ,String name) {
        super(os, model, price );
        this.name = name;
    }

    
}
