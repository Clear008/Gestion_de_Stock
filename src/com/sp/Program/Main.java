package com.sp.Program;

public class Main {
    // Méthode pour afficher les produits
    static void afficherProduits(int[] codeProduits, String[] nomProduits, int[] quantites, double[] prix) {
        System.out.println("===== Liste des Produits =====");
        boolean hasProducts = false;

        for (int i = 0; i < codeProduits.length; i++) {
            if (codeProduits[i] != 0) { // Vérifie si un produit existe à cet index
                System.out.println("Code: " + codeProduits[i] +
                        ", Nom: " + nomProduits[i] +
                        ", Quantité: " + quantites[i] +
                        ", Prix: " + prix[i]);
                hasProducts = true;
            }
        }

        if (!hasProducts) {
            System.out.println("Aucun produit en stock.");
        }
    }

    // Méthode pour afficher le menu
    static void printMenu() {
        System.out.println("===== Menu de Gestion de Stock =====");
        System.out.println("1. Ajouter un produit");
        System.out.println("2. Modifier un produit");
        System.out.println("3. Supprimer un produit");
        System.out.println("4. Afficher la liste des produits");
        System.out.println("5. Rechercher un produit");
        System.out.println("6. Calculer la valeur totale du stock");
        System.out.println("0. Quitter");
    }

    public static void main(String[] args) {
        // Initialisation des tableaux
        int maxValue = 100;
        int[] codeProduits = new int[maxValue];
        String[] nomProduits = new String[maxValue];
        int[] quantites = new int[maxValue];
        double[] prix = new double[maxValue];

        // Exemple de données pour tester
        codeProduits[0] = 101;
        nomProduits[0] = "Produit A";
        quantites[0] = 10;
        prix[0] = 15.99;

        codeProduits[1] = 102;
        nomProduits[1] = "Produit B";
        quantites[1] = 5;
        prix[1] = 9.50;

        // Afficher le menu
        printMenu();

        // Afficher la liste des produits
        afficherProduits(codeProduits, nomProduits, quantites, prix);
    }
}
