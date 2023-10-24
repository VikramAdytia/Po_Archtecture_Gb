package lesson3;

import java.awt.*;

import static lesson3.FuelType.Diesel;

public class FireEngine extends Car implements Fueling, Wiping {

    private Refueling refueling;
    private WashingStation washing;

    public FireEngine(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
        setFuelType(Diesel);
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

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }



    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }


}
