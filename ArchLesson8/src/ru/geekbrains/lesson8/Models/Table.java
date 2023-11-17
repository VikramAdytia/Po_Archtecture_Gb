package ru.geekbrains.lesson8.Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    private final Collection<Reservation> reservations = new ArrayList<>();

    private static int counter;
    private final int no;

    {
        no = ++counter;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format(Locale.getDefault(), "Столик: #%d \n", no));
        for (Reservation reservation : reservations) {
            builder.append(String.format(Locale.getDefault(), " Резерв: #%s \n", reservation.toString()));
        }
        return builder.toString();
    }
}
