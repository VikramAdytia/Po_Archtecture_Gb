package lesson3;

import java.awt.*;

import static lesson3.FuelType.Gasoline;

public class BusinessClassCar extends Car implements Fueling {

    private Refueling refueling;
    private WashingStation washing;

    public BusinessClassCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
        setFuelType(Gasoline);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void setWashingStation(WashingStation washingStation) {
        this.washing = washingStation;
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (refueling != null) {
            refueling.fuel(fuelType);
        }
    }

    /**
     * Помыть автомобиль на автомойке
     */
    public void wash(WashType washType) {
        if (washing != null) {
            washing.wash(washType);
        }
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

}
