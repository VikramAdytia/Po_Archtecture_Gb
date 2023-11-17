package ru.geekbrains.lesson8.Models;

import java.util.Date;
import java.util.Locale;

public class Reservation {

    public int getId() {
        return id;
    }

    private static int counter = 1000;
    private final int id;

    private Table table;

    private Date date;
    private String name;

    {
        id = ++counter;
    }

    public Reservation(Table table, Date date, String name) {
        this.table = table;
        this.date = date;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "резерв #%d, дата: %s, клиент: %s", id, date.toString(), name);
    }
}
