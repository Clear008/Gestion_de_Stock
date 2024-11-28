package com.sp.Program;

import java.util.Scanner;

public class Program {
    static int maxValue = 100;
    static int[] codeProduits = new int[maxValue];
    static String[] nomProduits = new String[maxValue];
    static int[] quantites = new int[maxValue];
    static double[] prixProduits = new double[maxValue];

    static void printMenu() {
        System.out.println("===== Menu ===== ");
        System.out.println("1. Ajouter un produit.");
        System.out.println("2. Modifier un produit.");
        System.out.println("3. Supprimer un produit.");
        System.out.println("4. Afficher la liste des produits.");
        System.out.println("5. Recherche de produit.");
        System.out.println("6. Calcul de la valeur totale du stock.");
        System.out.println("0. Quitter.");
    }

    static int rechercherProduit(String nom) {
        for(int i = 0; i < maxValue; i++) {
            if (nomProduits[i] != null && nomProduits[i].equals(nom)) {
                return i;
            }
        }
        return -1;
    }

    static int rechercherProduitParCode(int code) {
        for (int i = 0; i < maxValue; i++) {
            if (codeProduits[i] == code) {
                return i;
            }
        }
        return -1;
    }

    static void ajouterProduit(int code, String nom, int quantite, double prix) {

        int indice = -1;
        for (int i = 0; i < codeProduits.length; i++) {
            if (codeProduits[i] == 0) {
                indice = i;
                break;
            }
        }
        if (indice == -1) {
            System.out.println("Error:Tableau plein");
            return;
        }
        codeProduits[indice] = code;
        nomProduits[indice] = nom;
        quantites[indice] = quantite;
        prixProduits[indice] = prix;
        System.out.println("Produit ajouté avec succès !");

    }

    static void afficherProduits() {
        System.out.println("===== Liste des Produits =====");
        System.out.println("Code\tNom\tQuantite\tPrix");
        boolean produitTrouve = false;
        for (int i = 0; i < codeProduits.length; i++) {
            if (codeProduits[i] != 0) {
                produitTrouve = true;
                System.out.println(codeProduits[i]+"\t"+nomProduits[i]+"\t"+quantites[i]+"\t"+prixProduits[i]);
            }
        }
        if (!produitTrouve) {
            System.out.println("Aucun produit disponible.");
        }
    }
    static void modifierProduit(int code, String nouveauNom, int nouvelleQuantite, double nouveauPrix) {
        int indice = rechercherProduitParCode(code);
        if (indice == -1) {
            System.out.println("Produit introuvable.");
            return;
        }
        nomProduits[indice] = nouveauNom;
        quantites[indice] = nouvelleQuantite;
        prixProduits[indice] = nouveauPrix;
        System.out.println("Produit modifié avec succès !");
    }

    static void supprimerProduit(int code) {
        int indice = rechercherProduitParCode(code);
        if (indice == -1) {
            System.out.println("Produit introuvable.");
            return;
        }
        codeProduits[indice] = 0;
        nomProduits[indice] = null;
        quantites[indice] = 0;
        prixProduits[indice] = 0.0;
        System.out.println("Produit supprimé avec succès !");
    }

    static void calculerValeurStock() {
        double valeurTotale = 0;
        for (int i = 0; i < codeProduits.length; i++) {
            if (codeProduits[i] != 0) {
                valeurTotale += quantites[i] * prixProduits[i];
            }
        }
        System.out.println("Valeur totale du stock : " + valeurTotale);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("===== Application de Gestion de Stock =====");
        //afficherProduits(codeProduits, nomProduits, quantites, prix);
        int choix = -1;
        String nom;
        int code;
        int quantite;
        double prix;
        int indice;
        do {
            printMenu();
            System.out.println("Choisissez une option:");
            choix = sc.nextInt();sc.nextLine();
            switch (choix) {
                case 1:
                    System.out.println("===== Ajouter un Produit =====");

                    System.out.println("Veuillez entrer un code");
                    code = sc.nextInt();sc.nextLine();

                    System.out.println("Veuillez entrer un nom");
                    nom=sc.nextLine();

                    System.out.println("Veuillez entrer la quantite");
                    quantite=sc.nextInt();

                    System.out.println("Veuillez entrer le prix");
                    prix=sc.nextDouble();

                    ajouterProduit(code, nom, quantite, prix);
                    break;
                case 2:
                    System.out.println("===== Modifier un Produit =====");
                    System.out.println("Veuillez entrer le code du produit à modifier:");
                    code = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Veuillez entrer le nouveau nom:");
                    String nouveauNom = sc.nextLine();
                    System.out.println("Veuillez entrer la nouvelle quantite:");
                    int nouvelleQuantite = sc.nextInt();
                    System.out.println("Veuillez entrer le nouveau prix:");
                    double nouveauPrix = sc.nextDouble();
                    modifierProduit(code, nouveauNom, nouvelleQuantite, nouveauPrix);
                    break;
                case 3:
                    System.out.println("===== Supprimer un Produit =====");
                    System.out.println("Veuillez entrer le code du produit à supprimer:");
                    code = sc.nextInt();
                    supprimerProduit(code);
                    break;
                case 4:
                    afficherProduits();
                    break;
                case 5:
                    System.out.println("Veuillez entrer le nom a rechercher:");
                    nom = sc.nextLine();
                    indice= rechercherProduit(nom);
                    if (indice != -1) {
                        System.out.println("Produit trouve");
                        System.out.println("Code:"+codeProduits[indice]);
                        System.out.println("Nom:"+nomProduits[indice]);
                        System.out.println("Quantite:"+quantites[indice]);
                        System.out.println("Prix:"+prixProduits[indice]);
                    }
                    else {
                        System.out.println("Produit non trouve");
                    }
                    break;
                case 6:
                    calculerValeurStock();
                    break;
                case 0:
                    System.out.println("Session terminee");
                    break;
                default:
                    System.out.println("Veuillez choisir une option");

            }
        }
        while (choix != 0);
    }
}