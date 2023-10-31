package main.java.ru.geekbrains.lesson5;

public interface UILayer{

    void openProject(String fileName);
    void showProjectSettings();
    void saveProject();
    void printAllModels();
    void printAllTextures();
    void renderAll();
    void renderModel(int i);
    void removeTexture(int i);
    void removeModel(int i);
    void addTexture();
    void addModel();
    void editTexture(int i);
    void editModel(int i);
}
