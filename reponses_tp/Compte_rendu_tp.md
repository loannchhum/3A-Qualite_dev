# Compte-rendu TP

## Tache 1 : Questions

### Quels sont les principaux domaines métiers de l'application Order flow ?

Les principaux domaines métiers de Order flow sont divisés en trois catégories :

- Les domaines principaux :
    - Panier d'achat
    - Traitement des commandes

- Les domaines support :
    - Registre des produits
    - Catalogue de produits
    - Gestion des stocks
    - Gestion des clients

- Les domaines génériques :
    - Notification
    - Sourcing d'événements
    - Monnaie


### Comment les microservices sont-ils conçus pour implémenter les domaines métiers ?

Le but des micro services est de séparer les composantes selon les domaines métiers sans que celles-ci se "chevauchent".

Les micro services communiquent entre eux grâce à un message broker. Celui-ci permettra la communiquation asynchrone entre les services.

### Quelles sont les responsabilités des conteneurs de code

apps/of-api-gateway : Gère les échanges entre les différents microservices.

apps/of-product-registry-microservices/product.registry,

apps/of-product-registry-microservices/product.registry.read,

libs/event-sourcing : permet d'avoir l'historique d'événements sur l'application (maj d'un produit, suppression, etc...)

libs/published-language


## Tache 2 :

### Quels sont les concepts principaux utilisés dans l'application Order flow ?

La séparation des services en différents domaines métiers.
Il y a une ségrégation des domaines métiers.
Il y a une gestion par event sourcing, un versionning qui prend en compte tous les changements d'états.

### Comment les concepts principaux sont-ils implémentés dans les microservices ?

framework Quarkus : 

- gestion des micro services
- requetes de réponses http

Une librairie event sourcing

Mongo db : Gérer la base de données

Gradle : Gestion des dépendances lors de la construction des micro services.

### Que fait la bibliothèque libs/event-sourcing ? Comment est-elle utilisée dans les microservices (relation entre métier et structure du code) ?

Elle permet de gérer les événement selon les micro services concernés.


### Comment l'implémentation actuelle de l'event-sourcing assure-t-elle la fiabilité des états internes de l'application ?

Ce qui est le plus important est l'agrégat (le point d'entrée de la logique métier) le numéro de version des éléments, au moment où ils apparaissent.


## Tache 3

Pour les classes, il faut utiliser des accesseurs lorqsqu'elles sont en privées. Il faut utiliser des records ce qui assure que les méthodes sont immutables.

Productregistryqueryressource :

Il faut toujours définir les exceptions avant de les appeler

ProductRegistryEventEntity :

Certains attributs sont publics alors qu'ils devraient être privés. C'est parce que l'orm qu'utilise quarkus est panache et indique qu'il faut définir les attibuts en publics bien que ceci aille à l'encontre des bonnes pratiques en java.
Il faut comprendre pourquoi les erreurs surviennent et non juste comment et les corriger systématiquement sans comprendre.
Il n'y a pas de javadoc


Il y a très peu de tests unitaires et de tests d'intégration dans l'application.

Pas de validation dans le DTO: a ajouter