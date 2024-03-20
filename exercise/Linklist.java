package exercise;

import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Mazda");
        cars.add("Mazda");
        cars.add("Mazda");
        cars.remove(0);
        System.out.println(cars);
      }
}
