Application de Gestion de Stock (Sans Programmation Orientée Objet)
Contexte :
Tu es amené à développer une application en Java pour gérer le stock de produits d'une petite boutique.
Cette application permettra d'ajouter, modifier, supprimer et afficher des produits en utilisant
uniquement des variables primitives, des tableaux, et des méthodes statiques.
Objectifs de l'application :
1. Ajouter un produit : Ajouter un nouveau produit dans l'inventaire.
2. Modifier un produit : Modifier les informations d'un produit existant.
3. Supprimer un produit : Retirer un produit de l'inventaire.
4. Afficher la liste des produits : Voir la liste des produits en stock avec leurs détails.
5. Recherche de produit : Rechercher un produit par son nom.
6. Calcul de la valeur totale du stock : Calculer la valeur totale des produits en stock.
Spécifications Techniques :
Structure des données :
Utiliser des tableaux parallèles pour stocker les informations des produits
▪ int[] codesProduits : Contiendra les codes uniques pour chaque produit.
▪ String[] nomsProduits : Contiendra les noms des produits.
▪ int[] quantites : Contiendra les quantités en stock pour chaque produit.
▪ double[] prix : Contiendra les prix unitaires de chaque produit.
Limiter la taille des tableaux (par exemple, 100 produits maximum).
Chaque produit sera représenté par une même position dans chaque tableau.
Méthodes statiques à implémenter :
▪ printMenu() : afficher le menu.
▪ ajouterProduit(int code, String nom, int quantite, double prix) : Ajouter un produit dans les
tableaux.
▪ modifierProduit(int code, String nouveauNom, int nouvelleQuantite, double nouveauPrix) :
Modifier les informations d'un produit existant dans les tableaux.
▪ supprimerProduit(int code) : Supprimer un produit des tableaux.
▪ afficherProduits() : Afficher la liste complète des produits en utilisant les tableaux.
▪ rechercherProduit(String nom) : Rechercher un produit par son nom.
▪ calculerValeurStock() : Calculer la valeur totale du stock.

Utilisation de la console :
L'application doit être interactive, avec un menu de navigation pour chaque fonctionnalité.
L'utilisateur entrera les informations nécessaires via la console (code produit, nom, quantité, prix).


![Capture](https://github.com/user-attachments/assets/fb67da5a-51e7-4b71-be40-15e3c7e77bf6)

