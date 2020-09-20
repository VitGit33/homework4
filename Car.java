package ai.skillo.test4;

import java.util.Calendar;

public abstract class Car implements Movable{

    String color;
    int winNumber;
    Calendar dateOfProduction;
    boolean isMove;
    CarBrand carBrand;

    public Car(String color, int winNumber, Calendar dateOfProduction, boolean isMove, CarBrand carBrand) {
        this.color = color;
        this.winNumber = winNumber;
        this.dateOfProduction = dateOfProduction;
        this.isMove = isMove;
        this.carBrand = carBrand;
    }

    @Override
    public void move() {
        System.out.println("Car can move");
    }

    public abstract void stop();

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", winNumber=" + winNumber +
                ", dateOfProduction=" + dateOfProduction +
                ", isMove=" + isMove +
                ", carBrand=" + carBrand +
                '}';
    }
}
