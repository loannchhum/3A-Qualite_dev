# Guide de contribution

Merci de votre intérêt pour contribuer à ce projet ! Nous avons conçu ce guide pour que vous puissiez vous intégrer facilement au processus de développement. Suivez ces étapes et bonnes pratiques pour nous aider à construire ensemble un projet de qualité.

---

## Table des matières
1. [Prérequis](#prérequis)
2. [Processus de contribution](#processus-de-contribution)
3. [Règles de codage](#règles-de-codage)
4. [Tests et validation](#tests-et-validation)
5. [Communication](#communication)
6. [Problèmes et demandes de fonctionnalités](#problèmes-et-demandes-de-fonctionnalités)

---

## Prérequis

Avant de contribuer, assurez-vous d’avoir les outils suivants installés :

1. **Git** : Assurez-vous que Git est installé sur votre machine. [Guide d’installation Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
2. **Environnement de développement** : Suivez les instructions du fichier `README.md` pour configurer votre environnement.
3. **Outils spécifiques au projet** :
   - Vérifiez les dépendances listées dans `package.json`.
   - Assurez-vous que vous utilisez la bonne version des frameworks/libraries (voir `README.md`).

---

## Processus de contribution

1. **Fork du dépôt principal**
   - Allez sur le dépôt principal et cliquez sur "Fork".
   - Clonez votre fork sur votre machine locale :
     ```bash
     git clone https://github.com/votre-utilisateur/nom-du-projet.git
     ```
   - Configurez le dépôt distant principal (upstream) pour suivre les mises à jour :
     ```bash
     git remote add upstream https://github.com/projet-principal/nom-du-projet.git
     ```

2. **Créer une branche de travail**
   - Nommez vos branches de manière descriptive pour refléter la tâche effectuée :
     ```bash
     git checkout -b feature/nom-de-la-fonctionnalité
     ```

3. **Développer vos modifications**
   - Suivez les règles de codage décrites ci-dessous.
   - Commitez vos modifications avec des messages clairs :
     ```bash
     git commit -m "Ajoute [fonctionnalité] pour [objectif]"
     ```

4. **Soumettre une Pull Request**
   - Assurez-vous que votre branche est à jour avec la branche principale :
     ```bash
     git pull upstream main
     git push origin feature/nom-de-la-fonctionnalité
     ```
   - Allez sur le dépôt principal, puis créez une Pull Request (PR) en décrivant vos modifications.

---

## Règles de codage

Respectez les conventions suivantes pour garantir un code lisible et cohérent :

1. **Style**
   - Suivez les conventions de style spécifiques au langage utilisé .


2. **Commentaires**
   - Expliquez uniquement les parties complexes du code.
   - Documentez vos fonctions/méthodes avec des commentaires ou un système de documentation (e.g., JSDoc, docstrings).

3. **Structure**
   - Organisez les fichiers selon l’architecture définie dans le projet.
   - Évitez le code dupliqué et privilégiez les fonctions réutilisables.

---

## Tests et validation

Avant de soumettre une contribution, assurez-vous de respecter les étapes suivantes :

1. **Tests unitaires**
   - Écrivez ou mettez à jour les tests pour couvrir vos modifications.
   - Assurez-vous que tous les tests passent :


2. **Validation**
   - Utilisez les outils d’analyse statique pour valider votre code (Sonarlint).
   - Vérifiez que le code respecte les règles de linting :

---

## Communication

La communication est essentielle pour le succès de ce projet. Voici comment rester aligné avec l’équipe :

1. **Outils de communication**
   - Nous utilisons [Discord] pour les discussions en temps réel.
   - Consultez régulièrement les issues GitHub pour des mises à jour importantes.

2. **Règles de communication**
   - Soyez respectueux et constructif dans vos échanges.
   - Si vous avez une question, vérifiez la documentation et les issues avant de demander de l’aide.

---

## Problèmes et demandes de fonctionnalités

1. **Signaler un problème**
   - Ouvrez une *issue* décrivant le problème rencontré de manière claire et concise.
   - Fournissez des informations utiles (logs, captures d’écran, étapes pour reproduire le problème).

2. **Suggérer une fonctionnalité**
   - Créez une *issue* avec le tag `enhancement`.
   - Expliquez pourquoi cette fonctionnalité est utile et comment elle pourrait être implémentée.

---

## Remerciements

Nous apprécions chaque contribution, qu’elle soit petite ou grande. Merci de nous aider à faire de ce projet un succès !

Si vous avez des questions, n’hésitez pas à contacter les mainteneurs ou à ouvrir une *issue*.