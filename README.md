# Exercice 1 - Simuler un Décollage Spatial en Java

**Concepts liés :** Variables, Boucles, Conditions, Calculs mathématiques

## Description de l'exercice :

1. Création de la Classe Rocket :

* Commencez par créer une classe Java appelée "Rocket".
* Déclarez des variables pour la masse de la fusée (en kg), la poussée du moteur (en newtons), et la hauteur initiale de la fusée (en mètres).

2. Méthode pour le Décollage :

* Ajoutez une méthode appelée "launch" qui simule le décollage de la fusée.
* Utilisez une boucle pour représenter le passage du temps pendant le décollage. Par exemple, une boucle for pour chaque seconde.

3. Calculs de la Physique du Mouvement :

* À chaque itération de la boucle, mettez à jour la vitesse de la fusée en utilisant la formule de la physique du mouvement : vitesse = accélération * temps.
* Mettez à jour la hauteur de la fusée en utilisant la formule de la cinématique : hauteur = hauteur initiale + (vitesse initiale * temps) + (0.5 * accélération * temps^2).

4. Gestion de la Perte de Carburant :

* Introduisez une variable pour représenter le carburant de la fusée.
* À chaque itération, réduisez la quantité de carburant utilisée.

5. Conditions d'Arrêt du Décollage :

* Ajoutez des conditions pour arrêter le décollage lorsque la hauteur de la fusée atteint une certaine valeur ou lorsque le carburant est épuisé.

### Découpage de la Tâche :

1. Étape par Étape :

* Commencez par déclarer les variables de base dans la classe Rocket.
* Ensuite, implémentez la boucle de base pour représenter le temps pendant le décollage.
* Ajoutez les calculs de base de la physique du mouvement.
* Intégrez la gestion du carburant et les conditions d'arrêt.

2. Validation :

* Ajoutez des instructions d'affichage pour vérifier les valeurs de la vitesse, de la hauteur, et du carburant à chaque itération.
* Exécutez le programme et ajustez les paramètres pour observer différents résultats.

3. Optimisation :

* Explorez des moyens d'optimiser votre code, peut-être en utilisant des méthodes séparées pour les calculs, ou en ajoutant des commentaires pour expliquer le code.

4. Extension :

* Pour une extension, ajoutez la possibilité de paramétrer la puissance du moteur, la masse de la fusée, etc., en tant qu'arguments lors de la création de l'objet Rocket.

En suivant ces étapes, vous allez créer une simulation de décollage spatial en utilisant les concepts de base de Java et en mettant en pratique des notions de physique et de mathématiques.




