package ai.skillo.test4;

import java.util.Calendar;

public class NewCar extends Car {

    public NewCar(String color, int winNumber, Calendar dateOfProduction, boolean isMove, CarBrand carBrand) {
        super(color, winNumber, dateOfProduction, isMove, carBrand);
    }

    @Override
    public void stop() {
        System.out.println();
    }
}
