package lesson3;

import java.awt.*;

public class SportCar extends Car implements Fueling {

    private Refueling refueling;
    private WashingStation washing;

    public SportCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(3);
        setFuelType(FuelType.Gasoline);
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
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    /**
     * Помыть автомобиль на автомойке
     */
    public void wash(WashType washType) {
        if (washing != null){
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
