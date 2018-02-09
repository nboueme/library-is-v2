## Développez le nouveau SI de la bibliothèque d’une grande ville

Ceci est le dépôt associé au projet [_Développez le nouveau système d’information de la bibliothèque d’une grande ville_](https://openclassrooms.com/projects/developpez-le-nouveau-systeme-d-information-de-la-bibliotheque-d-une-grande-ville)
sur [_OpenClassrooms_](https://www.openclassrooms.com).


### Technologies

- Apache Maven 3.5.2
- Bootstrap 4.0.0
- Docker 17.12.0-ce-mac49
- GlassFish 5.0
- JDK8 version 162
- PostgreSQL 10.1
- Spring Batch 4.0.0.RELEASE
- Spring Data 2.0.2.RELEASE
- Spring Framework 5.0.2.RELEASE
- Struts2 2.5.14.1


### Projet Maven 1 - service web

#### Modules

- `library-service` : module contenant le web-service
- `library-repository` : module contenant la persistance et le pattern DAO
- `library-entity` : module contenant les entités de la solution


### Projet Maven 2 - application web et batch

#### Modules

- `library-webapp` : module contenant les vues et ses contrôleurs
- `library-batch` : module contenant un batch qui envoie un mail de relance
- `library-business` : module contenant la logique métier
- `library-repository` : module contenant le pattern DAO, appelle le service web
- `library-client` : module contenant les entités et classes auto-générées


### Diagramme de classes
![](images/class_diagram-v3.png?raw=true)


### MPD
![](images/mpd_library-v3.png?raw=true)


### Déploiement

Dans le dépôt, créer un fichier `datasource.properties` dans le répertoire `docker/web-service/app/` avec les paramètres suivants :

```
library.datasource.driver=org.postgresql.Driver
library.datasource.url=jdbc:postgresql://database:5432/DB_NAME
library.datasource.username=USER_NAME
library.datasource.password=USER_PASSWORD
```

Puis, créer un fichier `batch.properties` dans le répertoire `docker/batch/app/` avec les paramètres suivants :

```
mail.host=smtp.gmail.com
mail.port=587
mail.username=USER_NAME
mail.password=USER_PASSWORD

batch.cron=CRON_VALUE
```

Adapter dans le fichier `docker-compose.yml` du dossier `docker` les variables d'environnements de création de la base de données :

```
environment:
  - POSTGRES_DB=DB_NAME
  - POSTGRES_USER=USER_NAME
  - POSTGRES_PASSWORD=USER_PASSWORD
```

Se placer dans le dossier `docker` du dépôt du projet et exécuter les commandes suivantes :

- `docker-compose -p library up -d database` pour déployer la base de données
- `docker-compose -p library up -d web-service` pour déployer le service web
- `docker-compose -p library up -d web-application` pour déployer l'application web
- `docker build -t nboueme/library-batch` pour créer l'image de déploiement du batch
- `docker-compose -p library up -d batch` pour déployer le batch

Les identifiants d'accès aux serveurs GlassFish sont `admin` avec pour mot de passe `glassfish`.
