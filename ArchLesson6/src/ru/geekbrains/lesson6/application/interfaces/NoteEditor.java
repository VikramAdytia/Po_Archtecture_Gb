package ru.geekbrains.lesson6.application.interfaces;

import ru.geekbrains.lesson6.domain.Note;

import java.util.Collection;
import java.util.Optional;

public interface NoteEditor extends Editor<Note, Integer> {
    void printAll();

    boolean add(Note item);

    boolean edit(Note item);

    boolean remove(Note item);

    Optional<Note> getById(Integer id);

    Collection<Note> getAll();


}
