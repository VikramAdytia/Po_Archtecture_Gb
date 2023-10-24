package lesson3;

import java.awt.*;

public class Program {

    /**
     * 1. Спроектировать абстрактный класс «Car» у которого должны
     * быть свойства: марка, модель, цвет, тип кузова, число колёс, тип
     * топлива, тип коробки передач, объём двигателя; методы:
     * движение, обслуживание, переключение передач, включение
     * фар, включение дворников.
     *
     * 2. Создать конкретный автомобиль путём наследования класса
     * «Car».
     *
     * 3. Расширить абстрактный класс «Car», добавить метод: подметать
     * улицу. Создать конкретный автомобиль путём наследования
     * класса «Car». Провести проверку принципа SRP.
     *
     * 4. Расширить абстрактный класс «Car», добавить метод:
     * включение противотуманных фар, перевозка груза. Провести
     * проверку принципа OCP.
     *
     * 5. Создать конкретный автомобиль путём наследования класса
     * «Car», определить число колёс = 3. Провести проверку принципа LSP.
     *
     * 6. Создать конкретный автомобиль путём наследования класса
     * «Car», определить метод «движение» - «полёт». Провести
     * проверку принципа LSP.
     *
     * 7. Создать интерфейс «Заправочная станция», создать метод:
     * заправка топливом.
     *
     * 8. Имплементировать метод интерфейса «Заправочная станция» в
     * конкретный класс «Car».
     *
     * 9. Добавить в интерфейс «Заправочная станция» методы: протирка
     * лобового стекла, протирка фар, протирка зеркал.
    *
     * 10. Имплементировать все методы интерфейса «Заправочная
     * станция» в конкретный класс «Car». Провести проверку
     * принципа ISP. Создать дополнительный/е интерфейсы и
     * имплементировать их в конкретный класс «Car». Провести
     * проверку принципа ISP.
     *
     * 11. Создать путём наследования класса «Car» два
     * автомобиля: с бензиновым и дизельным двигателями,
     * имплементировать метод «Заправка топливом» интерфейса
     * «Заправочная станция». Реализовать заправку каждого
     * автомобиля подходящим топливом. Провести проверку принципа DIP.

     * DONE: Домашнее задание:
     * Доработать приложение, спроектированное на семинаре. Добавить тип, описывающий "автомойку".
     * Продемонстрировать работу получившейся программы,
     * создать несколько типов автомобилей,
     * загнать каждый автомобиль на заправку, а затем и на автомойку.
     * @param args
     */
    public static void main(String[] args) {

        Harvester harvester = new Harvester("Подметально-вакуумная машина", "ВКМ 6500", Color.ORANGE);
        SportCar sportCar = new SportCar("Спорт-седан", "Audi S3", Color.PINK);
        MiniVan miniVan = new MiniVan("Минивэн", "Mercedes V-Class", Color.BLACK);
        BusinessClassCar businessClassCar = new BusinessClassCar("Автомобиль бизнес-класса", "BMW 5 Series", Color.WHITE);
        FireEngine fireEngine = new FireEngine("Пожарная машина", "УРАЛ-4320", Color.RED);

        RefuelingStation refuelingStationLukoil = new RefuelingStation("ЛУКОЙЛ");
        RefuelingStation refuelingStationTatneft = new RefuelingStation("ТатНефть");
        RefuelingStation refuelingStationGazProm = new RefuelingStation("ГазПром");

        WashingStation carWashDolphin = new WashingStation("Дельфин");
        WashingStation carWashMyDoHoles = new WashingStation("МойДоДыр");

        harvester.setRefuelingStation(refuelingStationLukoil);
        harvester.setWashingStation(carWashDolphin);
        System.out.println(harvester.getMake() + " " + harvester.getModel() + ":   ");
        harvester.fuel();
        harvester.wash(WashType.ExpressWash);

        sportCar.setRefuelingStation(refuelingStationTatneft);
        sportCar.setWashingStation(carWashMyDoHoles);
        System.out.println(sportCar.getMake() + " " + sportCar.getModel() + ":   ");
        sportCar.fuel();
        sportCar.wash(WashType.StandardWash);

        miniVan.setRefuelingStation(refuelingStationTatneft);
        miniVan.setWashingStation(carWashDolphin);
        System.out.println(miniVan.getMake() + " " + miniVan.getModel() + ":   ");
        miniVan.fuel();
        miniVan.wash(WashType.TechnicalWash);

        businessClassCar.setRefuelingStation(refuelingStationGazProm);
        businessClassCar.setWashingStation(carWashDolphin);
        System.out.println(businessClassCar.getMake() + " " + businessClassCar.getModel() + ":   ");
        businessClassCar.fuel();
        businessClassCar.wash(WashType.ComplexWash);

        fireEngine.setRefuelingStation(refuelingStationLukoil);
        fireEngine.setWashingStation(carWashMyDoHoles);
        System.out.println(fireEngine.getMake() + " " + fireEngine.getModel() + ":   ");
        fireEngine.fuel();
        fireEngine.wash(WashType.TechnicalWash);

    }

    public static double calculateMaintenance(Car car){
        if (car.getWheelsCount() == 6){
            return 1500*6;
        }
        else {
            return 1000*4;
        }
    }

}