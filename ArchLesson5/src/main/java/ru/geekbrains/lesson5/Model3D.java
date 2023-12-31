package main.java.ru.geekbrains.lesson5;

import java.util.ArrayList;
import java.util.Collection;

public class Model3D implements Entity{

    private static int counter = 10000;
    private int id;

    private Collection<Texture> textures = new ArrayList<>();

    @Override
    public int getId() {
        return id;
    }

    {
        id = ++counter;
    }

    public Model3D(){

    }

    public Model3D(Collection<Texture> textures) {
        this.textures = textures;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }

    public void setTextures(Collection<Texture> textures) {
        this.textures = textures;
    }

    @Override
    public String toString() {
        return String.format("3DModel #%s", id);
    }

}
