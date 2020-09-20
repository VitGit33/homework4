package ai.skillo.test4;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 01, 01);

        Car car = new NewCar("red", 4567, calendar, true, CarBrand.BUGATTI);
        System.out.println(car);
        System.out.println(CarBrand.BUGATTI);
    }
}
