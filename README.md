# ImageProcessingApp

Une application JavaFX de traitement d'image développée en équipe avec les fonctionnalités suivantes :
- **Outils de dessin** (pinceau, pipette)
- **Effet mosaïque** utilisant un KdTree
- **Seam Carving** pour redimensionner intelligemment les images
- **Système de couleurs** avec sélecteur RGB

## Architecture du projet

### Structure du projet

```
src/main/java/imageprocessingapp/
├── MainApp.java                  # Point d'entrée de l'application
├── model/                        # Logique métier et données
│  ├── ImageModel.java            # Modèle principal de l'image
│  ├── ColorUtils.java            # Utilitaires pour les couleurs
│  ├── tools/                     # Outils de dessin
│  │  └── Tool.java               # Interface des outils
│  ├── filters/                   # Filtres/effets (mosaïque, seam carving)
│  └── structures/                # Structures de données (KdTree)
├── view/                         # Composants d'interface utilisateur
│  └── components/                # Widgets réutilisables
└── controller/                   # Logique de contrôle
   ├── MainController.java        # Contrôleur principal
   └── tool/                      # Contrôleurs des outils

src/main/resources/imageprocessingapp/
├── view/                        
│  └── MainView.fxml              # Interface principale (FXML)
└── dialogs/                      # Fenêtres de dialogue

src/test/java/imageprocessingapp/
├── model/                        # Tests unitaires du model
└── integration/                  # Tests d'intégration
```


Cette structure suit les **bonnes pratiques JavaFX** et les principes de développement logiciel :

#### **Séparation des responsabilités (MVC)**
- **Model** (`model/`) : Contient la logique métier pure, indépendante de l'interface
- **View** (`view/` + FXML) : Interface utilisateur déclarative avec FXML pour la séparation UI/logique
- **Controller** (`controller/`) : Gère les interactions utilisateur et fait le lien Model ↔ View


**Organisation des ressources**
- `src/main/resources/` séparé de `src/main/java/` pour les fichiers non-compilés
- FXML, images, CSS dans les ressources
- Code Java compilé dans `src/main/java/`


### Composants principaux

- **MainApp** : Lance l'application JavaFX
- **MainController** : Gère les interactions utilisateur et coordonne les composants
- **ImageModel** : Représente une image modifiable avec accès aux pixels
- **MainView.fxml** : Interface utilisateur avec menu, toolbar et zone d'image

##  Comment lancer

### Via Maven 
```bash
# Compiler le projet
mvn compile

# Lancer l'application
mvn javafx:run
```

### Via IntelliJ IDEA
   - Clic droit sur `MainApp.java` → `Run 'MainApp.main()'`
   - Ou utiliser le bouton ▶️ vert à côté de la classe `MainApp`

## Développement en équipe

Le projet est développé par **Robin**, **Adrien** et **Paul-Antoine** 

Voir `plan.md` pour le détail des tâches et la roadmap de développement.
