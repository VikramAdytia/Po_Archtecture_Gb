package main.java.ru.geekbrains.lesson5;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Data Access Layer
 */
public class EditorDatabaseAccess implements DatabaseAccess{

    private final Database editorDatabase;

    public EditorDatabaseAccess(Database editorDatabase) {
        this.editorDatabase = editorDatabase;
    }

    @Override
    public Collection<Model3D> getAllModels() {
        Collection<Model3D> models = new ArrayList<>();
        for (Entity entity: editorDatabase.getAll()) {
            if (entity instanceof Model3D)
            {
                models.add((Model3D)entity);
            }
        }
        return models;
    }
    @Override
    public Collection<Texture> getAllTextures() {
        Collection<Texture> models = new ArrayList<>();
        for (Entity entity: editorDatabase.getAll()) {
            if (entity instanceof Texture)
            {
                models.add((Texture)entity);
            }
        }
        return models;
    }

    @Override
    public void addEntity(Entity entity) {
        editorDatabase.getAll().add(entity);
    }

    @Override
    public void removeEntity(Entity entity) {
        editorDatabase.getAll().remove(entity);
    }

    @Override
    public void removeTexture(Texture texture) {
        Collection <Entity> temp = editorDatabase.getAll();
        for (Entity entity : temp) {
            if (entity instanceof Model3D){
                Collection<Texture> tempTextures = ((Model3D)entity).getTextures();
                tempTextures.remove(texture);
                ((Model3D)entity).setTextures(tempTextures);
            }
        }
        temp.remove((Entity)texture);
        editorDatabase.setAll(temp);
    }

    @Override
    public void removeModel3D(Model3D model3d) {
        Collection <Entity> temp = editorDatabase.getAll();
        temp.remove((Entity)model3d);
        editorDatabase.setAll(temp);
    }

    @Override
    public void addTexture(Texture texture) {
        Collection <Entity> temp = editorDatabase.getAll();
        temp.add((Entity)texture);
        editorDatabase.setAll(temp);
    }

    @Override
    public void addModel3D(Model3D model3d) {
        Collection <Entity> temp = editorDatabase.getAll();
        temp.add((Entity)model3d);
        editorDatabase.setAll(temp);
    }

    @Override
    public void editTexture(Texture textureOld, Texture textureNew) {
        removeTexture(textureOld);
        addTexture(textureNew);
    }

    @Override
    public void editModel3D(Model3D model3dOld, Model3D model3dNew) {
        removeModel3D(model3dOld);
        addModel3D(model3dNew);
    }
}
