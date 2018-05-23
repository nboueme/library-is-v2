
## Améliorez le système d’information de la bibliothèque

Ceci est le dépôt associé au projet [_Améliorez le système d’information de la bibliothèque_](https://openclassrooms.com/projects/ameliorez-le-systeme-d-information-de-la-bibliotheque)
sur [_OpenClassrooms_](https://www.openclassrooms.com).


### Technologies

- Apache Maven 3.5.3
- Bootstrap 4.0.0
- Docker 18.03.1-ce-mac65
- GlassFish 5.0
- JDK8 version 172
- PostgreSQL 10.3
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
![](images/class_diagram-v4.png?raw=true)


### MPD
![](images/mpd_library-v4.png?raw=true)


### Déploiement

Si jamais vous souhaitez compiler vous même l'application web ou le batch, à la machine hôte, celle qui va héberger les conteneurs Docker du projet :
- attribuer une adresse IP LAN fixe de votre choix
- créer un alias `web-service` dans le fichier `/etc/hosts` à cet IP

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
- `docker build -t nboueme/library-batch batch` pour créer l'image de déploiement du batch
- `docker-compose -p library up -d batch` pour déployer le batch

Les identifiants d'accès aux serveurs GlassFish sont `admin` avec pour mot de passe `glassfish`.

L'application web est désormais disponible via l'URL suivante : [`http://localhost/`](http://localhost/)
