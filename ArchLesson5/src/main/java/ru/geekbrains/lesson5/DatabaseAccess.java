package main.java.ru.geekbrains.lesson5;

import java.util.Collection;

/**
 * Интерфейс Data Access Layer
 */
public interface DatabaseAccess{
    void addEntity(Entity entity);
    void removeEntity(Entity entity);
    Collection<Texture> getAllTextures();
    Collection<Model3D> getAllModels();

    void removeTexture(Texture texture);
    void removeModel3D(Model3D model3D);

    void addTexture(Texture texture);
    void addModel3D(Model3D model3D);

    void editTexture(Texture textureOld, Texture textureNew);
    void editModel3D(Model3D model3dOld, Model3D model3dNew);
}
