package oop;

public class Car {

    private String name;
    private int maxSpeed;
    private float price;
    private int model;

    void SetName(String n){
        name =n;
    }

    public String getName(){
        return name;
       
  }

    public void SetModel(int m){
        if(m >= 2019){
            model = m;

        }else{
           System.out.println("le model nexiste pas ");
        }
    }

    public int getModel(){
        return model;
    }
    
}
