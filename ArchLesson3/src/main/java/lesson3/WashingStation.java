package lesson3;

public class WashingStation implements Washing {

    // Название автомойки
    String title;

    public WashingStation(String title) {
        this.title = title;
    }

    @Override
    public void wash(WashType washType) {
        switch (washType){
            case TechnicalWash -> System.out.println("     - Техническая мойка на автомойке " + title);
            case ExpressWash -> System.out.println("     - Экспресс-мойка на автомойке " + title);
            case ComplexWash -> System.out.println("     - Комплексная мойка на автомойке " + title);
            case StandardWash -> System.out.println("     - Стандартная мойка на автомойке " + title);
        }
    }

}
