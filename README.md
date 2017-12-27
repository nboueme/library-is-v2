## Développez le nouveau SI de la bibliothèque d’une grande ville

Ceci est le dépôt associé au projet [_Développez le nouveau système d’information de la bibliothèque d’une grande ville_](https://openclassrooms.com/projects/developpez-le-nouveau-systeme-d-information-de-la-bibliotheque-d-une-grande-ville)
sur [_OpenClassrooms_](https://www.openclassrooms.com).


### Technologies

- JDK8 version 152
- Apache Tomcat 9.0.1
- Apache Maven 3.5.2
- PostgreSQL 9.6


### Projet Maven 1 - service web

#### Modules

- `climbing-service` : module contenant le web-service
- `climbing-business` : module contenant la logique métier
- `climbing-consumer` : module contenant la persistance et le pattern DAO
- `climbing-model` : module contenant les entités de la solution


### Projet Maven 2 - application web et batch

#### Modules

- `climbing-webapp` : module contenant les vues et ses contrôleurs
- `climbing-batch` : module contenant un batch qui envoie un mail de relance
- `climbing-business` : module contenant la logique métier
- `climbing-consumer` : module contenant la persistance et le pattern DAO, appel le service web
- `climbing-model` : module contenant les entités de la solution


### Diagramme de classes
![](images/class_diagram-v2.png?raw=true)


### MPD
![](images/mpd_library-v2.png?raw=true)


### Déploiement

