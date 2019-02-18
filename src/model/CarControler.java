package model;

import model.Car;

public class CarControler {
    private Car [] cars = new Car [100];
    private static int index = 0;
    public static int getIndex() {
        return index;
    }
    public static void incrementIndex() {
        index ++;
    }
    public void purchaseCar (String brand, String model, double price, int year) {
        Car c = new Car(brand, model, price, year);
        cars[index] = c;
        index++;
    }
    public void getCars() {
        for (int i = 0; i < index; i ++)
            System.out.println(cars[i]);

    }

    }
