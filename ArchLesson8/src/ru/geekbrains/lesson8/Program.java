package ru.geekbrains.lesson8;

import ru.geekbrains.lesson8.Models.TableModel;
import ru.geekbrains.lesson8.Presenters.BookingPresenter;
import ru.geekbrains.lesson8.Presenters.Model;
import ru.geekbrains.lesson8.Presenters.View;
import ru.geekbrains.lesson8.Views.BookingView;

import java.util.Date;

public class Program {

    //TODO: метод changeReservationTable должен заработать
    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);

        System.out.println("=============== Изначальный пул резервов ==========");
        presenter.updateUIShowTables();
        System.out.println("=============== Пользователь создал резерв =============== ");
        view.reservationTable(new Date(), 2, "Станислав");
        presenter.updateUIShowTables();
        System.out.println("=============== Пользователь изменил резерв =============== ");
        view.changeReservationTable(1001, new Date(), 3, "Вечеслав");
        presenter.updateUIShowTables();
    }

}
