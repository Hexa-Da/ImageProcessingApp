package imageprocessingapp.controller;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import imageprocessingapp.model.tools.Tool;

/**
 * Contrôleur principal de l'application de traitement d'image.
 * 
 * Ce contrôleur suit le pattern MVC et fait le lien entre :
 * - La View (MainView.fxml) : interface utilisateur
 * - Le Model (ImageModel, Tool, etc.) : logique métier
 * 
 * Il gère les interactions utilisateur et coordonne les différents composants.
 */

public class MainController {
    
    // ===== PROPRIÉTÉS OBSERVABLES =====
    private final ObjectProperty<Color> selectedColor = new SimpleObjectProperty<>(Color.BLACK);
    private final ObjectProperty<Image> currentImage = new SimpleObjectProperty<>();
    private final ObjectProperty<Tool> activeTool = new SimpleObjectProperty<>();
    
    // ===== GETTERS POUR LA LIAISON DES PROPRIÉTÉS JAVAFX =====
    public ObjectProperty<Color> selectedColorProperty() { return selectedColor; }
    public ObjectProperty<Image> currentImageProperty() { return currentImage; }
    public ObjectProperty<Tool> activeToolProperty() { return activeTool; }
    
    // ===== MÉTHODES D'ACTION =====
    public void openImage() { /* TODO */ }

    public void saveImage() { /* TODO */ }
}