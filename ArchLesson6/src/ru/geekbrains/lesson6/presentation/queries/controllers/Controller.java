package ru.geekbrains.lesson6.presentation.queries.controllers;

import ru.geekbrains.lesson6.presentation.queries.views.Presenter;
public abstract class Controller {
    public <T extends Presenter> void view(T presenter){
    }

}
