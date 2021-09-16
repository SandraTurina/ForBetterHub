package controller;

import model.Beverage;
import model.BeverageCatalogus;

public class PrototypeCatalogusLauncher {
    public static void main(String[] args) {

        BeverageCatalogus beverageCatalogus = new BeverageCatalogus();

        Beverage beverageClone1 = beverageCatalogus.get("Heineken Zomerbier");
        Beverage beverageClone2 = beverageCatalogus.get("White Chardonnay");
        Beverage beverageClone3 = beverageCatalogus.get("White Chardonnay");

        // TODO OPDRACHT 5 Haal je eigen Vodka uit de Catalogus op
        Beverage beverageClone4 = beverageCatalogus.get("From Russia With Love");

        //TODO OPDRACHT 6 Vergelijk je Vodka met de andere drankjes.
        compareCatalogusClones(beverageClone1, beverageClone2, beverageClone3, beverageClone4);

    }
    private static void compareCatalogusClones(Beverage beverage1, Beverage beverage2, Beverage beverage3, Beverage beverage4){
        if (beverage1 != beverage2 && !beverage1.equals(beverage2)) {
            System.out.println("Heineken Zomerbier != White Chardonnay (yay!)");
        } else {
            System.out.println("Heineken Zomerbier == White Chardonnay (booo!)");
        }

        if (beverage2 != beverage3) {
            System.out.println("White Chardonnays are two different objects (yay!)");
            if (beverage2.equals(beverage3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Wine objects are the same (booo!)");
        }

        // je kunt ook je vodka met 1 andere beverage vergelijken of met een identieke clone zoals het voorbeeld van de twee White Chardonnays
        if(beverage4 != beverage1 && beverage4 != beverage2 && beverage4 != beverage3
                && !beverage4.equals(beverage1) && !beverage4.equals(beverage2) && !beverage4.equals(beverage3)) {
            System.out.println("From Russia With Love != Heineken Zomerbier or a White Chardonnay (yay!)");
        } else {
            System.out.println("From Russia With Love == Heineken Zomerbier or a White Chardonnay (booo!)");
        }

    }
}
