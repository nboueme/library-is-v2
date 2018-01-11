## Développez le nouveau SI de la bibliothèque d’une grande ville

Ceci est le dépôt associé au projet [_Développez le nouveau système d’information de la bibliothèque d’une grande ville_](https://openclassrooms.com/projects/developpez-le-nouveau-systeme-d-information-de-la-bibliotheque-d-une-grande-ville)
sur [_OpenClassrooms_](https://www.openclassrooms.com).


### Technologies

- Apache Maven 3.5.2
- Apache Tomcat 9.0.1
- Docker 17.09-ce-mac42
- JDK8 version 152
- PostgreSQL 10.1


### Projet Maven 1 - service web

#### Modules

- `library-service` : module contenant le web-service
- `library-repository` : module contenant la persistance et le pattern DAO
- `library-model` : module contenant les entités de la solution


### Projet Maven 2 - application web et batch

#### Modules

- `library-webapp` : module contenant les vues et ses contrôleurs
- `library-batch` : module contenant un batch qui envoie un mail de relance
- `library-business` : module contenant la logique métier
- `library-repository` : module contenant la persistance et le pattern DAO, appel le service web
- `library-client` : module contenant les entités et classes auto-générées


### Diagramme de classes
![](images/class_diagram-v2.png?raw=true)


### MPD
![](images/mpd_library-v2.png?raw=true)


### Déploiement

Se placer dans la racine du projet et exécuter la commande suivante :
`docker-compose -p library up -d`

